/**
 */
package statemachines.almostuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see statemachines.almostuml.AlmostumlPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends State {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link statemachines.almostuml.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see statemachines.almostuml.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see statemachines.almostuml.AlmostumlPackage#getPseudostate_Kind()
	 * @model required="true"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link statemachines.almostuml.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see statemachines.almostuml.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

} // Pseudostate
