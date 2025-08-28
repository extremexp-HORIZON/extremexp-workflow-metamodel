/**
 */
package eu.extremexp.workflow.metamodel.main.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.main.workflow.Structure#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.workflow.metamodel.main.workflow.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see eu.extremexp.workflow.metamodel.main.workflow.WorkflowPackage#getStructure_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Structure
