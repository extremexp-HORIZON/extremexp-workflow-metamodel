/**
 */
package eu.extremexp.workflow.metamodel.main.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentTask#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExperimentTask()
 * @model
 * @generated
 */
public interface ExperimentTask extends ExperimentStep {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExperimentTask_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentTask#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // ExperimentTask
