package com.runnablepatterns.strategypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that implements ITranslateable. It contains the logic for translating files to Chinese.
 *
 */
public class Chinese implements ITranslateable {

	@Override
	public String translate() {
		// return the message
		return "Translating file to Chinese.";
	}

}
