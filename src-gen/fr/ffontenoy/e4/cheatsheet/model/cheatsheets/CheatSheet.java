/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheat Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCheatSheet()
 * @model
 * @generated
 */
public interface CheatSheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCheatSheet_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCheatSheet_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCheatSheet_Items()
	 * @model
	 * @generated
	 */
	EList<Item> getItems();

} // CheatSheet
