package com.concur.babel.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

public class BabelIdlProposalProvider extends AbstractBabelIdlProposalProvider {

	@Override
    public void complete_EnumProperty(EObject model, RuleCall ruleCall, final ContentAssistContext context, ICompletionProposalAcceptor acceptor) {	
		
		String text = "EnumName";
		ICompletionProposal proposal = createCompletionProposal(text, text, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			ConfigurableCompletionProposal configurable = (ConfigurableCompletionProposal)proposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(text.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
		}
		acceptor.accept(proposal);		
				
    }
	
	@Override
	public void complete_EnumOrdinal(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String text = "Ordinal";
		ICompletionProposal proposal = createCompletionProposal(text, text, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			ConfigurableCompletionProposal configurable = (ConfigurableCompletionProposal)proposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(text.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
		}
		acceptor.accept(proposal);	
	}	

	@Override
	protected boolean doCreateIdProposals() {
		return false;
	}

	@Override
	protected boolean doCreateIntProposals() {
		return false;
	}

	@Override
	protected boolean doCreateStringProposals() {
		return false;
	}
	
}
