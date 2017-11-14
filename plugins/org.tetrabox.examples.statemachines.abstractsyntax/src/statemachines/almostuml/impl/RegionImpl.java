/**
 */
package statemachines.almostuml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachines.almostuml.AlmostumlPackage;
import statemachines.almostuml.Region;
import statemachines.almostuml.Transition;
import statemachines.almostuml.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachines.almostuml.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link statemachines.almostuml.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region {
	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> subvertex;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlmostumlPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentEList<Vertex>(Vertex.class, this, AlmostumlPackage.REGION__SUBVERTEX);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, AlmostumlPackage.REGION__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlmostumlPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case AlmostumlPackage.REGION__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
			case AlmostumlPackage.REGION__SUBVERTEX:
				return getSubvertex();
			case AlmostumlPackage.REGION__TRANSITION:
				return getTransition();
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
			case AlmostumlPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends Vertex>)newValue);
				return;
			case AlmostumlPackage.REGION__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
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
			case AlmostumlPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case AlmostumlPackage.REGION__TRANSITION:
				getTransition().clear();
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
			case AlmostumlPackage.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case AlmostumlPackage.REGION__TRANSITION:
				return transition != null && !transition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
