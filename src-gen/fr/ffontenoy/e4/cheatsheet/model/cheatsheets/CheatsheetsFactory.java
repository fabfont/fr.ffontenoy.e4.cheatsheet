/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage
 * @generated
 */
public interface CheatsheetsFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	CheatsheetsFactory eINSTANCE = fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Cheat Sheets</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Cheat Sheets</em>'.
   * @generated
   */
	CheatSheets createCheatSheets();

	/**
   * Returns a new object of class '<em>Cheat Sheet</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Cheat Sheet</em>'.
   * @generated
   */
	CheatSheet createCheatSheet();

	/**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
	Item createItem();

	/**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
	Command createCommand();

	/**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
	Parameter createParameter();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	CheatsheetsPackage getCheatsheetsPackage();

} //CheatsheetsFactory
