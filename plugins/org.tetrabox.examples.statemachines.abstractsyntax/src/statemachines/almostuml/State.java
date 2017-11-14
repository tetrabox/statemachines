/**
 */
package statemachines.almostuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link statemachines.almostuml.State#getExit <em>Exit</em>}</li>
 *   <li>{@link statemachines.almostuml.State#getDoActivity <em>Do Activity</em>}</li>
 * </ul>
 *
 * @see statemachines.almostuml.AlmostumlPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement, Vertex {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(Behavior)
	 * @see statemachines.almostuml.AlmostumlPackage#getState_Entry()
	 * @model
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.State#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference.
	 * @see #setExit(Behavior)
	 * @see statemachines.almostuml.AlmostumlPackage#getState_Exit()
	 * @model
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.State#getExit <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' reference.
	 * @see #setDoActivity(Behavior)
	 * @see statemachines.almostuml.AlmostumlPackage#getState_DoActivity()
	 * @model
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.State#getDoActivity <em>Do Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

} // State
