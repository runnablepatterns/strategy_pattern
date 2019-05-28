package com.runnablepatterns.strategypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that implements ITranslateable. It contains the logic for translating files to Spanish.
 *
 */
public class Spanish implements ITranslateable {

	@Override
	public String translate() {
		// return the message
		return "Translating file to Spanish.";
	}

}
