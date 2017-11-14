/**
 */
package statemachinesexecutiondata.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import statemachines.CustomEvent;

import statemachinesexecutiondata.EventOccurrence;
import statemachinesexecutiondata.StatemachinesexecutiondataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachinesexecutiondata.impl.EventOccurrenceImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventOccurrenceImpl extends MinimalEObjectImpl.Container implements EventOccurrence {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected CustomEvent event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinesexecutiondataPackage.Literals.EVENT_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (CustomEvent)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(CustomEvent newEvent) {
		CustomEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT:
				setEvent((CustomEvent)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT:
				setEvent((CustomEvent)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatemachinesexecutiondataPackage.EVENT_OCCURRENCE__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //EventOccurrenceImpl
