/**
 */
package eu.extremexp.workflow.metamodel.main.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentSpace#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentSpace#getAssembledworflow <em>Assembledworflow</em>}</li>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentSpace#getTaskConfiguration <em>Task Configuration</em>}</li>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentSpace#getParametervalue <em>Parametervalue</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExperimentSpace()
 * @model
 * @generated
 */
public interface ExperimentSpace extends ExperimentStep {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see #setStrategy(String)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExperimentSpace_Strategy()
	 * @model
	 * @generated
	 */
	String getStrategy();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentSpace#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Assembledworflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembledworflow</em>' reference.
	 * @see #setAssembledworflow(AssembledWorflow)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExperimentSpace_Assembledworflow()
	 * @model
	 * @generated
	 */
	AssembledWorflow getAssembledworflow();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentSpace#getAssembledworflow <em>Assembledworflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembledworflow</em>' reference.
	 * @see #getAssembledworflow()
	 * @generated
	 */
	void setAssembledworflow(AssembledWorflow value);

	/**
	 * Returns the value of the '<em><b>Task Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.workflow.metamodel.main.workflow.TaskConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Configuration</em>' containment reference list.
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExperimentSpace_TaskConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskConfiguration> getTaskConfiguration();

	/**
	 * Returns the value of the '<em><b>Parametervalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametervalue</em>' containment reference.
	 * @see #setParametervalue(ParameterValue)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExperimentSpace_Parametervalue()
	 * @model containment="true"
	 * @generated
	 */
	ParameterValue getParametervalue();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.ExperimentSpace#getParametervalue <em>Parametervalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametervalue</em>' containment reference.
	 * @see #getParametervalue()
	 * @generated
	 */
	void setParametervalue(ParameterValue value);

} // ExperimentSpace
