/**
 */
package statemachines.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachines.CustomEvent;
import statemachines.CustomSystem;
import statemachines.StatemachinesPackage;

import statemachines.almostuml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachines.impl.CustomSystemImpl#getStatemachine <em>Statemachine</em>}</li>
 *   <li>{@link statemachines.impl.CustomSystemImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomSystemImpl extends MinimalEObjectImpl.Container implements CustomSystem {
	/**
	 * The cached value of the '{@link #getStatemachine() <em>Statemachine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine statemachine;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinesPackage.Literals.CUSTOM_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStatemachine() {
		return statemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachine(StateMachine newStatemachine, NotificationChain msgs) {
		StateMachine oldStatemachine = statemachine;
		statemachine = newStatemachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE, oldStatemachine, newStatemachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatemachine(StateMachine newStatemachine) {
		if (newStatemachine != statemachine) {
			NotificationChain msgs = null;
			if (statemachine != null)
				msgs = ((InternalEObject)statemachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE, null, msgs);
			if (newStatemachine != null)
				msgs = ((InternalEObject)newStatemachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE, null, msgs);
			msgs = basicSetStatemachine(newStatemachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE, newStatemachine, newStatemachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<CustomEvent>(CustomEvent.class, this, StatemachinesPackage.CUSTOM_SYSTEM__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
				return basicSetStatemachine(null, msgs);
			case StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
				return getStatemachine();
			case StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
				return getEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
				setStatemachine((StateMachine)newValue);
				return;
			case StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends CustomEvent>)newValue);
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
			case StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
				setStatemachine((StateMachine)null);
				return;
			case StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
				getEvents().clear();
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
			case StatemachinesPackage.CUSTOM_SYSTEM__STATEMACHINE:
				return statemachine != null;
			case StatemachinesPackage.CUSTOM_SYSTEM__EVENTS:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomSystemImpl
