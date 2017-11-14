/**
 */
package statemachinesexecutiondata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import statemachinesexecutiondata.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachinesexecutiondataFactoryImpl extends EFactoryImpl implements StatemachinesexecutiondataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatemachinesexecutiondataFactory init() {
		try {
			StatemachinesexecutiondataFactory theStatemachinesexecutiondataFactory = (StatemachinesexecutiondataFactory)EPackage.Registry.INSTANCE.getEFactory(StatemachinesexecutiondataPackage.eNS_URI);
			if (theStatemachinesexecutiondataFactory != null) {
				return theStatemachinesexecutiondataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatemachinesexecutiondataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachinesexecutiondataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatemachinesexecutiondataPackage.EVENT_OCCURRENCE: return createEventOccurrence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence createEventOccurrence() {
		EventOccurrenceImpl eventOccurrence = new EventOccurrenceImpl();
		return eventOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachinesexecutiondataPackage getStatemachinesexecutiondataPackage() {
		return (StatemachinesexecutiondataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatemachinesexecutiondataPackage getPackage() {
		return StatemachinesexecutiondataPackage.eINSTANCE;
	}

} //StatemachinesexecutiondataFactoryImpl
