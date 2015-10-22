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
	public enum BabelTokenContext { Other, /*Attribute,*/ BabelContext, CommentSingleLine, CommentMultiLine, StringConst, CharConst }
	public enum BabelTokenType { BabelLiteral, BabelType, BabelKeyword, BabelOther, Comment, StringConst, BabelContext }

	internal struct LineContext
	{
		public BabelTokenContext Context;
		public BabelTokenContext CommentContext;
	}

	internal class Analizer
	{
		public Analizer(int locationStart, ITextSnapshotLine snapshotSpan, LineContext startContext, IClassificationTypeRegistryService typeService, List<ITagSpan<ClassificationTag>> result)
		{
			m_tb = new TokenBuilder(locationStart, snapshotSpan, typeService, result);
			m_currentContext = startContext.Context;
			m_commentContext = startContext.CommentContext;
		}

		TokenBuilder m_tb;
		bool m_isEscape;
		bool m_isSlash;
		BabelTokenContext m_currentContext;
		BabelTokenContext m_commentContext;
		public BabelTokenContext Context { get { return m_commentContext; } }

		/// <summary>
		/// 
		/// </summary>
		/// <returns>Next line start context</returns>
		public LineContext FinalizeLine()
		{
			m_tb.PutToken(m_currentContext);
			if(m_currentContext == BabelTokenContext.CommentSingleLine)
			{
				m_currentContext = m_commentContext;
				m_commentContext = BabelTokenContext.Other;
			}

			if(m_currentContext != BabelTokenContext.CommentMultiLine)
			{
				//Only multiline comments can be carried to a new line
				m_currentContext = BabelTokenContext.Other; 
				m_commentContext = BabelTokenContext.Other;
			}
			return new LineContext { Context = m_currentContext, CommentContext = m_commentContext };
		}

		public void ProcessChar(char c)
		{
			switch(m_currentContext)
			{
				case BabelTokenContext.StringConst:
					m_tb.SkipChar();
					switch(c)
					{
						case '\\':
							m_isEscape = !m_isEscape;
							break;
						case '"':
							if(!m_isEscape)
							{
								m_tb.PutToken(BabelTokenType.StringConst);
								m_currentContext = BabelTokenContext.Other;
								m_isEscape = false;
							}
							break;
						default:
							m_isEscape = false;
							break;
					}
					break;
				case BabelTokenContext.CharConst:
					m_tb.SkipChar();
					switch(c)
					{
						case '\\':
							m_isEscape = !m_isEscape;
							break;
						case '\'':
							if(!m_isEscape)
							{
								m_tb.PutToken(BabelTokenType.StringConst);
								m_currentContext = BabelTokenContext.Other;
								m_isEscape = false;
							}
							break;
						default:
							m_isEscape = false;
							break;
					}
					break;
				case BabelTokenContext.CommentMultiLine:
					m_tb.SkipChar();
					switch(c)
					{
						case '/':
							if(m_isEscape)
							{
								m_tb.PutToken(BabelTokenType.Comment);
								m_isEscape = false;
								m_currentContext = m_commentContext;
							}
							break;
						case '*':
							m_isEscape = true;
							break;
						default:
							m_isEscape = false;
							break;
					}
					break;
				case BabelTokenContext.CommentSingleLine:
					m_tb.SkipChar();
					break;
				/*case BabelTokenContext.Attribute:
					m_tb.SkipChar();
					switch(c)
					{
						case ']':
							m_tb.PutToken(BabelTokenContext.Attribute);
							m_currentContext = BabelTokenContext.Other;
							break;
						default: break;
					}
					break;*/
				default:
					switch(c)
					{
						case ' ':
						case '\t':
						case '(':
						case ')':
						case '{':
						case '}':
						case '[':
						case ']':
						case ',':
						case ';':
						case '<':
						case '>':
						case '=':
							m_tb.PutToken(m_currentContext);
							m_tb.SkipChar();
							m_tb.PutToken(BabelTokenContext.Other);
							m_isSlash = false;
							break;
						case '/':
							if(m_isSlash)
							{
								m_tb.SkipChar();
								m_isSlash = false;
								m_commentContext = m_currentContext;
								m_currentContext = BabelTokenContext.CommentSingleLine;
							}
							else
							{
								m_tb.PutToken(m_currentContext);
								m_tb.SkipChar();
								m_isSlash = true;
							}
							break;
						case '*':
							if(m_isSlash)
							{
								m_commentContext = m_currentContext;
								m_currentContext = BabelTokenContext.CommentMultiLine;
							}

							m_tb.SkipChar();
							m_isSlash = false;
							break;
						case '@':
							m_tb.PutToken(m_currentContext);
							m_tb.SkipChar();
							m_currentContext = BabelTokenContext.BabelContext;
							m_isSlash = false;
							break;
						/*case '[':
							m_tb.PutToken(m_currentContext);
							m_tb.SkipChar();
							m_currentContext = BabelTokenContext.Attribute;
							m_isSlash = false;
							break;*/
						case '"':
							m_tb.PutToken(m_currentContext);
							m_tb.SkipChar();
							m_currentContext = BabelTokenContext.StringConst;
							m_isSlash = false;
							break;
						case '\'':
							m_tb.PutToken(m_currentContext);
							m_tb.SkipChar();
							m_currentContext = BabelTokenContext.CharConst;
							m_isSlash = false;
							break;
						default:
							m_tb.AddChar(c);
							m_isSlash = false;
							break;
					}
					break;
			}
		}
	}
	internal class TokenBuilder
	{
		private ITextSnapshotLine m_snapshotSpan;
		private int m_locationStart;
		private int m_charIndexCurrent;
		private List<char> m_buffer;
		private List<ITagSpan<ClassificationTag>> m_result;

		private IDictionary<BabelTokenType, IClassificationType> m_babelTypes;

		public TokenBuilder(int locationStart, ITextSnapshotLine snapshotSpan, IClassificationTypeRegistryService typeService, List<ITagSpan<ClassificationTag>> result)
		{
			m_buffer = new List<char>();
			m_charIndexCurrent = 0;
			m_locationStart = locationStart;
			m_snapshotSpan = snapshotSpan;
			m_result = result;
			m_babelTypes = new Dictionary<BabelTokenType, IClassificationType>();
			m_babelTypes[BabelTokenType.BabelKeyword] = typeService.GetClassificationType("BabelKeyword");
			m_babelTypes[BabelTokenType.BabelLiteral] = typeService.GetClassificationType("BabelLiteral");
			m_babelTypes[BabelTokenType.BabelOther] = typeService.GetClassificationType("BabelOther");
			m_babelTypes[BabelTokenType.BabelType] = typeService.GetClassificationType("BabelType");
			m_babelTypes[BabelTokenType.Comment] = typeService.GetClassificationType("BabelComment");
			m_babelTypes[BabelTokenType.BabelContext] = typeService.GetClassificationType("BabelContext");
			m_babelTypes[BabelTokenType.StringConst] = typeService.GetClassificationType("BabelString");
		}

		public void AddChar(char c)
		{
			m_buffer.Add(c);
			m_charIndexCurrent++;
		}

		public void SkipChar()
		{
			m_charIndexCurrent++;
		}

		public int PutToken(BabelTokenContext context)
		{
			BabelTokenType tt;
			switch(context)
			{
				case BabelTokenContext.CharConst:
				case BabelTokenContext.StringConst:
					tt = BabelTokenType.StringConst;
					break;
				/*case BabelTokenContext.Attribute:
					tt = BabelTokenType.BabelOther;
					break;*/
				case BabelTokenContext.CommentSingleLine:
				case BabelTokenContext.CommentMultiLine:
					tt = BabelTokenType.Comment;
					break;
				case BabelTokenContext.BabelContext:
					tt = BabelTokenType.BabelContext;
					break;
				default:
					tt = Classify();
					break;

			}
			return PutToken(tt);
		}
		/// <summary>
		/// Adds current token to the token list
		/// </summary>
		/// <param name="tTypeModifier"></param>
		/// <returns>Next position</returns>
		public int PutToken(BabelTokenType tTypeModifier)
		{
			if(tTypeModifier != BabelTokenType.BabelOther)
			{
				var tokenSpan = new SnapshotSpan(m_snapshotSpan.Snapshot, new Span(m_locationStart, m_charIndexCurrent));
				//if(tokenSpan.IntersectsWith(m_snapshotSpan))
				//{
				m_result.Add(new TagSpan<ClassificationTag>(tokenSpan, new ClassificationTag(m_babelTypes[tTypeModifier])));
				//}
			}
			m_locationStart += m_charIndexCurrent;
			m_charIndexCurrent = 0;
			return m_locationStart;
		}

		private BabelTokenType Classify()
		{
			string token = new string(m_buffer.ToArray());
			m_buffer.Clear();
			switch(token)
			{
				case "import":
				case "namespace":
				case "csharp":
				case "java":
				case "python":
				case "ruby":
				case "go":
				case "javascript":
				case "asp":
				case "php":
				case "ios":
				case "const":
				case "enum":
				case "abstract":
				case "struct":
				case "extends":
				case "void":
				case "service":
				case "as":
					return BabelTokenType.BabelKeyword;
				case "bool":
				case "byte":
				case "uint16":
				case "uint32":
				case "uint64":
				case "sbyte":
				case "int16":
				case "int32":
				case "int64":
				case "float32":
				case "float64":
				case "string":
				case "datetime":
				case "decimal":
				case "char":
				case "binary":
				case "list":
				case "map":
					return BabelTokenType.BabelType;
				case "true":
				case "false":
					return BabelTokenType.BabelLiteral;
				default:
					return BabelTokenType.BabelOther;
			}
		}
	}
}
