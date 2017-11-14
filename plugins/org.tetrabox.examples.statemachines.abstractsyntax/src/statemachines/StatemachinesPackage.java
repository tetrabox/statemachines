/**
 */
package statemachines;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import statemachines.almostuml.AlmostumlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see statemachines.StatemachinesFactory
 * @model kind="package"
 * @generated
 */
public interface StatemachinesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statemachines";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "statemachines";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statemachines";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachinesPackage eINSTANCE = statemachines.impl.StatemachinesPackageImpl.init();

	/**
	 * The meta object id for the '{@link statemachines.impl.CustomSystemImpl <em>Custom System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.impl.CustomSystemImpl
	 * @see statemachines.impl.StatemachinesPackageImpl#getCustomSystem()
	 * @generated
	 */
	int CUSTOM_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SYSTEM__STATEMACHINE = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SYSTEM__EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Custom System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachines.impl.CustomEventImpl <em>Custom Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.impl.CustomEventImpl
	 * @see statemachines.impl.StatemachinesPackageImpl#getCustomEvent()
	 * @generated
	 */
	int CUSTOM_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT__NAME = AlmostumlPackage.EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Custom Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT_FEATURE_COUNT = AlmostumlPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT_OPERATION_COUNT = AlmostumlPackage.EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link statemachines.CustomSystem <em>Custom System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom System</em>'.
	 * @see statemachines.CustomSystem
	 * @generated
	 */
	EClass getCustomSystem();

	/**
	 * Returns the meta object for the containment reference '{@link statemachines.CustomSystem#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statemachine</em>'.
	 * @see statemachines.CustomSystem#getStatemachine()
	 * @see #getCustomSystem()
	 * @generated
	 */
	EReference getCustomSystem_Statemachine();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachines.CustomSystem#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see statemachines.CustomSystem#getEvents()
	 * @see #getCustomSystem()
	 * @generated
	 */
	EReference getCustomSystem_Events();

	/**
	 * Returns the meta object for class '{@link statemachines.CustomEvent <em>Custom Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Event</em>'.
	 * @see statemachines.CustomEvent
	 * @generated
	 */
	EClass getCustomEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatemachinesFactory getStatemachinesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link statemachines.impl.CustomSystemImpl <em>Custom System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.impl.CustomSystemImpl
		 * @see statemachines.impl.StatemachinesPackageImpl#getCustomSystem()
		 * @generated
		 */
		EClass CUSTOM_SYSTEM = eINSTANCE.getCustomSystem();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_SYSTEM__STATEMACHINE = eINSTANCE.getCustomSystem_Statemachine();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_SYSTEM__EVENTS = eINSTANCE.getCustomSystem_Events();

		/**
		 * The meta object literal for the '{@link statemachines.impl.CustomEventImpl <em>Custom Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.impl.CustomEventImpl
		 * @see statemachines.impl.StatemachinesPackageImpl#getCustomEvent()
		 * @generated
		 */
		EClass CUSTOM_EVENT = eINSTANCE.getCustomEvent();

	}

} //StatemachinesPackage
