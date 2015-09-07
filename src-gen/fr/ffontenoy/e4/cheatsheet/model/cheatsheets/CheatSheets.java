/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheat Sheets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets#getCheatSheets <em>Cheat Sheets</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCheatSheets()
 * @model
 * @generated
 */
public interface CheatSheets extends EObject {
	/**
	 * Returns the value of the '<em><b>Cheat Sheets</b></em>' reference list.
	 * The list contents are of type {@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cheat Sheets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cheat Sheets</em>' reference list.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCheatSheets_CheatSheets()
	 * @model
	 * @generated
	 */
	EList<CheatSheet> getCheatSheets();

} // CheatSheets
