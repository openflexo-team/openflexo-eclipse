/**
 */
package com.thalesgroup.openflexo.emf.model.city1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.thalesgroup.openflexo.emf.model.city1.City;
import com.thalesgroup.openflexo.emf.model.city1.City1Package;
import com.thalesgroup.openflexo.emf.model.city1.House;
import com.thalesgroup.openflexo.emf.model.city1.Resident;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>City</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl#getName <em>Name</em>}</li>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl#getZipcode <em>Zipcode</em>}</li>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl#getHouses <em>Houses</em>}</li>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl#getResidents <em>Residents</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CityImpl extends EObjectImpl implements City {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipcode() <em>Zipcode</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getZipcode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ZIPCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipcode() <em>Zipcode</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getZipcode()
	 * @generated
	 * @ordered
	 */
	protected Integer zipcode = ZIPCODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHouses() <em>Houses</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getHouses()
	 * @generated
	 * @ordered
	 */
	protected EList<House> houses;

	/**
	 * The cached value of the '{@link #getResidents() <em>Residents</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getResidents()
	 * @generated
	 * @ordered
	 */
	protected EList<Resident> residents;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return City1Package.Literals.CITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<House> getHouses() {
		if (houses == null) {
			houses = new EObjectContainmentEList<House>(House.class, this, City1Package.CITY__HOUSES);
		}
		return houses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Resident> getResidents() {
		if (residents == null) {
			residents = new EObjectContainmentEList<Resident>(Resident.class, this, City1Package.CITY__RESIDENTS);
		}
		return residents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, City1Package.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getZipcode() {
		return zipcode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setZipcode(Integer newZipcode) {
		Integer oldZipcode = zipcode;
		zipcode = newZipcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, City1Package.CITY__ZIPCODE, oldZipcode, zipcode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case City1Package.CITY__HOUSES:
			return ((InternalEList<?>) getHouses()).basicRemove(otherEnd, msgs);
		case City1Package.CITY__RESIDENTS:
			return ((InternalEList<?>) getResidents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case City1Package.CITY__NAME:
			return getName();
		case City1Package.CITY__ZIPCODE:
			return getZipcode();
		case City1Package.CITY__HOUSES:
			return getHouses();
		case City1Package.CITY__RESIDENTS:
			return getResidents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case City1Package.CITY__NAME:
			setName((String) newValue);
			return;
		case City1Package.CITY__ZIPCODE:
			setZipcode((Integer) newValue);
			return;
		case City1Package.CITY__HOUSES:
			getHouses().clear();
			getHouses().addAll((Collection<? extends House>) newValue);
			return;
		case City1Package.CITY__RESIDENTS:
			getResidents().clear();
			getResidents().addAll((Collection<? extends Resident>) newValue);
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
		case City1Package.CITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case City1Package.CITY__ZIPCODE:
			setZipcode(ZIPCODE_EDEFAULT);
			return;
		case City1Package.CITY__HOUSES:
			getHouses().clear();
			return;
		case City1Package.CITY__RESIDENTS:
			getResidents().clear();
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
		case City1Package.CITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case City1Package.CITY__ZIPCODE:
			return ZIPCODE_EDEFAULT == null ? zipcode != null : !ZIPCODE_EDEFAULT.equals(zipcode);
		case City1Package.CITY__HOUSES:
			return houses != null && !houses.isEmpty();
		case City1Package.CITY__RESIDENTS:
			return residents != null && !residents.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", zipcode: ");
		result.append(zipcode);
		result.append(')');
		return result.toString();
	}

} // CityImpl
