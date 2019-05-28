package com.runnablepatterns.strategypattern;
/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that implements ISaveable. It contains the logic for saving text files.
 *
 */
public class SaveTxt implements ISaveable {

	@Override
	public String saveAs() {
		// return the message
		return "Saving the file as txt.";
	}

}
