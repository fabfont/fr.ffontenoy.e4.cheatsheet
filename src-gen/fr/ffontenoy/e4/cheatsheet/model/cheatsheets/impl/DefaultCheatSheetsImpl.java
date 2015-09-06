/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl;

import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheat Sheets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetsImpl#getCheatSheets <em>Cheat Sheets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultCheatSheetsImpl extends MinimalEObjectImpl.Container implements CheatSheets {
	/**
   * The cached value of the '{@link #getCheatSheets() <em>Cheat Sheets</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCheatSheets()
   * @generated
   * @ordered
   */
	protected EList<CheatSheet> cheatSheets;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DefaultCheatSheetsImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return CheatsheetsPackage.Literals.CHEAT_SHEETS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CheatSheet> getCheatSheets() {
    if (cheatSheets == null) {
      cheatSheets = new EObjectResolvingEList<CheatSheet>(CheatSheet.class, this, CheatsheetsPackage.CHEAT_SHEETS__CHEAT_SHEETS);
    }
    return cheatSheets;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case CheatsheetsPackage.CHEAT_SHEETS__CHEAT_SHEETS:
        return getCheatSheets();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case CheatsheetsPackage.CHEAT_SHEETS__CHEAT_SHEETS:
        getCheatSheets().clear();
        getCheatSheets().addAll((Collection<? extends CheatSheet>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case CheatsheetsPackage.CHEAT_SHEETS__CHEAT_SHEETS:
        getCheatSheets().clear();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case CheatsheetsPackage.CHEAT_SHEETS__CHEAT_SHEETS:
        return cheatSheets != null && !cheatSheets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefaultCheatSheetsImpl
