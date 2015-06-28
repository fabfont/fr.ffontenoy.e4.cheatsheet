/**
 * Eclipse Public License - v 1.0
 * 
 * THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS ECLIPSE PUBLIC LICENSE ("AGREEMENT"). 
 * ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRAM CONSTITUTES RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT.
 * 
 * This code has been written by Fabrice Fontenoy and is available from the following git repository:
 * https://github.com/fabfont/fr.ffontenoy.e4.stickyview.git
 */
package fr.ffontenoy.e4.cheatsheet.extensionpoint;

/**
 * Enum of possible attributes for the cheatsheet extension point
 * 
 * @author Fabrice Fontenoy
 */
public enum CheatsheetExtensionAttribute {

	/**
	 * Path to the cheatsheet file
	 */
	CHEATSHEET_FILE("cheatsheetFile");

	/** attibute name */
	private final String mName;

	/**
	 * Constructor
	 * 
	 * @param pName
	 *            the enum name
	 */
	private CheatsheetExtensionAttribute(String pName) {
		mName = pName;
	}

	/**
	 * @return the attribute name
	 */
	public String getName() {
		return mName;
	}

}
