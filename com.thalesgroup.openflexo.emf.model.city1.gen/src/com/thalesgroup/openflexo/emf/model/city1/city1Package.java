/**
 */
package com.thalesgroup.openflexo.emf.model.city1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.thalesgroup.openflexo.emf.model.city1.city1Factory
 * @model kind="package"
 * @generated
 */
public interface city1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "city1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/openflexo/emf/model/city1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "city1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	city1Package eINSTANCE = com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl
	 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getCity()
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
	 * The feature id for the '<em><b>Residents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__RESIDENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 2;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city1.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city1.impl.HouseImpl
	 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__INFO = 2;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city1.impl.ResidentImpl <em>Resident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city1.impl.ResidentImpl
	 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getResident()
	 * @generated
	 */
	int RESIDENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.openflexo.emf.model.city1.HouseType <em>House Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.openflexo.emf.model.city1.HouseType
	 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getHouseType()
	 * @generated
	 */
	int HOUSE_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link com.thalesgroup.openflexo.emf.model.city1.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.openflexo.emf.model.city1.City#getHouses <em>Houses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Houses</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.City#getHouses()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Houses();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.openflexo.emf.model.city1.City#getResidents <em>Residents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Residents</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.City#getResidents()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Residents();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.openflexo.emf.model.city1.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.openflexo.emf.model.city1.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.openflexo.emf.model.city1.House#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.House#getOwner()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Owner();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.openflexo.emf.model.city1.House#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.House#getType()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.openflexo.emf.model.city1.House#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.House#getInfo()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Info();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.openflexo.emf.model.city1.Resident <em>Resident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resident</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.Resident
	 * @generated
	 */
	EClass getResident();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.openflexo.emf.model.city1.Resident#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.Resident#getName()
	 * @see #getResident()
	 * @generated
	 */
	EAttribute getResident_Name();

	/**
	 * Returns the meta object for enum '{@link com.thalesgroup.openflexo.emf.model.city1.HouseType <em>House Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>House Type</em>'.
	 * @see com.thalesgroup.openflexo.emf.model.city1.HouseType
	 * @generated
	 */
	EEnum getHouseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	city1Factory getcity1Factory();

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
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city1.impl.CityImpl
		 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getCity()
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
		 * The meta object literal for the '<em><b>Residents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__RESIDENTS = eINSTANCE.getCity_Residents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city1.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city1.impl.HouseImpl
		 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__OWNER = eINSTANCE.getHouse_Owner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__TYPE = eINSTANCE.getHouse_Type();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__INFO = eINSTANCE.getHouse_Info();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city1.impl.ResidentImpl <em>Resident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city1.impl.ResidentImpl
		 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getResident()
		 * @generated
		 */
		EClass RESIDENT = eINSTANCE.getResident();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDENT__NAME = eINSTANCE.getResident_Name();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.openflexo.emf.model.city1.HouseType <em>House Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.openflexo.emf.model.city1.HouseType
		 * @see com.thalesgroup.openflexo.emf.model.city1.impl.city1PackageImpl#getHouseType()
		 * @generated
		 */
		EEnum HOUSE_TYPE = eINSTANCE.getHouseType();

	}

} //city1Package
