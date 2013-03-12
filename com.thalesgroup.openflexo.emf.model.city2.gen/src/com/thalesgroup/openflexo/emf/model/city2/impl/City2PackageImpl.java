/**
 */
package com.thalesgroup.openflexo.emf.model.city2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.thalesgroup.openflexo.emf.model.city2.Appartment;
import com.thalesgroup.openflexo.emf.model.city2.City;
import com.thalesgroup.openflexo.emf.model.city2.City2Factory;
import com.thalesgroup.openflexo.emf.model.city2.City2Package;
import com.thalesgroup.openflexo.emf.model.city2.House;
import com.thalesgroup.openflexo.emf.model.city2.Mansion;
import com.thalesgroup.openflexo.emf.model.city2.Mayor;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class City2PackageImpl extends EPackageImpl implements City2Package {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mansionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass appartmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mayorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by
	 * the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization
	 * of the package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.thalesgroup.openflexo.emf.model.city2.City2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private City2PackageImpl() {
		super(eNS_URI, City2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link City2Package#eINSTANCE} when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static City2Package init() {
		if (isInited)
			return (City2Package) EPackage.Registry.INSTANCE.getEPackage(City2Package.eNS_URI);

		// Obtain or create and register package
		City2PackageImpl theCity2Package = (City2PackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof City2PackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new City2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCity2Package.createPackageContents();

		// Initialize created meta-data
		theCity2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCity2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(City2Package.eNS_URI, theCity2Package);
		return theCity2Package;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute) cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCity_Houses() {
		return (EReference) cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCity_Mayor() {
		return (EReference) cityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getHouse_Owner() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMansion() {
		return mansionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMansion_Number() {
		return (EAttribute) mansionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAppartment() {
		return appartmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAppartment_Label() {
		return (EAttribute) appartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMayor() {
		return mayorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getMayor_Name() {
		return (EAttribute) mayorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public City2Factory getCity2Factory() {
		return (City2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__NAME);
		createEReference(cityEClass, CITY__HOUSES);
		createEReference(cityEClass, CITY__MAYOR);

		houseEClass = createEClass(HOUSE);
		createEAttribute(houseEClass, HOUSE__OWNER);

		mansionEClass = createEClass(MANSION);
		createEAttribute(mansionEClass, MANSION__NUMBER);

		appartmentEClass = createEClass(APPARTMENT);
		createEAttribute(appartmentEClass, APPARTMENT__LABEL);

		mayorEClass = createEClass(MAYOR);
		createEAttribute(mayorEClass, MAYOR__NAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any invocation but its
	 * first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mansionEClass.getESuperTypes().add(this.getHouse());
		appartmentEClass.getESuperTypes().add(this.getHouse());

		// Initialize classes and features; add operations and parameters
		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_Houses(), this.getHouse(), null, "houses", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_Mayor(), this.getMayor(), null, "mayor", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouse_Owner(), ecorePackage.getEString(), "owner", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mansionEClass, Mansion.class, "Mansion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMansion_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Mansion.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appartmentEClass, Appartment.class, "Appartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppartment_Label(), ecorePackage.getEString(), "label", null, 1, 1, Appartment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mayorEClass, Mayor.class, "Mayor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMayor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Mayor.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // City2PackageImpl
