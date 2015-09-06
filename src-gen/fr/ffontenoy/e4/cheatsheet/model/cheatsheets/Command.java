/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command#getId <em>Id</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCommand_Id()
   * @model required="true"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
	void setId(String value);

	/**
   * Returns the value of the '<em><b>Parameters</b></em>' reference list.
   * The list contents are of type {@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' reference list.
   * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage#getCommand_Parameters()
   * @model
   * @generated
   */
	EList<Parameter> getParameters();

} // Command
