/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow.impl;

import eu.extremexp.workflow.metamodel.ge.workflow.Parallel;
import eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ParallelImpl extends OperatorImpl implements Parallel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.PARALLEL;
	}

} //ParallelImpl
