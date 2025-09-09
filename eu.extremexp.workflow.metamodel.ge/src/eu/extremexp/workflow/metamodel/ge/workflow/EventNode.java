/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.EventNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getEventNode()
 * @model
 * @generated
 */
public interface EventNode extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.extremexp.workflow.metamodel.ge.workflow.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.Event
	 * @see #setName(Event)
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getEventNode_Name()
	 * @model
	 * @generated
	 */
	Event getName();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.ge.workflow.EventNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.Event
	 * @see #getName()
	 * @generated
	 */
	void setName(Event value);

} // EventNode
