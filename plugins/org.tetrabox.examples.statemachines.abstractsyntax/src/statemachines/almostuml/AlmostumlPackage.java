/**
 */
package statemachines.almostuml;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see statemachines.almostuml.AlmostumlFactory
 * @model kind="package"
 * @generated
 */
public interface AlmostumlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "almostuml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "almostuml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "almostuml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlmostumlPackage eINSTANCE = statemachines.almostuml.impl.AlmostumlPackageImpl.init();

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.NamedElementImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.StateMachineImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REGION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.RegionImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 1;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUBVERTEX = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.StateImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_ACTIVITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.VertexImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.TransitionImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.TriggerImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.ConstraintImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 6;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.BehaviorImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.EventImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.FinalStateImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DO_ACTIVITY = STATE__DO_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.impl.PseudostateImpl
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__DO_ACTIVITY = STATE__DO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__KIND = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachines.almostuml.PseudostateKind <em>Pseudostate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachines.almostuml.PseudostateKind
	 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getPseudostateKind()
	 * @generated
	 */
	int PSEUDOSTATE_KIND = 12;


	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see statemachines.almostuml.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachines.almostuml.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see statemachines.almostuml.StateMachine#getRegion()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Region();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see statemachines.almostuml.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachines.almostuml.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see statemachines.almostuml.Region#getSubvertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachines.almostuml.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see statemachines.almostuml.Region#getTransition()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transition();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachines.almostuml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link statemachines.almostuml.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see statemachines.almostuml.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entry();

	/**
	 * Returns the meta object for the reference '{@link statemachines.almostuml.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit</em>'.
	 * @see statemachines.almostuml.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Exit();

	/**
	 * Returns the meta object for the reference '{@link statemachines.almostuml.State#getDoActivity <em>Do Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do Activity</em>'.
	 * @see statemachines.almostuml.State#getDoActivity()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoActivity();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see statemachines.almostuml.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachines.almostuml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link statemachines.almostuml.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see statemachines.almostuml.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link statemachines.almostuml.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see statemachines.almostuml.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachines.almostuml.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see statemachines.almostuml.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link statemachines.almostuml.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see statemachines.almostuml.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link statemachines.almostuml.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see statemachines.almostuml.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see statemachines.almostuml.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link statemachines.almostuml.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see statemachines.almostuml.Trigger#getEvent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Event();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see statemachines.almostuml.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see statemachines.almostuml.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see statemachines.almostuml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link statemachines.almostuml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachines.almostuml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see statemachines.almostuml.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachines.almostuml.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link statemachines.almostuml.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see statemachines.almostuml.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for the attribute '{@link statemachines.almostuml.Pseudostate#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see statemachines.almostuml.Pseudostate#getKind()
	 * @see #getPseudostate()
	 * @generated
	 */
	EAttribute getPseudostate_Kind();

	/**
	 * Returns the meta object for enum '{@link statemachines.almostuml.PseudostateKind <em>Pseudostate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pseudostate Kind</em>'.
	 * @see statemachines.almostuml.PseudostateKind
	 * @generated
	 */
	EEnum getPseudostateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlmostumlFactory getAlmostumlFactory();

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
		 * The meta object literal for the '{@link statemachines.almostuml.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.StateMachineImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REGION = eINSTANCE.getStateMachine_Region();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.RegionImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__SUBVERTEX = eINSTANCE.getRegion_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSITION = eINSTANCE.getRegion_Transition();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.StateImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '<em><b>Do Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_ACTIVITY = eINSTANCE.getState_DoActivity();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.VertexImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.TransitionImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.TriggerImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.ConstraintImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.BehaviorImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.NamedElementImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.EventImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.FinalStateImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.impl.PseudostateImpl
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDOSTATE__KIND = eINSTANCE.getPseudostate_Kind();

		/**
		 * The meta object literal for the '{@link statemachines.almostuml.PseudostateKind <em>Pseudostate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachines.almostuml.PseudostateKind
		 * @see statemachines.almostuml.impl.AlmostumlPackageImpl#getPseudostateKind()
		 * @generated
		 */
		EEnum PSEUDOSTATE_KIND = eINSTANCE.getPseudostateKind();

	}

} //AlmostumlPackage
