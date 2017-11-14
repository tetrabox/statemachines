/**
 */
package statemachines.almostuml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.StateMachine#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see statemachines.almostuml.AlmostumlPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.almostuml.Region}.
	 * It is bidirectional and its opposite is '{@link statemachines.almostuml.Region#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see statemachines.almostuml.AlmostumlPackage#getStateMachine_Region()
	 * @see statemachines.almostuml.Region#getStateMachine
	 * @model opposite="stateMachine" containment="true" required="true"
	 * @generated
	 */
	EList<Region> getRegion();

} // StateMachine
