/**
 */
package statemachines;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see statemachines.StatemachinesPackage
 * @generated
 */
public interface StatemachinesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachinesFactory eINSTANCE = statemachines.impl.StatemachinesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Custom System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom System</em>'.
	 * @generated
	 */
	CustomSystem createCustomSystem();

	/**
	 * Returns a new object of class '<em>Custom Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Event</em>'.
	 * @generated
	 */
	CustomEvent createCustomEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatemachinesPackage getStatemachinesPackage();

} //StatemachinesFactory
