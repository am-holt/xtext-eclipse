/*
* generated by Xtext
*/
package org.eclipse.xtext.testlanguages;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ActionTestLanguage2StandaloneSetup extends ActionTestLanguage2StandaloneSetupGenerated{

	public static void doSetup() {
		new ActionTestLanguage2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
