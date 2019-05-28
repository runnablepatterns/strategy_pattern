package com.runnablepatterns.strategypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface that contains the behavior for translating files in different languages
 *
 */
public interface ITranslateable {

	/**
	 * Handles the translation. 
	 * @return the translated text
	 */
	public String translate();
}