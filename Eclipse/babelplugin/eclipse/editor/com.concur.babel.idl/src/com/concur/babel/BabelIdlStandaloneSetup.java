/*
* generated by Xtext
*/
package com.concur.babel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BabelIdlStandaloneSetup extends BabelIdlStandaloneSetupGenerated{

	public static void doSetup() {
		new BabelIdlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

