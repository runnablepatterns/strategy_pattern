package com.runnablepatterns.strategypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface that contains the behavior for saving files in different formats
 *
 */
public interface ISaveable {
	
	/**
	 * Handles the export option.
	 * @return the new file created.
	 */
	public String saveAs();
}
