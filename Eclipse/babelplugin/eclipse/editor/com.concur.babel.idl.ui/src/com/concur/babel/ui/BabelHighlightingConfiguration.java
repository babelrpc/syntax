package com.concur.babel.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class BabelHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String KEYWORD_ID = "keyword";
	public static final String IDENTIFIER = "BabelIdentifier";
	public static final String VALUE = "BabelValue";
	public static final String PROPERTY = "BabelProperty";
	public static final String COMMENT_ID = "comment";
	public static final String ATTRIBUTE_ID = "BabelAttribute";
	
	public void configure(IHighlightingConfigurationAcceptor acceptor) {

		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", getKeywordTextStyle());
		acceptor.acceptDefaultHighlighting(IDENTIFIER, "Identifier", getIdStyle());
		acceptor.acceptDefaultHighlighting(VALUE, "Value", getValueStyle());
		acceptor.acceptDefaultHighlighting(PROPERTY, "Property Name", getDefaultTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(ATTRIBUTE_ID, "Attribute", getValueStyle());

	}
	
	private TextStyle getDefaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}	
	
	private TextStyle getKeywordTextStyle() {
		TextStyle textStyle = getDefaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}	
	
	private TextStyle getIdStyle() {
		
		TextStyle textStyle = getDefaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		textStyle.setStyle(SWT.ITALIC);		
		return textStyle;
		
	}
	
	private TextStyle getValueStyle() {		
		TextStyle textStyle = getDefaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));		
		return textStyle;		
	}	
	
}
