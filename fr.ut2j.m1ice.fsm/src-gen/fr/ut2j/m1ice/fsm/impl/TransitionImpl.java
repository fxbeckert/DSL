/**
 */
package fr.ut2j.m1ice.fsm.impl;

import fr.ut2j.m1ice.fsm.FsmPackage;
import fr.ut2j.m1ice.fsm.State;
import fr.ut2j.m1ice.fsm.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.fsm.impl.TransitionImpl#getState1 <em>State1</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.fsm.impl.TransitionImpl#getState2 <em>State2</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.fsm.impl.TransitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getState1() <em>State1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState1()
	 * @generated
	 * @ordered
	 */
	protected State state1;

	/**
	 * The cached value of the '{@link #getState2() <em>State2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState2()
	 * @generated
	 * @ordered
	 */
	protected State state2;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState1() {
		if (state1 != null && state1.eIsProxy()) {
			InternalEObject oldState1 = (InternalEObject) state1;
			state1 = (State) eResolveProxy(oldState1);
			if (state1 != oldState1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__STATE1, oldState1,
							state1));
			}
		}
		return state1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState1() {
		return state1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState1(State newState1) {
		State oldState1 = state1;
		state1 = newState1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__STATE1, oldState1, state1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState2() {
		if (state2 != null && state2.eIsProxy()) {
			InternalEObject oldState2 = (InternalEObject) state2;
			state2 = (State) eResolveProxy(oldState2);
			if (state2 != oldState2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__STATE2, oldState2,
							state2));
			}
		}
		return state2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState2() {
		return state2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState2(State newState2) {
		State oldState2 = state2;
		state2 = newState2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__STATE2, oldState2, state2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FsmPackage.TRANSITION__STATE1:
			if (resolve)
				return getState1();
			return basicGetState1();
		case FsmPackage.TRANSITION__STATE2:
			if (resolve)
				return getState2();
			return basicGetState2();
		case FsmPackage.TRANSITION__NAME:
			return getName();
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
		case FsmPackage.TRANSITION__STATE1:
			setState1((State) newValue);
			return;
		case FsmPackage.TRANSITION__STATE2:
			setState2((State) newValue);
			return;
		case FsmPackage.TRANSITION__NAME:
			setName((String) newValue);
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
		case FsmPackage.TRANSITION__STATE1:
			setState1((State) null);
			return;
		case FsmPackage.TRANSITION__STATE2:
			setState2((State) null);
			return;
		case FsmPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
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
		case FsmPackage.TRANSITION__STATE1:
			return state1 != null;
		case FsmPackage.TRANSITION__STATE2:
			return state2 != null;
		case FsmPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
