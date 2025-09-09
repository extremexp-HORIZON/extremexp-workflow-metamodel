/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.PrimitiveType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.extremexp.workflow.metamodel.ge.workflow.Primitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.Primitive
	 * @see #setType(Primitive)
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getPrimitiveType_Type()
	 * @model
	 * @generated
	 */
	Primitive getType();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.ge.workflow.PrimitiveType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.Primitive
	 * @see #getType()
	 * @generated
	 */
	void setType(Primitive value);

} // PrimitiveType
