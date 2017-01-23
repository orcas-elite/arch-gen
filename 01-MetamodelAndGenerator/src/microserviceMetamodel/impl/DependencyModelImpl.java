/**
 */
package microserviceMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.DependencyModel;
import microserviceMetamodel.OperationToOperationCallingDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.DependencyModelImpl#getOperationToOperationCallingDependencies <em>Operation To Operation Calling Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyModelImpl extends MinimalEObjectImpl.Container implements DependencyModel {
	/**
	 * The cached value of the '{@link #getOperationToOperationCallingDependencies() <em>Operation To Operation Calling Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationToOperationCallingDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationToOperationCallingDependency> operationToOperationCallingDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.DEPENDENCY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationToOperationCallingDependency> getOperationToOperationCallingDependencies() {
		if (operationToOperationCallingDependencies == null) {
			operationToOperationCallingDependencies = new EObjectContainmentEList<OperationToOperationCallingDependency>(OperationToOperationCallingDependency.class, this, AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES);
		}
		return operationToOperationCallingDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES:
				return ((InternalEList<?>)getOperationToOperationCallingDependencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES:
				return getOperationToOperationCallingDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES:
				getOperationToOperationCallingDependencies().clear();
				getOperationToOperationCallingDependencies().addAll((Collection<? extends OperationToOperationCallingDependency>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES:
				getOperationToOperationCallingDependencies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES:
				return operationToOperationCallingDependencies != null && !operationToOperationCallingDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DependencyModelImpl
