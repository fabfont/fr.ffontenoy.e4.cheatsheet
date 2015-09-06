/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl;

import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultCheatsheetsFactoryImpl extends EFactoryImpl implements CheatsheetsFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CheatsheetsFactory init() {
    try {
      CheatsheetsFactory theCheatsheetsFactory = (CheatsheetsFactory)EPackage.Registry.INSTANCE.getEFactory(CheatsheetsPackage.eNS_URI);
      if (theCheatsheetsFactory != null) {
        return theCheatsheetsFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DefaultCheatsheetsFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DefaultCheatsheetsFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case CheatsheetsPackage.CHEAT_SHEETS: return createCheatSheets();
      case CheatsheetsPackage.CHEAT_SHEET: return createCheatSheet();
      case CheatsheetsPackage.ITEM: return createItem();
      case CheatsheetsPackage.COMMAND: return createCommand();
      case CheatsheetsPackage.PARAMETER: return createParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CheatSheets createCheatSheets() {
    DefaultCheatSheetsImpl cheatSheets = new DefaultCheatSheetsImpl();
    return cheatSheets;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CheatSheet createCheatSheet() {
    DefaultCheatSheetImpl cheatSheet = new DefaultCheatSheetImpl();
    return cheatSheet;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Item createItem() {
    DefaultItemImpl item = new DefaultItemImpl();
    return item;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Command createCommand() {
    DefaultCommandImpl command = new DefaultCommandImpl();
    return command;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Parameter createParameter() {
    DefaultParameterImpl parameter = new DefaultParameterImpl();
    return parameter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CheatsheetsPackage getCheatsheetsPackage() {
    return (CheatsheetsPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static CheatsheetsPackage getPackage() {
    return CheatsheetsPackage.eINSTANCE;
  }

} //DefaultCheatsheetsFactoryImpl
