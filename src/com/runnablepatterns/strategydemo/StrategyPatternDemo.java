package com.runnablepatterns.strategydemo;

import com.runnablepatterns.strategypattern.Chinese;
import com.runnablepatterns.strategypattern.ISaveable;
import com.runnablepatterns.strategypattern.ITranslateable;
import com.runnablepatterns.strategypattern.MyFile;
import com.runnablepatterns.strategypattern.SavePDF;
import com.runnablepatterns.strategypattern.SaveTxt;
import com.runnablepatterns.strategypattern.Spanish;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Console application to demonstrate Strategy Pattern
 *
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {

		// create ISaveable behavior
		ISaveable saveTxt = new SaveTxt();
		
		// create ITranslateable behavior
		ITranslateable translate = new Spanish();
		
		// create MyFile object using the 2 default behaviors
		MyFile myFile = new MyFile(saveTxt, translate);
		
		// see the current configuration
		System.out.println("Using default settings.");
		System.out.println(myFile.saveMyFileAs());
		System.out.println(myFile.trasnlateMyFile());
		System.out.println();
		
		// now changing the export to PDF at runtime.
		// notice that this is the only place that changes.
		myFile.setSaveFormat(new SavePDF());
		System.out.println("Changing file format as needed.");

		// get the new format
		System.out.println(myFile.saveMyFileAs());
		System.out.println();
		
		// now changing the translate settings
		myFile.setTranslate(new Chinese());
		System.out.println("Translating to new language");

		// get the new translation
		System.out.println(myFile.trasnlateMyFile());
	}

}
