/**
 */
package eu.extremexp.workflow.metamodel.main.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.Event#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.extremexp.workflow.metamodel.main.workflow.EventValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see eu.extremexp.workflow.metamodel.main.workflow.EventValue
	 * @see #setName(EventValue)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	EventValue getName();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see eu.extremexp.workflow.metamodel.main.workflow.EventValue
	 * @see #getName()
	 * @generated
	 */
	void setName(EventValue value);

} // Event
