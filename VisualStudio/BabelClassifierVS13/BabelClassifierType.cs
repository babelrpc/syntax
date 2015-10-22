using System.ComponentModel.Composition;
using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Utilities;

namespace BabelRpc.Babel.Language
{
	internal static class OrdinaryClassificationDefinition
	{
		#region Type definition

		[Export(typeof(ClassificationTypeDefinition))]
		[Name("BabelLiteral")]
		internal static ClassificationTypeDefinition BabelLiteral = null;

		[Export(typeof(ClassificationTypeDefinition))]
		[Name("BabelType")]
		internal static ClassificationTypeDefinition BabelType = null;


		[Export(typeof(ClassificationTypeDefinition))]
		[Name("BabelKeyword")]
		internal static ClassificationTypeDefinition BabelKeyword = null;

		[Export(typeof(ClassificationTypeDefinition))]
		[Name("BabelOther")]
		internal static ClassificationTypeDefinition BabelOther = null;


		[Export(typeof(ClassificationTypeDefinition))]
		[Name("BabelComment")]
		internal static ClassificationTypeDefinition BabelComment = null;

		[Export(typeof(ClassificationTypeDefinition))]
		[Name("BabelContext")]
		internal static ClassificationTypeDefinition BabelContext = null;

		[Export(typeof(ClassificationTypeDefinition))]
		[Name("BabelString")]
		internal static ClassificationTypeDefinition BabelString = null;

		#endregion
	}
}
