/**
 */
package com.thalesgroup.openflexo.emf.model.city1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.thalesgroup.openflexo.emf.model.city1.City1Package;
import com.thalesgroup.openflexo.emf.model.city1.House;
import com.thalesgroup.openflexo.emf.model.city1.HouseType;
import com.thalesgroup.openflexo.emf.model.city1.Resident;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>House</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city1.impl.HouseImpl#getOwner <em>Owner</em>}</li>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city1.impl.HouseImpl#getType <em>Type</em>}</li>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city1.impl.HouseImpl#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class HouseImpl extends EObjectImpl implements House {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Resident owner;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final HouseType TYPE_EDEFAULT = HouseType.MANSION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected HouseType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfo() <em>Info</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected String info = INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return City1Package.Literals.HOUSE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resident getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject) owner;
			owner = (Resident) eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, City1Package.HOUSE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resident basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOwner(Resident newOwner) {
		Resident oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, City1Package.HOUSE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HouseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(HouseType newType) {
		HouseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, City1Package.HOUSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInfo(String newInfo) {
		String oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, City1Package.HOUSE__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case City1Package.HOUSE__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case City1Package.HOUSE__TYPE:
			return getType();
		case City1Package.HOUSE__INFO:
			return getInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case City1Package.HOUSE__OWNER:
			setOwner((Resident) newValue);
			return;
		case City1Package.HOUSE__TYPE:
			setType((HouseType) newValue);
			return;
		case City1Package.HOUSE__INFO:
			setInfo((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case City1Package.HOUSE__OWNER:
			setOwner((Resident) null);
			return;
		case City1Package.HOUSE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case City1Package.HOUSE__INFO:
			setInfo(INFO_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case City1Package.HOUSE__OWNER:
			return owner != null;
		case City1Package.HOUSE__TYPE:
			return type != TYPE_EDEFAULT;
		case City1Package.HOUSE__INFO:
			return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", info: ");
		result.append(info);
		result.append(')');
		return result.toString();
	}

} // HouseImpl
