/**
 */
package eu.extremexp.workflow.metamodel.main.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.Link#getOutput <em>Output</em>}</li>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.Link#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Node)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getLink_Output()
	 * @model required="true"
	 * @generated
	 */
	Node getOutput();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.Link#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Node value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Node)
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getLink_Input()
	 * @model required="true"
	 * @generated
	 */
	Node getInput();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.main.workflow.Link#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Node value);

} // Link
