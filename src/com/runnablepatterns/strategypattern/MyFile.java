package com.runnablepatterns.strategypattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that contains the 2 behaviors created: ISaveable and ITranslateable. It will use a HAS-A relation
 * instead of IS-A to provide flexibility.
 *
 */
public class MyFile {
	
	/**
	 * Field to store the ISaveable behavior
	 */
	private ISaveable saveFormat;
		
	/**
	 * Field to store the ITranslateable behavior 
	 */
	private ITranslateable translate;
	
	/**
	 * Overloaded constructor. This way we force the clients to send both behaviors to initialize the object.
	 * @param _saveFormat
	 * @param _translate
	 */
	public MyFile(ISaveable _saveFormat, ITranslateable _translate) {
		// set the variables
		setSaveFormat(_saveFormat);
		setTranslate(_translate);
	}

	/**
	 * Setter method for ISaveable behavior
	 * @param saveFormat
	 */
	public void setSaveFormat(ISaveable saveFormat) {
		this.saveFormat = saveFormat;
	}

	/**
	 * Setter method for ITranslateable behavior
	 * @param translate
	 */
	public void setTranslate(ITranslateable translate) {
		this.translate = translate;
	}
	
	/**
	 * Method used to actually export the current file to any format
	 * @return The message for the specific format assigned
	 */
	public String saveMyFileAs() {
		// return specific implementation message
		return this.saveFormat.saveAs();
	}
	
	/**
	 * Method used to actually translate the current file to any language
	 * @return The message for the specific translation assigned
	 */
	public String trasnlateMyFile() {
		// return the specific implementation message
		return this.translate.translate();
	}
}
