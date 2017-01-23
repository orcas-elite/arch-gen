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
import microserviceMetamodel.MicroserviceRepository;
import microserviceMetamodel.MicroserviceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceRepositoryImpl#getMicroserviceTypes <em>Microservice Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceRepositoryImpl extends MinimalEObjectImpl.Container implements MicroserviceRepository {
	/**
	 * The cached value of the '{@link #getMicroserviceTypes() <em>Microservice Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroserviceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MicroserviceType> microserviceTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.MICROSERVICE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicroserviceType> getMicroserviceTypes() {
		if (microserviceTypes == null) {
			microserviceTypes = new EObjectContainmentEList<MicroserviceType>(MicroserviceType.class, this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES);
		}
		return microserviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES:
				return ((InternalEList<?>)getMicroserviceTypes()).basicRemove(otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES:
				return getMicroserviceTypes();
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES:
				getMicroserviceTypes().clear();
				getMicroserviceTypes().addAll((Collection<? extends MicroserviceType>)newValue);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES:
				getMicroserviceTypes().clear();
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES:
				return microserviceTypes != null && !microserviceTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MicroserviceRepositoryImpl
