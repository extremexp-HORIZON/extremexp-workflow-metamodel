/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.Workflow#getNode <em>Node</em>}</li>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.Workflow#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends Task {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.workflow.metamodel.ge.workflow.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getWorkflow_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.workflow.metamodel.ge.workflow.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getWorkflow_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // Workflow
