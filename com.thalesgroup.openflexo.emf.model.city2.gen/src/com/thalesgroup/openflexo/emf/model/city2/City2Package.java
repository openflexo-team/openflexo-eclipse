/**
 */
package com.thalesgroup.openflexo.emf.model.city2;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.thalesgroup.openflexo.emf.model.city2.City2Factory
 * @model kind="package"
 * @generated
 */
public interface City2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "city2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/openflexo/emf/model/city2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "city2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	City2Package eINSTANCE = com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.CityImpl
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getCity()
	 * @generated
	 */
	int CITY = 0;

	/**
	 * The feature id for the '<em><b>Houses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__HOUSES = 0;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.HouseImpl
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__OWNER = 0;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.MansionImpl <em>Mansion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.MansionImpl
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getMansion()
	 * @generated
	 */
	int MANSION = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANSION__OWNER = HOUSE__OWNER;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANSION__NUMBER = HOUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mansion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANSION_FEATURE_COUNT = HOUSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.AppartmentImpl <em>Appartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.AppartmentImpl
	 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getAppartment()
	 * @generated
	 */
	int APPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARTMENT__OWNER = HOUSE__OWNER;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARTMENT__LABEL = HOUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Appartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARTMENT_FEATURE_COUNT = HOUSE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link com.thalesgroup.openflexo.emf.model.city2.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.openflexo.emf.model.city2.City#getHouses <em>Houses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Houses</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.City#getHouses()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Houses();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.openflexo.emf.model.city2.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.openflexo.emf.model.city2.House#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.House#getOwner()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Owner();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.openflexo.emf.model.city2.Mansion <em>Mansion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mansion</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.Mansion
	 * @generated
	 */
	EClass getMansion();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.openflexo.emf.model.city2.Mansion#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.Mansion#getNumber()
	 * @see #getMansion()
	 * @generated
	 */
	EAttribute getMansion_Number();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.openflexo.emf.model.city2.Appartment <em>Appartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appartment</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.Appartment
	 * @generated
	 */
	EClass getAppartment();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.openflexo.emf.model.city2.Appartment#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city2.Appartment#getLabel()
	 * @see #getAppartment()
	 * @generated
	 */
	EAttribute getAppartment_Label();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	City2Factory getCity2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.CityImpl
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Houses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__HOUSES = eINSTANCE.getCity_Houses();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.HouseImpl
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__OWNER = eINSTANCE.getHouse_Owner();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.MansionImpl <em>Mansion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.MansionImpl
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getMansion()
		 * @generated
		 */
		EClass MANSION = eINSTANCE.getMansion();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANSION__NUMBER = eINSTANCE.getMansion_Number();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city2.impl.AppartmentImpl <em>Appartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.AppartmentImpl
		 * @see com.thalesgroup.openflexo.emf.model.city2.impl.City2PackageImpl#getAppartment()
		 * @generated
		 */
		EClass APPARTMENT = eINSTANCE.getAppartment();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPARTMENT__LABEL = eINSTANCE.getAppartment_Label();

	}

} //City2Package
