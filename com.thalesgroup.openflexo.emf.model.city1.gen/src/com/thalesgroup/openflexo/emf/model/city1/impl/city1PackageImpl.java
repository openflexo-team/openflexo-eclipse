/**
 */
package com.thalesgroup.openflexo.emf.model.city1.impl;

import com.thalesgroup.openflexo.emf.model.city1.City;
import com.thalesgroup.openflexo.emf.model.city1.House;
import com.thalesgroup.openflexo.emf.model.city1.HouseType;
import com.thalesgroup.openflexo.emf.model.city1.Resident;
import com.thalesgroup.openflexo.emf.model.city1.city1Factory;
import com.thalesgroup.openflexo.emf.model.city1.city1Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class city1PackageImpl extends EPackageImpl implements city1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass residentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum houseTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private city1PackageImpl() {
		super(eNS_URI, city1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link city1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static city1Package init() {
		if (isInited) return (city1Package)EPackage.Registry.INSTANCE.getEPackage(city1Package.eNS_URI);

		// Obtain or create and register package
		city1PackageImpl thecity1Package = (city1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof city1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new city1PackageImpl());

		isInited = true;

		// Create package meta-data objects
		thecity1Package.createPackageContents();

		// Initialize created meta-data
		thecity1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecity1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(city1Package.eNS_URI, thecity1Package);
		return thecity1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCity_Houses() {
		return (EReference)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCity_Residents() {
		return (EReference)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Owner() {
		return (EReference)houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Type() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Info() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResident() {
		return residentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResident_Name() {
		return (EAttribute)residentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHouseType() {
		return houseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public city1Factory getcity1Factory() {
		return (city1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cityEClass = createEClass(CITY);
		createEReference(cityEClass, CITY__HOUSES);
		createEReference(cityEClass, CITY__RESIDENTS);
		createEAttribute(cityEClass, CITY__NAME);

		houseEClass = createEClass(HOUSE);
		createEReference(houseEClass, HOUSE__OWNER);
		createEAttribute(houseEClass, HOUSE__TYPE);
		createEAttribute(houseEClass, HOUSE__INFO);

		residentEClass = createEClass(RESIDENT);
		createEAttribute(residentEClass, RESIDENT__NAME);

		// Create enums
		houseTypeEEnum = createEEnum(HOUSE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCity_Houses(), this.getHouse(), null, "houses", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_Residents(), this.getResident(), null, "residents", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHouse_Owner(), this.getResident(), null, "owner", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Type(), this.getHouseType(), "type", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Info(), ecorePackage.getEString(), "info", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(residentEClass, Resident.class, "Resident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResident_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(houseTypeEEnum, HouseType.class, "HouseType");
		addEEnumLiteral(houseTypeEEnum, HouseType.MANSION);
		addEEnumLiteral(houseTypeEEnum, HouseType.APPARTMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //city1PackageImpl
