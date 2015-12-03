package com.actram.solace.interfaces;

/**
 * An input owner controls input interfacing with the user in the program.
 * 
 * @author Peter André Johansen
 */
public interface InputOwner {

	/**
	 * Removes what has been input by the user, but not processed. An example
	 * would be clearing the text in a text field.
	 */
	public void clearInput();

	/**
	 * @return what has been input by the user, but not processed
	 */
	public String getCurrentInput();

	/**
	 * @return whether the program accepts user input
	 */
	public boolean isAcceptingUserInput();

	/**
	 * @return whether the input area is hidden from the user
	 */
	public boolean isInputHidden();

	/**
	 * Sets whether the program should accept user input. This method differs
	 * from {@link #setInputHidden(boolean)} in that it enables or disables the
	 * input, but doesn't show or hide it.
	 * 
	 * @param acceptInput whether to accept user input
	 */
	public void setAcceptUserInput(boolean acceptInput);

	/**
	 * Sets the current input. The input will only be updated, not processed.
	 * <p>
	 * <strong>Note:</strong> This method can be disruptive to the user if it
	 * behaves unexpectedly.
	 * 
	 * @param obj the input
	 */
	public void setCurrentInput(Object obj);

	/**
	 * Sets whether the program's input area should be visible to the user. This
	 * method differs from {@link #setAcceptUserInput(boolean)} in that it shows
	 * or hides the input, but doesn't enable or disable it.
	 * 
	 * @param hidden whether to hide the input area from the user
	 */
	public void setInputHidden(boolean hidden);

}