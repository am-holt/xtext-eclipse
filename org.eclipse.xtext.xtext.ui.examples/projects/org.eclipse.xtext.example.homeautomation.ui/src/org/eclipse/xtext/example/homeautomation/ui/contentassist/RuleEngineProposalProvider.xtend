/*
 * generated by Xtext 2.9.1-SNAPSHOT
 */
package org.eclipse.xtext.example.homeautomation.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.xbase.typesystem.IExpressionScope

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class RuleEngineProposalProvider extends AbstractRuleEngineProposalProvider {

	override completeXBlockExpression_Expressions(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		completeWithinBlock(model, context, acceptor);
	}

	override completeXSwitchExpression_Default(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		createLocalVariableAndImplicitProposals(model, IExpressionScope.Anchor.WITHIN, context, acceptor);
	}
}