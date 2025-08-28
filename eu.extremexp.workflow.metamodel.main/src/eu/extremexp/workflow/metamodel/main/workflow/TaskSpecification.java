/**
 */
package eu.extremexp.workflow.metamodel.main.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.TaskSpecification#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.TaskSpecification#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.TaskSpecification#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getTaskSpecification()
 * @model
 * @generated
 */
public interface TaskSpecification extends Workflow {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getTaskSpecification_Implementation()
	 * @model
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.TaskSpecification#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.workflow.metamodel.main.workflow.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getTaskSpecification_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.workflow.metamodel.main.workflow.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getTaskSpecification_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // TaskSpecification
