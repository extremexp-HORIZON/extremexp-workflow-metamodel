/**
 */
package eu.extremexp.workflow.metamodel.main.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exceptional Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.ExceptionalLink#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExceptionalLink()
 * @model
 * @generated
 */
public interface ExceptionalLink extends Link {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getExceptionalLink_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.ExceptionalLink#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // ExceptionalLink
