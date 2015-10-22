using System;
using System.Collections.Generic;
using System.ComponentModel.Composition;
using Microsoft.VisualStudio.Text;
using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Text.Editor;
using Microsoft.VisualStudio.Text.Tagging;
using Microsoft.VisualStudio.Utilities;

namespace BabelRpc.Babel.Language
{
	[Export(typeof(IViewTaggerProvider))]
	[ContentType("Babel")]
	[TagType(typeof(ClassificationTag))]
	internal sealed class BabelClassifierProvider : IViewTaggerProvider
	{

		[Export]
		[Name("Babel")]
		[BaseDefinition("code")]
		internal static ContentTypeDefinition BabelContentType = null;

		[Export]
		[FileExtension(".babel")]
		[ContentType("Babel")]
		internal static FileExtensionToContentTypeDefinition BabelFileType = null;

		[Import]
		internal IClassificationTypeRegistryService ClassificationTypeRegistry = null;

		[Import]
		internal IBufferTagAggregatorFactoryService aggregatorFactory = null;

		public ITagger<T> CreateTagger<T>(ITextView textView, ITextBuffer buffer) where T : ITag
		{
			if(textView.TextBuffer != buffer) return null;
			//ITagAggregator<BabelTokenTag> babelTagAggregator = aggregatorFactory.CreateTagAggregator<BabelTokenTag>(buffer);
			return new BabelClassifier(textView, buffer, ClassificationTypeRegistry) as ITagger<T>;
		}
	}

	internal sealed class BabelClassifier : ITagger<ClassificationTag>
	{
		ITextBuffer m_buffer;
		//ITagAggregator<BabelTokenTag> m_aggregator;
		ITextView m_textView;
		IClassificationTypeRegistryService m_typeService;
		
		internal BabelClassifier(ITextView textView, ITextBuffer buffer, IClassificationTypeRegistryService typeService)
		{
			m_buffer = buffer;
			m_textView = textView;
			m_typeService = typeService;
		}

		public event EventHandler<SnapshotSpanEventArgs> TagsChanged;
		

		/*public IEnumerable<ITagSpan<ClassificationTag>> GetTags(NormalizedSnapshotSpanCollection spans)
		{
			foreach(var tagSpan in this.m_aggregator.GetTags(spans))
			{
				var tagSpans = tagSpan.Span.GetSpans(spans[0].Snapshot);
				yield return new TagSpan<ClassificationTag>(tagSpans[0], new ClassificationTag(m_babelTypes[tagSpan.Tag.Type]));
			}
		}*/
		
		private Dictionary<int, LineContext> m_lineEndContext = new Dictionary<int, LineContext>();

		private LineContext GetPrevLineContext(int lineNumber)
		{
			//The previous non empty line
			LineContext res;
			for(int i = lineNumber - 1; i >= 0; i--)
			{
				if(m_lineEndContext.TryGetValue(i, out res))
				{
					System.Diagnostics.Debug.WriteLine("GetPrevLineContext  line {0}, context {1} ({2})", i, res.Context, res.CommentContext);
					return res;
				}
			}
			System.Diagnostics.Debug.WriteLine("GetPrevLineContext: not found");
			return new LineContext { CommentContext = BabelTokenContext.Other, Context = BabelTokenContext.Other };
		}

		private LineContext GetLineContext(int lineNumber)
		{
			LineContext res;
			if(m_lineEndContext.TryGetValue(lineNumber, out res))
			{
				return res;
			}
			return new LineContext { CommentContext = BabelTokenContext.Other, Context = BabelTokenContext.Other };
		}

		public IEnumerable<ITagSpan<ClassificationTag>> GetTags(NormalizedSnapshotSpanCollection spans)
		{
			var res = new List<ITagSpan<ClassificationTag>>();
			System.Diagnostics.Debug.WriteLine("GetTags: start");
			var changeNotification = new Dictionary<int, ITextSnapshotLine>();
			ITextSnapshotLine containingLine = null;
			foreach(SnapshotSpan curSpan in spans)
			{
				containingLine = curSpan.Start.GetContainingLine();

				changeNotification[containingLine.Start.Position] = null;

				var notifyNextLine = ProcessLine(res, containingLine);
				if(notifyNextLine != null)
				{
					int pos = notifyNextLine.Start.Position;
					if(!changeNotification.ContainsKey(pos))
					{
						changeNotification.Add(pos, notifyNextLine);
					}
				}
			}

			var handler = TagsChanged;
			if(handler != null)
			{
				foreach(var kv in changeNotification)
				{
					if(kv.Value != null)
					{
						handler(this, new SnapshotSpanEventArgs(new SnapshotSpan(kv.Value.Start, kv.Value.Length)));
						System.Diagnostics.Debug.WriteLine("Sending change notification for line {0} ({1}-{2})", kv.Value.LineNumber, kv.Value.Start.Position, kv.Value.End.Position);
					}
				}
			}
			System.Diagnostics.Debug.WriteLine("GetTags: done");
			return res;
		} //GetTags end

		private ITextSnapshotLine ProcessLine(List<ITagSpan<ClassificationTag>> res, ITextSnapshotLine containingLine)
		{
			int curLoc = containingLine.Start.Position;
			System.Diagnostics.Debug.WriteLine("GetTags: processing line {2} ({0} - {1})", containingLine.Start.Position, containingLine.End.Position, containingLine.LineNumber);
			string text = containingLine.GetText();

			var thisLineCtx = GetPrevLineContext(containingLine.LineNumber);
			
			var cp = new Analizer(curLoc, containingLine, thisLineCtx, m_typeService, res);

			for(int srcIdx = 0; srcIdx < text.Length; srcIdx++)
			{
				cp.ProcessChar(text[srcIdx]);
			}
			var nextLineCtx = cp.FinalizeLine();

			System.Diagnostics.Debug.WriteLine("This line end context {2}: {0} ({1})", nextLineCtx.Context, nextLineCtx.CommentContext, containingLine.LineNumber);

			var prevCtxOld = GetLineContext(containingLine.LineNumber);
			bool needToNotify = nextLineCtx.Context != prevCtxOld.Context && (nextLineCtx.Context == BabelTokenContext.CommentMultiLine || prevCtxOld.Context == BabelTokenContext.CommentMultiLine); //If state is carried to the next line
			
			m_lineEndContext[containingLine.LineNumber] = nextLineCtx;

			if(needToNotify)
			{
				try
				{
					//Looking for a first non-whitespace line
					
					int len = containingLine.Snapshot.Length;
					for(int pos = containingLine.EndIncludingLineBreak.Position; pos < len; pos ++)
					{
						string txt = containingLine.Snapshot.GetText(pos, 1);
						if (!string.IsNullOrWhiteSpace(txt))
						{
							var nLine= containingLine.Snapshot.GetLineFromPosition(pos);
							System.Diagnostics.Debug.WriteLine("Notify line {0}", nLine.LineNumber);
							for(int i = containingLine.LineNumber + 1; i < nLine.LineNumber; i++)
							{
								m_lineEndContext.Remove(i);
							}
							return nLine;
						}
					}
				}
				catch
				{
					//Well, what can I do...
				}
			}
			return null;
		}
	}
}
