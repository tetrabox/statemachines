/**
 */
package statemachines.almostuml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statemachines.almostuml.AlmostumlPackage;
import statemachines.almostuml.Behavior;
import statemachines.almostuml.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link statemachines.almostuml.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link statemachines.almostuml.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamedElementImpl implements State {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlmostumlPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (Behavior)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlmostumlPackage.STATE__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Behavior newEntry) {
		Behavior oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getExit() {
		if (exit != null && exit.eIsProxy()) {
			InternalEObject oldExit = (InternalEObject)exit;
			exit = (Behavior)eResolveProxy(oldExit);
			if (exit != oldExit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlmostumlPackage.STATE__EXIT, oldExit, exit));
			}
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Behavior newExit) {
		Behavior oldExit = exit;
		exit = newExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__EXIT, oldExit, exit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDoActivity() {
		if (doActivity != null && doActivity.eIsProxy()) {
			InternalEObject oldDoActivity = (InternalEObject)doActivity;
			doActivity = (Behavior)eResolveProxy(oldDoActivity);
			if (doActivity != oldDoActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlmostumlPackage.STATE__DO_ACTIVITY, oldDoActivity, doActivity));
			}
		}
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(Behavior newDoActivity) {
		Behavior oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlmostumlPackage.STATE__DO_ACTIVITY, oldDoActivity, doActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlmostumlPackage.STATE__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case AlmostumlPackage.STATE__EXIT:
				if (resolve) return getExit();
				return basicGetExit();
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				if (resolve) return getDoActivity();
				return basicGetDoActivity();
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
			case AlmostumlPackage.STATE__ENTRY:
				setEntry((Behavior)newValue);
				return;
			case AlmostumlPackage.STATE__EXIT:
				setExit((Behavior)newValue);
				return;
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)newValue);
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
			case AlmostumlPackage.STATE__ENTRY:
				setEntry((Behavior)null);
				return;
			case AlmostumlPackage.STATE__EXIT:
				setExit((Behavior)null);
				return;
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)null);
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
			case AlmostumlPackage.STATE__ENTRY:
				return entry != null;
			case AlmostumlPackage.STATE__EXIT:
				return exit != null;
			case AlmostumlPackage.STATE__DO_ACTIVITY:
				return doActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
