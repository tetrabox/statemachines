/**
 */
package execution.statemachines;

import org.eclipse.emf.ecore.EObject;

import statemachines.CustomEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link execution.statemachines.EventOccurrence#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see execution.statemachines.StatemachinesPackage#getEventOccurrence()
 * @model
 * @generated
 */
public interface EventOccurrence extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(CustomEvent)
	 * @see execution.statemachines.StatemachinesPackage#getEventOccurrence_Event()
	 * @model required="true"
	 * @generated
	 */
	CustomEvent getEvent();

	/**
	 * Sets the value of the '{@link execution.statemachines.EventOccurrence#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(CustomEvent value);

} // EventOccurrence
