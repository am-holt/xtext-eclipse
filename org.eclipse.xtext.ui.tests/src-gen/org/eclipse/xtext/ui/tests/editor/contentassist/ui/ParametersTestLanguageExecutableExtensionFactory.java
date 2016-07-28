/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.eclipse.xtext.ui.tests.ui.internal.TestsActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ParametersTestLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TestsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TestsActivator.getInstance().getInjector(TestsActivator.ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_PARAMETERSTESTLANGUAGE);
	}
	
}
