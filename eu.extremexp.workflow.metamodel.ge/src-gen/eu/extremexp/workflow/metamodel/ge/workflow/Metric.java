/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.workflow.metamodel.ge.workflow.Metric#getOutputdata <em>Outputdata</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Outputdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputdata</em>' reference.
	 * @see #setOutputdata(OutputData)
	 * @see eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage#getMetric_Outputdata()
	 * @model
	 * @generated
	 */
	OutputData getOutputdata();

	/**
	 * Sets the value of the '{@link eu.extremexp.workflow.metamodel.ge.workflow.Metric#getOutputdata <em>Outputdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputdata</em>' reference.
	 * @see #getOutputdata()
	 * @generated
	 */
	void setOutputdata(OutputData value);

} // Metric
