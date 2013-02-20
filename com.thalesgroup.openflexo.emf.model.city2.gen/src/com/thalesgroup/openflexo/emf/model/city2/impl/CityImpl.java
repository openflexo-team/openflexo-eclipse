/**
 */
package com.thalesgroup.openflexo.emf.model.city2.impl;

import com.thalesgroup.openflexo.emf.model.city2.City;
import com.thalesgroup.openflexo.emf.model.city2.City2Package;
import com.thalesgroup.openflexo.emf.model.city2.House;

import com.thalesgroup.openflexo.emf.model.city2.Mayor;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city2.impl.CityImpl#getHouses <em>Houses</em>}</li>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city2.impl.CityImpl#getMayor <em>Mayor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityImpl extends EObjectImpl implements City {
	/**
	 * The cached value of the '{@link #getHouses() <em>Houses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouses()
	 * @generated
	 * @ordered
	 */
	protected EList<House> houses;

	/**
	 * The cached value of the '{@link #getMayor() <em>Mayor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayor()
	 * @generated
	 * @ordered
	 */
	protected Mayor mayor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return City2Package.Literals.CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House> getHouses() {
		if (houses == null) {
			houses = new EObjectContainmentEList<House>(House.class, this, City2Package.CITY__HOUSES);
		}
		return houses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor getMayor() {
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMayor(Mayor newMayor, NotificationChain msgs) {
		Mayor oldMayor = mayor;
		mayor = newMayor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, City2Package.CITY__MAYOR, oldMayor, newMayor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayor(Mayor newMayor) {
		if (newMayor != mayor) {
			NotificationChain msgs = null;
			if (mayor != null)
				msgs = ((InternalEObject)mayor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - City2Package.CITY__MAYOR, null, msgs);
			if (newMayor != null)
				msgs = ((InternalEObject)newMayor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - City2Package.CITY__MAYOR, null, msgs);
			msgs = basicSetMayor(newMayor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, City2Package.CITY__MAYOR, newMayor, newMayor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case City2Package.CITY__HOUSES:
				return ((InternalEList<?>)getHouses()).basicRemove(otherEnd, msgs);
			case City2Package.CITY__MAYOR:
				return basicSetMayor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case City2Package.CITY__HOUSES:
				return getHouses();
			case City2Package.CITY__MAYOR:
				return getMayor();
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
			case City2Package.CITY__HOUSES:
				getHouses().clear();
				getHouses().addAll((Collection<? extends House>)newValue);
				return;
			case City2Package.CITY__MAYOR:
				setMayor((Mayor)newValue);
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
			case City2Package.CITY__HOUSES:
				getHouses().clear();
				return;
			case City2Package.CITY__MAYOR:
				setMayor((Mayor)null);
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
			case City2Package.CITY__HOUSES:
				return houses != null && !houses.isEmpty();
			case City2Package.CITY__MAYOR:
				return mayor != null;
		}
		return super.eIsSet(featureID);
	}

} //CityImpl
