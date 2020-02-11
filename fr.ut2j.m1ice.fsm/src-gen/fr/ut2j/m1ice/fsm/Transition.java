/**
 */
package fr.ut2j.m1ice.fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ut2j.m1ice.fsm.Transition#getState1 <em>State1</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.fsm.Transition#getState2 <em>State2</em>}</li>
 *   <li>{@link fr.ut2j.m1ice.fsm.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.ut2j.m1ice.fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>State1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State1</em>' reference.
	 * @see #setState1(State)
	 * @see fr.ut2j.m1ice.fsm.FsmPackage#getTransition_State1()
	 * @model
	 * @generated
	 */
	State getState1();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.fsm.Transition#getState1 <em>State1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State1</em>' reference.
	 * @see #getState1()
	 * @generated
	 */
	void setState1(State value);

	/**
	 * Returns the value of the '<em><b>State2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State2</em>' reference.
	 * @see #setState2(State)
	 * @see fr.ut2j.m1ice.fsm.FsmPackage#getTransition_State2()
	 * @model
	 * @generated
	 */
	State getState2();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.fsm.Transition#getState2 <em>State2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State2</em>' reference.
	 * @see #getState2()
	 * @generated
	 */
	void setState2(State value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ut2j.m1ice.fsm.FsmPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ut2j.m1ice.fsm.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
