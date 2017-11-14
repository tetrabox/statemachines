/**
 */
package statemachinesexecutiondata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import statemachines.StatemachinesPackage;

import statemachinesexecutiondata.EventOccurrence;
import statemachinesexecutiondata.StatemachinesexecutiondataFactory;
import statemachinesexecutiondata.StatemachinesexecutiondataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachinesexecutiondataPackageImpl extends EPackageImpl implements StatemachinesexecutiondataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventOccurrenceEClass = null;

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
	 * @see statemachinesexecutiondata.StatemachinesexecutiondataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatemachinesexecutiondataPackageImpl() {
		super(eNS_URI, StatemachinesexecutiondataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatemachinesexecutiondataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatemachinesexecutiondataPackage init() {
		if (isInited) return (StatemachinesexecutiondataPackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinesexecutiondataPackage.eNS_URI);

		// Obtain or create and register package
		StatemachinesexecutiondataPackageImpl theStatemachinesexecutiondataPackage = (StatemachinesexecutiondataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatemachinesexecutiondataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatemachinesexecutiondataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StatemachinesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStatemachinesexecutiondataPackage.createPackageContents();

		// Initialize created meta-data
		theStatemachinesexecutiondataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatemachinesexecutiondataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatemachinesexecutiondataPackage.eNS_URI, theStatemachinesexecutiondataPackage);
		return theStatemachinesexecutiondataPackage;
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
	public StatemachinesexecutiondataFactory getStatemachinesexecutiondataFactory() {
		return (StatemachinesexecutiondataFactory)getEFactoryInstance();
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
		eventOccurrenceEClass = createEClass(EVENT_OCCURRENCE);
		createEReference(eventOccurrenceEClass, EVENT_OCCURRENCE__EVENT);
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
		StatemachinesPackage theStatemachinesPackage = (StatemachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(eventOccurrenceEClass, EventOccurrence.class, "EventOccurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventOccurrence_Event(), theStatemachinesPackage.getCustomEvent(), null, "event", null, 1, 1, EventOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StatemachinesexecutiondataPackageImpl
