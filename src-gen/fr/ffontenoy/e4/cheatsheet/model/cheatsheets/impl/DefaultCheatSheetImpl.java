/**
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl;

import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsPackage;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheat Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.impl.DefaultCheatSheetImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultCheatSheetImpl extends MinimalEObjectImpl.Container implements CheatSheet {
	/**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
	protected static final String TITLE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
	protected String title = TITLE_EDEFAULT;

	/**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
   * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
	protected EList<Item> items;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DefaultCheatSheetImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return CheatsheetsPackage.Literals.CHEAT_SHEET;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTitle() {
    return title;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTitle(String newTitle) {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheatsheetsPackage.CHEAT_SHEET__TITLE, oldTitle, title));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDescription() {
    return description;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CheatsheetsPackage.CHEAT_SHEET__DESCRIPTION, oldDescription, description));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Item> getItems() {
    if (items == null) {
      items = new EObjectResolvingEList<Item>(Item.class, this, CheatsheetsPackage.CHEAT_SHEET__ITEMS);
    }
    return items;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case CheatsheetsPackage.CHEAT_SHEET__TITLE:
        return getTitle();
      case CheatsheetsPackage.CHEAT_SHEET__DESCRIPTION:
        return getDescription();
      case CheatsheetsPackage.CHEAT_SHEET__ITEMS:
        return getItems();
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
      case CheatsheetsPackage.CHEAT_SHEET__TITLE:
        setTitle((String)newValue);
        return;
      case CheatsheetsPackage.CHEAT_SHEET__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case CheatsheetsPackage.CHEAT_SHEET__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends Item>)newValue);
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
      case CheatsheetsPackage.CHEAT_SHEET__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case CheatsheetsPackage.CHEAT_SHEET__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case CheatsheetsPackage.CHEAT_SHEET__ITEMS:
        getItems().clear();
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
      case CheatsheetsPackage.CHEAT_SHEET__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case CheatsheetsPackage.CHEAT_SHEET__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case CheatsheetsPackage.CHEAT_SHEET__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //DefaultCheatSheetImpl
