/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsFactory
 * @model kind="package"
 * @generated
 */
public interface CheatsheetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cheatsheets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ffontenoy.e4.cheatsheet/cheatsheets/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cheatsheets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CheatsheetsPackage eINSTANCE = fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetsImpl <em>Cheat Sheets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetsImpl
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getCheatSheets()
	 * @generated
	 */
	int CHEAT_SHEETS = 0;

	/**
	 * The feature id for the '<em><b>Cheat Sheets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEETS__CHEAT_SHEETS = 0;

	/**
	 * The number of structural features of the '<em>Cheat Sheets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cheat Sheets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetImpl <em>Cheat Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetImpl
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getCheatSheet()
	 * @generated
	 */
	int CHEAT_SHEET = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEET__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEET__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEET__ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Cheat Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cheat Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEAT_SHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultItemImpl
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCommandImpl
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultParameterImpl
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets <em>Cheat Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheat Sheets</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets
	 * @generated
	 */
	EClass getCheatSheets();

	/**
	 * Returns the meta object for the reference list '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets#getCheatSheets <em>Cheat Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cheat Sheets</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets#getCheatSheets()
	 * @see #getCheatSheets()
	 * @generated
	 */
	EReference getCheatSheets_CheatSheets();

	/**
	 * Returns the meta object for class '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet <em>Cheat Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheat Sheet</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet
	 * @generated
	 */
	EClass getCheatSheet();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getTitle()
	 * @see #getCheatSheet()
	 * @generated
	 */
	EAttribute getCheatSheet_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getDescription()
	 * @see #getCheatSheet()
	 * @generated
	 */
	EAttribute getCheatSheet_Description();

	/**
	 * Returns the meta object for the reference list '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet#getItems()
	 * @see #getCheatSheet()
	 * @generated
	 */
	EReference getCheatSheet_Items();

	/**
	 * Returns the meta object for class '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getTitle()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getDescription()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Description();

	/**
	 * Returns the meta object for the reference '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getCommand()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Command();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item#getHeight()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Height();

	/**
	 * Returns the meta object for class '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command#getId()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Id();

	/**
	 * Returns the meta object for the reference list '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command#getParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Parameters();

	/**
	 * Returns the meta object for class '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CheatsheetsFactory getCheatsheetsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetsImpl <em>Cheat Sheets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetsImpl
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getCheatSheets()
		 * @generated
		 */
		EClass CHEAT_SHEETS = eINSTANCE.getCheatSheets();

		/**
		 * The meta object literal for the '<em><b>Cheat Sheets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEAT_SHEETS__CHEAT_SHEETS = eINSTANCE.getCheatSheets_CheatSheets();

		/**
		 * The meta object literal for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetImpl <em>Cheat Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetImpl
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getCheatSheet()
		 * @generated
		 */
		EClass CHEAT_SHEET = eINSTANCE.getCheatSheet();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEAT_SHEET__TITLE = eINSTANCE.getCheatSheet_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEAT_SHEET__DESCRIPTION = eINSTANCE.getCheatSheet_Description();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEAT_SHEET__ITEMS = eINSTANCE.getCheatSheet_Items();

		/**
		 * The meta object literal for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultItemImpl
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TITLE = eINSTANCE.getItem_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DESCRIPTION = eINSTANCE.getItem_Description();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__COMMAND = eINSTANCE.getItem_Command();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__HEIGHT = eINSTANCE.getItem_Height();

		/**
		 * The meta object literal for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCommandImpl
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__ID = eINSTANCE.getCommand_Id();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();

		/**
		 * The meta object literal for the '{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultParameterImpl
		 * @see fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatsheetsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

	}

} //CheatsheetsPackage
