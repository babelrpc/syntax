package com.concur.babel.serializer;

import com.concur.babel.services.BabelIdlGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BabelIdlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BabelIdlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConstProperty_LineTermParserRuleCall_4_q;
	protected AbstractElementAlias match_EnumProperty_LineTermParserRuleCall_4_q;
	protected AbstractElementAlias match_Property_LineTermParserRuleCall_4_q;
	protected AbstractElementAlias match_ServiceMethod_LineTermParserRuleCall_7_q;
	protected AbstractElementAlias match_Struct_AbstractKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BabelIdlGrammarAccess) access;
		match_ConstProperty_LineTermParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getConstPropertyAccess().getLineTermParserRuleCall_4());
		match_EnumProperty_LineTermParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getEnumPropertyAccess().getLineTermParserRuleCall_4());
		match_Property_LineTermParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getLineTermParserRuleCall_4());
		match_ServiceMethod_LineTermParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getServiceMethodAccess().getLineTermParserRuleCall_7());
		match_Struct_AbstractKeyword_3_q = new TokenAlias(false, true, grammarAccess.getStructAccess().getAbstractKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getLineTermRule())
			return getLineTermToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * LineTerm:
	 *     (',' | ';')
	 * ;
	 */
	protected String getLineTermToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ConstProperty_LineTermParserRuleCall_4_q.equals(syntax))
				emit_ConstProperty_LineTermParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumProperty_LineTermParserRuleCall_4_q.equals(syntax))
				emit_EnumProperty_LineTermParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_LineTermParserRuleCall_4_q.equals(syntax))
				emit_Property_LineTermParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ServiceMethod_LineTermParserRuleCall_7_q.equals(syntax))
				emit_ServiceMethod_LineTermParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Struct_AbstractKeyword_3_q.equals(syntax))
				emit_Struct_AbstractKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     LineTerm?
	 */
	protected void emit_ConstProperty_LineTermParserRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LineTerm?
	 */
	protected void emit_EnumProperty_LineTermParserRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LineTerm?
	 */
	protected void emit_Property_LineTermParserRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LineTerm?
	 */
	protected void emit_ServiceMethod_LineTermParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'abstract'?
	 */
	protected void emit_Struct_AbstractKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
