package com.runnablepatterns.strategypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that implements ITranslateable. It contains the logic for files that can't be translated.
 *
 */
public class NoTranslation implements ITranslateable {

	@Override
	public String translate() {
		// return message
		return "This file can't be translated.";
	}

}
