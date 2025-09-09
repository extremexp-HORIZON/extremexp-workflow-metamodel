/**
 */
package eu.extremexp.workflow.metamodel.ge.workflow.impl;

import eu.extremexp.workflow.metamodel.ge.workflow.ConditionalLink;
import eu.extremexp.workflow.metamodel.ge.workflow.WorkflowPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConditionalLinkImpl extends LinkImpl implements ConditionalLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CONDITIONAL_LINK;
	}

} //ConditionalLinkImpl
