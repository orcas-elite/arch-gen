/**
 */
package microserviceMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.Microservice;
import microserviceMetamodel.MicroserviceType;
import microserviceMetamodel.OperationToOperationCallingDependency;
import microserviceMetamodel.RESTOperation;
import microserviceMetamodel.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceTypeImpl#getRestOperations <em>Rest Operations</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceTypeImpl#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceTypeImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceTypeImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceTypeImpl extends MinimalEObjectImpl.Container implements MicroserviceType {
	/**
	 * The cached value of the '{@link #getRestOperations() <em>Rest Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<RESTOperation> restOperations;

	/**
	 * The cached value of the '{@link #getMicroservices() <em>Microservices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> microservices;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> versions;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationToOperationCallingDependency> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.MICROSERVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RESTOperation> getRestOperations() {
		if (restOperations == null) {
			restOperations = new EObjectContainmentEList<RESTOperation>(RESTOperation.class, this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__REST_OPERATIONS);
		}
		return restOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getMicroservices() {
		if (microservices == null) {
			microservices = new EObjectWithInverseResolvingEList<Microservice>(Microservice.class, this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES, AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE);
		}
		return microservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<Version>(Version.class, this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationToOperationCallingDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectWithInverseResolvingEList<OperationToOperationCallingDependency>(OperationToOperationCallingDependency.class, this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMicroservices()).basicAdd(otherEnd, msgs);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencies()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__REST_OPERATIONS:
				return ((InternalEList<?>)getRestOperations()).basicRemove(otherEnd, msgs);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES:
				return ((InternalEList<?>)getMicroservices()).basicRemove(otherEnd, msgs);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__REST_OPERATIONS:
				return getRestOperations();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES:
				return getMicroservices();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__VERSIONS:
				return getVersions();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__IDENTIFIER:
				return getIdentifier();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES:
				return getDependencies();
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__REST_OPERATIONS:
				getRestOperations().clear();
				getRestOperations().addAll((Collection<? extends RESTOperation>)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES:
				getMicroservices().clear();
				getMicroservices().addAll((Collection<? extends Microservice>)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends OperationToOperationCallingDependency>)newValue);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__REST_OPERATIONS:
				getRestOperations().clear();
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES:
				getMicroservices().clear();
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__VERSIONS:
				getVersions().clear();
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES:
				getDependencies().clear();
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__REST_OPERATIONS:
				return restOperations != null && !restOperations.isEmpty();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES:
				return microservices != null && !microservices.isEmpty();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__VERSIONS:
				return versions != null && !versions.isEmpty();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //MicroserviceTypeImpl
