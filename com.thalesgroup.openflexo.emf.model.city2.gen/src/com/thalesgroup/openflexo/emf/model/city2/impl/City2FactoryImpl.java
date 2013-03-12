/**
 */
package com.thalesgroup.openflexo.emf.model.city2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.thalesgroup.openflexo.emf.model.city2.Appartment;
import com.thalesgroup.openflexo.emf.model.city2.City;
import com.thalesgroup.openflexo.emf.model.city2.City2Factory;
import com.thalesgroup.openflexo.emf.model.city2.City2Package;
import com.thalesgroup.openflexo.emf.model.city2.Mansion;
import com.thalesgroup.openflexo.emf.model.city2.Mayor;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class City2FactoryImpl extends EFactoryImpl implements City2Factory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static City2Factory init() {
		try {
			City2Factory theCity2Factory = (City2Factory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.thalesgroup.com/openflexo/emf/model/city2");
			if (theCity2Factory != null) {
				return theCity2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new City2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public City2FactoryImpl() {
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
		case City2Package.CITY:
			return createCity();
		case City2Package.MANSION:
			return createMansion();
		case City2Package.APPARTMENT:
			return createAppartment();
		case City2Package.MAYOR:
			return createMayor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Mansion createMansion() {
		MansionImpl mansion = new MansionImpl();
		return mansion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Appartment createAppartment() {
		AppartmentImpl appartment = new AppartmentImpl();
		return appartment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Mayor createMayor() {
		MayorImpl mayor = new MayorImpl();
		return mayor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public City2Package getCity2Package() {
		return (City2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static City2Package getPackage() {
		return City2Package.eINSTANCE;
	}

} // City2FactoryImpl
