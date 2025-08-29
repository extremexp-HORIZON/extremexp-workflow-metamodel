/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.DynamicParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getDynamicParameter()
 * @model
 * @generated
 */
public interface DynamicParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(OutputData)
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getDynamicParameter_Value()
	 * @model
	 * @generated
	 */
	OutputData getValue();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.ge.workflow.DynamicParameter#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OutputData value);

} // DynamicParameter
