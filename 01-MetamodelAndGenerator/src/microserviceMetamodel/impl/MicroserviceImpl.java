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
import org.eclipse.emf.ecore.util.InternalEList;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.Endpoint;
import microserviceMetamodel.ExecutionEnvironment;
import microserviceMetamodel.Microservice;
import microserviceMetamodel.MicroserviceType;
import microserviceMetamodel.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceImpl#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceImpl#getMicroserviceType <em>Microservice Type</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironment environment;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Endpoint> endpoints;

	/**
	 * The cached value of the '{@link #getMicroserviceType() <em>Microservice Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroserviceType()
	 * @generated
	 * @ordered
	 */
	protected MicroserviceType microserviceType;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (ExecutionEnvironment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(ExecutionEnvironment newEnvironment, NotificationChain msgs) {
		ExecutionEnvironment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(ExecutionEnvironment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, AnotherMicroserviceMetamodelPackage.EXECUTION_ENVIRONMENT__MICROSERVICES, ExecutionEnvironment.class, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, AnotherMicroserviceMetamodelPackage.EXECUTION_ENVIRONMENT__MICROSERVICES, ExecutionEnvironment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Endpoint>(Endpoint.class, this, AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENDPOINTS);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceType getMicroserviceType() {
		if (microserviceType != null && microserviceType.eIsProxy()) {
			InternalEObject oldMicroserviceType = (InternalEObject)microserviceType;
			microserviceType = (MicroserviceType)eResolveProxy(oldMicroserviceType);
			if (microserviceType != oldMicroserviceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE, oldMicroserviceType, microserviceType));
			}
		}
		return microserviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceType basicGetMicroserviceType() {
		return microserviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicroserviceType(MicroserviceType newMicroserviceType, NotificationChain msgs) {
		MicroserviceType oldMicroserviceType = microserviceType;
		microserviceType = newMicroserviceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE, oldMicroserviceType, newMicroserviceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroserviceType(MicroserviceType newMicroserviceType) {
		if (newMicroserviceType != microserviceType) {
			NotificationChain msgs = null;
			if (microserviceType != null)
				msgs = ((InternalEObject)microserviceType).eInverseRemove(this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES, MicroserviceType.class, msgs);
			if (newMicroserviceType != null)
				msgs = ((InternalEObject)newMicroserviceType).eInverseAdd(this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES, MicroserviceType.class, msgs);
			msgs = basicSetMicroserviceType(newMicroserviceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE, newMicroserviceType, newMicroserviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (Version)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.MICROSERVICE__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT:
				if (environment != null)
					msgs = ((InternalEObject)environment).eInverseRemove(this, AnotherMicroserviceMetamodelPackage.EXECUTION_ENVIRONMENT__MICROSERVICES, ExecutionEnvironment.class, msgs);
				return basicSetEnvironment((ExecutionEnvironment)otherEnd, msgs);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE:
				if (microserviceType != null)
					msgs = ((InternalEObject)microserviceType).eInverseRemove(this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__MICROSERVICES, MicroserviceType.class, msgs);
				return basicSetMicroserviceType((MicroserviceType)otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENDPOINTS:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE:
				return basicSetMicroserviceType(null, msgs);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENDPOINTS:
				return getEndpoints();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE:
				if (resolve) return getMicroserviceType();
				return basicGetMicroserviceType();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__UUID:
				return getUuid();
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT:
				setEnvironment((ExecutionEnvironment)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENDPOINTS:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Endpoint>)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE:
				setMicroserviceType((MicroserviceType)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__VERSION:
				setVersion((Version)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__UUID:
				setUuid((String)newValue);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT:
				setEnvironment((ExecutionEnvironment)null);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENDPOINTS:
				getEndpoints().clear();
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE:
				setMicroserviceType((MicroserviceType)null);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__VERSION:
				setVersion((Version)null);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__UUID:
				setUuid(UUID_EDEFAULT);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENVIRONMENT:
				return environment != null;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__ENDPOINTS:
				return endpoints != null && !endpoints.isEmpty();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__MICROSERVICE_TYPE:
				return microserviceType != null;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__VERSION:
				return version != null;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
