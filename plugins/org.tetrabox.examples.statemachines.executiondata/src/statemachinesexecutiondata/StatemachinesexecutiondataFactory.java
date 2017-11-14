/**
 */
package statemachinesexecutiondata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see statemachinesexecutiondata.StatemachinesexecutiondataPackage
 * @generated
 */
public interface StatemachinesexecutiondataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachinesexecutiondataFactory eINSTANCE = statemachinesexecutiondata.impl.StatemachinesexecutiondataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Occurrence</em>'.
	 * @generated
	 */
	EventOccurrence createEventOccurrence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatemachinesexecutiondataPackage getStatemachinesexecutiondataPackage();

} //StatemachinesexecutiondataFactory
