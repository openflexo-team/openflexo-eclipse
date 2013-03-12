/**
 */
package com.thalesgroup.openflexo.emf.model.city1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.thalesgroup.openflexo.emf.model.city1.City;
import com.thalesgroup.openflexo.emf.model.city1.City1Factory;
import com.thalesgroup.openflexo.emf.model.city1.City1Package;
import com.thalesgroup.openflexo.emf.model.city1.House;
import com.thalesgroup.openflexo.emf.model.city1.HouseType;
import com.thalesgroup.openflexo.emf.model.city1.Resident;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class City1FactoryImpl extends EFactoryImpl implements City1Factory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static City1Factory init() {
		try {
			City1Factory theCity1Factory = (City1Factory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.thalesgroup.com/openflexo/emf/model/city1");
			if (theCity1Factory != null) {
				return theCity1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new City1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public City1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case City1Package.CITY:
			return createCity();
		case City1Package.HOUSE:
			return createHouse();
		case City1Package.RESIDENT:
			return createResident();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case City1Package.HOUSE_TYPE:
			return createHouseTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case City1Package.HOUSE_TYPE:
			return convertHouseTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resident createResident() {
		ResidentImpl resident = new ResidentImpl();
		return resident;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HouseType createHouseTypeFromString(EDataType eDataType, String initialValue) {
		HouseType result = HouseType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertHouseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public City1Package getCity1Package() {
		return (City1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static City1Package getPackage() {
		return City1Package.eINSTANCE;
	}

} // City1FactoryImpl
