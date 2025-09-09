/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configured Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.ConfiguredTask#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getConfiguredTask()
 * @model
 * @generated
 */
public interface ConfiguredTask extends Task {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Task)
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getConfiguredTask_Configuration()
	 * @model
	 * @generated
	 */
	Task getConfiguration();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.ge.workflow.ConfiguredTask#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Task value);

} // ConfiguredTask
