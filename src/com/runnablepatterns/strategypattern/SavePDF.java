package com.runnablepatterns.strategypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that implements ISaveable. It contains the logic for saving PDF files.
 *
 */
public class SavePDF implements ISaveable {

	@Override
	public String saveAs() {
		// return the message
		return "Saving the file as PDF.";
	}

}
