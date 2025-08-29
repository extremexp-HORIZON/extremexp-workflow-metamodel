/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.Complex#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends Operator {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.workflow.metamodel.ge.workflow.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getComplex_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // Complex
