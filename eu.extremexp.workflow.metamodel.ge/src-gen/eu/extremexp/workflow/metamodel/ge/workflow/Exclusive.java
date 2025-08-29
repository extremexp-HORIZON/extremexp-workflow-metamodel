/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.Exclusive#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getExclusive()
 * @model
 * @generated
 */
public interface Exclusive extends Operator {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getExclusive_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.ge.workflow.Exclusive#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Exclusive
