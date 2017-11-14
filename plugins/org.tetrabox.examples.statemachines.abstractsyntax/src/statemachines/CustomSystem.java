/**
 */
package statemachines;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import statemachines.almostuml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.CustomSystem#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link statemachines.CustomSystem#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see statemachines.StatemachinesPackage#getCustomSystem()
 * @model
 * @generated
 */
public interface CustomSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statemachine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' containment reference.
	 * @see #setStatemachine(StateMachine)
	 * @see statemachines.StatemachinesPackage#getCustomSystem_Statemachine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StateMachine getStatemachine();

	/**
	 * Sets the value of the '{@link statemachines.CustomSystem#getStatemachine <em>Statemachine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statemachine</em>' containment reference.
	 * @see #getStatemachine()
	 * @generated
	 */
	void setStatemachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link statemachines.CustomEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see statemachines.StatemachinesPackage#getCustomSystem_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomEvent> getEvents();

} // CustomSystem
