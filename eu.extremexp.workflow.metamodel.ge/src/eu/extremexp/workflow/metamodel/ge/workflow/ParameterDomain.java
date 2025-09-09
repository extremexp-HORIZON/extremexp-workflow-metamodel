/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.ParameterDomain#getStaticparameter <em>Staticparameter</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getParameterDomain()
 * @model
 * @generated
 */
public interface ParameterDomain extends StaticParameter {
	/**
	 * Returns the value of the '<em><b>Staticparameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staticparameter</em>' reference.
	 * @see #setStaticparameter(StaticParameter)
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getParameterDomain_Staticparameter()
	 * @model
	 * @generated
	 */
	StaticParameter getStaticparameter();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.ge.workflow.ParameterDomain#getStaticparameter <em>Staticparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staticparameter</em>' reference.
	 * @see #getStaticparameter()
	 * @generated
	 */
	void setStaticparameter(StaticParameter value);

} // ParameterDomain
