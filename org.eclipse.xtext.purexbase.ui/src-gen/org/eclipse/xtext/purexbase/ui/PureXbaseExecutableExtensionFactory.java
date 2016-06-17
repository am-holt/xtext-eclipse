/*
 * generated by Xtext
 */
package org.eclipse.xtext.purexbase.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.xtext.purexbase.ui.internal.PureXbaseActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PureXbaseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PureXbaseActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PureXbaseActivator.getInstance().getInjector(PureXbaseActivator.ORG_ECLIPSE_XTEXT_PUREXBASE_PUREXBASE);
	}
	
}