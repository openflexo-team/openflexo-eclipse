/**
 */
package com.thalesgroup.openflexo.emf.model.city2.util;

import com.thalesgroup.openflexo.emf.model.city2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.openflexo.emf.model.city2.City2Package
 * @generated
 */
public class City2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static City2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = City2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected City2Switch<Adapter> modelSwitch =
		new City2Switch<Adapter>() {
			@Override
			public Adapter caseCity(City object) {
				return createCityAdapter();
			}
			@Override
			public Adapter caseHouse(House object) {
				return createHouseAdapter();
			}
			@Override
			public Adapter caseMansion(Mansion object) {
				return createMansionAdapter();
			}
			@Override
			public Adapter caseAppartment(Appartment object) {
				return createAppartmentAdapter();
			}
			@Override
			public Adapter caseMayor(Mayor object) {
				return createMayorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.openflexo.emf.model.city2.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.openflexo.emf.model.city2.City
	 * @generated
	 */
	public Adapter createCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.openflexo.emf.model.city2.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.openflexo.emf.model.city2.House
	 * @generated
	 */
	public Adapter createHouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.openflexo.emf.model.city2.Mansion <em>Mansion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.openflexo.emf.model.city2.Mansion
	 * @generated
	 */
	public Adapter createMansionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.openflexo.emf.model.city2.Appartment <em>Appartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.openflexo.emf.model.city2.Appartment
	 * @generated
	 */
	public Adapter createAppartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.openflexo.emf.model.city2.Mayor <em>Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.openflexo.emf.model.city2.Mayor
	 * @generated
	 */
	public Adapter createMayorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //City2AdapterFactory
