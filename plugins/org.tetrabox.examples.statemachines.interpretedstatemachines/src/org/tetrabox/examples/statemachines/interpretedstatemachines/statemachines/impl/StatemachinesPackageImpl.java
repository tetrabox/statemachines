/**
 */
package org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomEvent;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.CustomSystem;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.EventOccurrence;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesFactory;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage;
import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.Util;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.AlmostumlPackage;

import org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.almostuml.impl.AlmostumlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachinesPackageImpl extends EPackageImpl implements StatemachinesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilEClass = null;

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
	 * @see org.tetrabox.examples.statemachines.interpretedstatemachines.statemachines.StatemachinesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinesPackageImpl() {
		super(eNS_URI, StatemachinesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinesPackage init() {
		if (isInited) return (StatemachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatemachinesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatemachinesPackageImpl theStatemachinesPackage = registeredStatemachinesPackage instanceof StatemachinesPackageImpl ? (StatemachinesPackageImpl)registeredStatemachinesPackage : new StatemachinesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AlmostumlPackage.eNS_URI);
		AlmostumlPackageImpl theAlmostumlPackage = (AlmostumlPackageImpl)(registeredPackage instanceof AlmostumlPackageImpl ? registeredPackage : AlmostumlPackage.eINSTANCE);

		// Create package meta-data objects
		theStatemachinesPackage.createPackageContents();
		theAlmostumlPackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinesPackage.initializePackageContents();
		theAlmostumlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinesPackage.eNS_URI, theStatemachinesPackage);
		return theStatemachinesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomSystem() {
		return customSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomSystem_Statemachine() {
		return (EReference)customSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomSystem_Events() {
		return (EReference)customSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEvent() {
		return customEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventOccurrence() {
		return eventOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventOccurrence_Event() {
		return (EReference)eventOccurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtil() {
		return utilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachinesFactory getStatemachinesFactory() {
		return (StatemachinesFactory)getEFactoryInstance();
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
		customSystemEClass = createEClass(CUSTOM_SYSTEM);
		createEReference(customSystemEClass, CUSTOM_SYSTEM__STATEMACHINE);
		createEReference(customSystemEClass, CUSTOM_SYSTEM__EVENTS);

		customEventEClass = createEClass(CUSTOM_EVENT);

		eventOccurrenceEClass = createEClass(EVENT_OCCURRENCE);
		createEReference(eventOccurrenceEClass, EVENT_OCCURRENCE__EVENT);

		utilEClass = createEClass(UTIL);
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

		// Obtain other dependent packages
		AlmostumlPackage theAlmostumlPackage = (AlmostumlPackage)EPackage.Registry.INSTANCE.getEPackage(AlmostumlPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAlmostumlPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customEventEClass.getESuperTypes().add(theAlmostumlPackage.getEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(customSystemEClass, CustomSystem.class, "CustomSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomSystem_Statemachine(), theAlmostumlPackage.getStateMachine(), null, "statemachine", null, 1, 1, CustomSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomSystem_Events(), this.getCustomEvent(), null, "events", null, 0, -1, CustomSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(customSystemEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(customSystemEClass, null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(customEventEClass, CustomEvent.class, "CustomEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventOccurrenceEClass, EventOccurrence.class, "EventOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventOccurrence_Event(), this.getCustomEvent(), null, "event", null, 1, 1, EventOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilEClass, Util.class, "Util", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(utilEClass, null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation
		  (customSystemEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (customSystemEClass.getEOperations().get(1),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (eventOccurrenceEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEventOccurrence_Event(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (utilEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (utilEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
	}

} //StatemachinesPackageImpl
