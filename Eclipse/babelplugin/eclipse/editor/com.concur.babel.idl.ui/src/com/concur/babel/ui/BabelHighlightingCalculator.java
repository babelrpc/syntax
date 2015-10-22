package com.concur.babel.ui;

import org.eclipse.xtext.nodemodel.BidiIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.concur.babel.babelIdl.Attribute;
import com.concur.babel.babelIdl.ConstPropertyId;
import com.concur.babel.babelIdl.ConstValueType;
import com.concur.babel.babelIdl.DataTypeReference;
import com.concur.babel.babelIdl.EnumOrdinal;
import com.concur.babel.babelIdl.EnumPropertyId;
import com.concur.babel.babelIdl.PropertyValue;

public class BabelHighlightingCalculator implements ISemanticHighlightingCalculator {

	public void provideHighlightingFor(
		XtextResource resource,
		IHighlightedPositionAcceptor acceptor) 
	{
	
		if (resource == null || resource.getParseResult() == null) {
			return;
		}
		
		INode root = resource.getParseResult().getRootNode();
		BidiIterator<INode> it = root.getAsTreeIterable().iterator();
		
		while (it.hasNext()) {

			INode node = it.next();
			
			if (node.hasDirectSemanticElement()) {
				
				if (node.getSemanticElement() instanceof EnumPropertyId) {
					acceptor.addPosition(
						node.getOffset(), 
						node.getLength(), 
						BabelHighlightingConfiguration.IDENTIFIER);
				}
				
				if (node.getSemanticElement() instanceof EnumOrdinal) {
					acceptor.addPosition(
						node.getOffset(), 
						node.getLength(), 
						BabelHighlightingConfiguration.VALUE);					
				}
				
			}
			
			if (node instanceof CompositeNodeWithSemanticElement &&
				node.getSemanticElement() instanceof DataTypeReference)
			{
				acceptor.addPosition(
					node.getOffset(), 
					node.getLength(), 
					BabelHighlightingConfiguration.PROPERTY);				
			} else if (
				node.hasDirectSemanticElement() &&
				node.getSemanticElement() instanceof PropertyValue)
			{				
				acceptor.addPosition(
					node.getOffset(), 
					node.getLength(), 
					BabelHighlightingConfiguration.IDENTIFIER);
			} else if (
				node.hasDirectSemanticElement() &&
				node.getSemanticElement() instanceof ConstPropertyId)
			{				
				acceptor.addPosition(
					node.getOffset(), 
					node.getLength(), 
					BabelHighlightingConfiguration.IDENTIFIER);
			} else if (
				node.hasDirectSemanticElement() &&
				node.getSemanticElement() instanceof ConstValueType) 
			{
				acceptor.addPosition(
					node.getOffset(), 
					node.getLength(), 
					BabelHighlightingConfiguration.VALUE);
			} else if (
				node.hasDirectSemanticElement() &&
				node.getSemanticElement() instanceof Attribute) 
			{
				acceptor.addPosition(
					node.getOffset(), 
					node.getLength(), 
					BabelHighlightingConfiguration.ATTRIBUTE_ID);				
			}
			
		}		

	}

}
