using System.ComponentModel.Composition;
using System.Windows.Media;
using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Utilities;

namespace BabelRpc.Babel.Language
{
	#region Format definition
	[Export(typeof(EditorFormatDefinition))]
	[ClassificationType(ClassificationTypeNames = "BabelKeyword")]
	[Name("BabelKeyword")]
	//this should be visible to the end user
	[UserVisible(true)]
	//set the priority to be after the default classifiers
	[Order(Before = Priority.Default)]
	internal sealed class BabelKeyword : ClassificationFormatDefinition
	{
		/// <summary>
		/// Defines the visual format for the "ordinary" classification type
		/// </summary>
		public BabelKeyword()
		{
			this.DisplayName = "Babel Keyword"; //human readable version of the name
			this.ForegroundColor = Colors.Green;
			this.IsBold = true;
		}
	}

	[Export(typeof(EditorFormatDefinition))]
	[ClassificationType(ClassificationTypeNames = "BabelLiteral")]
	[Name("BabelLiteral")]
	//this should be visible to the end user
	[UserVisible(true)]
	//set the priority to be after the default classifiers
	[Order(Before = Priority.Default)]
	internal sealed class BabelLiteral : ClassificationFormatDefinition
	{
		/// <summary>
		/// Defines the visual format for the "ordinary" classification type
		/// </summary>
		public BabelLiteral()
		{
			this.DisplayName = "Babel Literal"; //human readable version of the name
			this.ForegroundColor = Colors.Blue;
		}
	}
	
	[Export(typeof(EditorFormatDefinition))]
	[ClassificationType(ClassificationTypeNames = "BabelOther")]
	[Name("BabelOther")]
	//this should be visible to the end user
	[UserVisible(true)]
	//set the priority to be after the default classifiers
	[Order(Before = Priority.Default)]
	internal sealed class BabelOther : ClassificationFormatDefinition
	{
		/// <summary>
		/// Defines the visual format for the "ordinary" classification type
		/// </summary>
		public BabelOther()
		{
			this.DisplayName = "BabelOther"; //human readable version of the name
			this.ForegroundColor = Colors.Black;
		}
	}

	[Export(typeof(EditorFormatDefinition))]
	[ClassificationType(ClassificationTypeNames = "BabelType")]
	[Name("BabelType")]
	//this should be visible to the end user
	[UserVisible(true)]
	//set the priority to be after the default classifiers
	[Order(Before = Priority.Default)]
	internal sealed class BabelType : ClassificationFormatDefinition
	{
		/// <summary>
		/// Defines the visual format for the "ordinary" classification type
		/// </summary>
		public BabelType()
		{
			this.DisplayName = "Babel Type"; //human readable version of the name
			this.ForegroundColor = Colors.Teal;
		}
	}

	[Export(typeof(EditorFormatDefinition))]
	[ClassificationType(ClassificationTypeNames = "BabelComment")]
	[Name("BabelComment")]
	//this should be visible to the end user
	[UserVisible(true)]
	//set the priority to be after the default classifiers
	[Order(Before = Priority.Default)]
	internal sealed class BabelComment : ClassificationFormatDefinition
	{
		/// <summary>
		/// Defines the visual format for the "ordinary" classification type
		/// </summary>
		public BabelComment()
		{
			this.DisplayName = "Babel Comment"; //human readable version of the name
			this.ForegroundColor = Colors.DarkGray;
		}
	}

	[Export(typeof(EditorFormatDefinition))]
	[ClassificationType(ClassificationTypeNames = "BabelContext")]
	[Name("BabelContext")]
	//this should be visible to the end user
	[UserVisible(true)]
	//set the priority to be after the default classifiers
	[Order(Before = Priority.Default)]
	internal sealed class BabelContext : ClassificationFormatDefinition
	{
		/// <summary>
		/// Defines the visual format for the "ordinary" classification type
		/// </summary>
		public BabelContext()
		{
			this.DisplayName = "Babel Context"; //human readable version of the name
			this.ForegroundColor = Colors.Purple;
		}
	}

	[Export(typeof(EditorFormatDefinition))]
	[ClassificationType(ClassificationTypeNames = "BabelString")]
	[Name("BabelString")]
	//this should be visible to the end user
	[UserVisible(true)]
	//set the priority to be after the default classifiers
	[Order(Before = Priority.Default)]
	internal sealed class BabelString : ClassificationFormatDefinition
	{
		/// <summary>
		/// Defines the visual format for the "ordinary" classification type
		/// </summary>
		public BabelString()
		{
			this.DisplayName = "Babel String"; //human readable version of the name
			this.ForegroundColor = Colors.Brown;
		}
	}


	#endregion //Format definition
}
