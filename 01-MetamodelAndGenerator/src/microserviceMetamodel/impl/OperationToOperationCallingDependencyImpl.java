/**
 */
package microserviceMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.MicroserviceType;
import microserviceMetamodel.OperationToOperationCallingDependency;
import microserviceMetamodel.RESTOperation;
import microserviceMetamodel.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation To Operation Calling Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl#getCalledMicroservice <em>Called Microservice</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl#getCalledOperation <em>Called Operation</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl#getCallingOperation <em>Calling Operation</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl#getCallingVersion <em>Calling Version</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl#getCallingMicroservice <em>Calling Microservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationToOperationCallingDependencyImpl extends MinimalEObjectImpl.Container implements OperationToOperationCallingDependency {
	/**
	 * The cached value of the '{@link #getCalledMicroservice() <em>Called Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledMicroservice()
	 * @generated
	 * @ordered
	 */
	protected MicroserviceType calledMicroservice;

	/**
	 * The cached value of the '{@link #getCalledOperation() <em>Called Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledOperation()
	 * @generated
	 * @ordered
	 */
	protected RESTOperation calledOperation;

	/**
	 * The cached value of the '{@link #getCallingOperation() <em>Calling Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallingOperation()
	 * @generated
	 * @ordered
	 */
	protected RESTOperation callingOperation;

	/**
	 * The cached value of the '{@link #getCallingVersion() <em>Calling Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallingVersion()
	 * @generated
	 * @ordered
	 */
	protected Version callingVersion;

	/**
	 * The cached value of the '{@link #getCallingMicroservice() <em>Calling Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallingMicroservice()
	 * @generated
	 * @ordered
	 */
	protected MicroserviceType callingMicroservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationToOperationCallingDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.OPERATION_TO_OPERATION_CALLING_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceType getCallingMicroservice() {
		if (callingMicroservice != null && callingMicroservice.eIsProxy()) {
			InternalEObject oldCallingMicroservice = (InternalEObject)callingMicroservice;
			callingMicroservice = (MicroserviceType)eResolveProxy(oldCallingMicroservice);
			if (callingMicroservice != oldCallingMicroservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE, oldCallingMicroservice, callingMicroservice));
			}
		}
		return callingMicroservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceType basicGetCallingMicroservice() {
		return callingMicroservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallingMicroservice(MicroserviceType newCallingMicroservice, NotificationChain msgs) {
		MicroserviceType oldCallingMicroservice = callingMicroservice;
		callingMicroservice = newCallingMicroservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE, oldCallingMicroservice, newCallingMicroservice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallingMicroservice(MicroserviceType newCallingMicroservice) {
		if (newCallingMicroservice != callingMicroservice) {
			NotificationChain msgs = null;
			if (callingMicroservice != null)
				msgs = ((InternalEObject)callingMicroservice).eInverseRemove(this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES, MicroserviceType.class, msgs);
			if (newCallingMicroservice != null)
				msgs = ((InternalEObject)newCallingMicroservice).eInverseAdd(this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES, MicroserviceType.class, msgs);
			msgs = basicSetCallingMicroservice(newCallingMicroservice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE, newCallingMicroservice, newCallingMicroservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE:
				if (callingMicroservice != null)
					msgs = ((InternalEObject)callingMicroservice).eInverseRemove(this, AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE__DEPENDENCIES, MicroserviceType.class, msgs);
				return basicSetCallingMicroservice((MicroserviceType)otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE:
				return basicSetCallingMicroservice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceType getCalledMicroservice() {
		if (calledMicroservice != null && calledMicroservice.eIsProxy()) {
			InternalEObject oldCalledMicroservice = (InternalEObject)calledMicroservice;
			calledMicroservice = (MicroserviceType)eResolveProxy(oldCalledMicroservice);
			if (calledMicroservice != oldCalledMicroservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE, oldCalledMicroservice, calledMicroservice));
			}
		}
		return calledMicroservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceType basicGetCalledMicroservice() {
		return calledMicroservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledMicroservice(MicroserviceType newCalledMicroservice) {
		MicroserviceType oldCalledMicroservice = calledMicroservice;
		calledMicroservice = newCalledMicroservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE, oldCalledMicroservice, calledMicroservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTOperation getCalledOperation() {
		if (calledOperation != null && calledOperation.eIsProxy()) {
			InternalEObject oldCalledOperation = (InternalEObject)calledOperation;
			calledOperation = (RESTOperation)eResolveProxy(oldCalledOperation);
			if (calledOperation != oldCalledOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION, oldCalledOperation, calledOperation));
			}
		}
		return calledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTOperation basicGetCalledOperation() {
		return calledOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledOperation(RESTOperation newCalledOperation) {
		RESTOperation oldCalledOperation = calledOperation;
		calledOperation = newCalledOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION, oldCalledOperation, calledOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTOperation getCallingOperation() {
		if (callingOperation != null && callingOperation.eIsProxy()) {
			InternalEObject oldCallingOperation = (InternalEObject)callingOperation;
			callingOperation = (RESTOperation)eResolveProxy(oldCallingOperation);
			if (callingOperation != oldCallingOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION, oldCallingOperation, callingOperation));
			}
		}
		return callingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTOperation basicGetCallingOperation() {
		return callingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallingOperation(RESTOperation newCallingOperation) {
		RESTOperation oldCallingOperation = callingOperation;
		callingOperation = newCallingOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION, oldCallingOperation, callingOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getCallingVersion() {
		if (callingVersion != null && callingVersion.eIsProxy()) {
			InternalEObject oldCallingVersion = (InternalEObject)callingVersion;
			callingVersion = (Version)eResolveProxy(oldCallingVersion);
			if (callingVersion != oldCallingVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION, oldCallingVersion, callingVersion));
			}
		}
		return callingVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetCallingVersion() {
		return callingVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallingVersion(Version newCallingVersion) {
		Version oldCallingVersion = callingVersion;
		callingVersion = newCallingVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION, oldCallingVersion, callingVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE:
				if (resolve) return getCalledMicroservice();
				return basicGetCalledMicroservice();
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION:
				if (resolve) return getCalledOperation();
				return basicGetCalledOperation();
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION:
				if (resolve) return getCallingOperation();
				return basicGetCallingOperation();
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION:
				if (resolve) return getCallingVersion();
				return basicGetCallingVersion();
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE:
				if (resolve) return getCallingMicroservice();
				return basicGetCallingMicroservice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE:
				setCalledMicroservice((MicroserviceType)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION:
				setCalledOperation((RESTOperation)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION:
				setCallingOperation((RESTOperation)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION:
				setCallingVersion((Version)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE:
				setCallingMicroservice((MicroserviceType)newValue);
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
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE:
				setCalledMicroservice((MicroserviceType)null);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION:
				setCalledOperation((RESTOperation)null);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION:
				setCallingOperation((RESTOperation)null);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION:
				setCallingVersion((Version)null);
				return;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE:
				setCallingMicroservice((MicroserviceType)null);
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
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE:
				return calledMicroservice != null;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION:
				return calledOperation != null;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION:
				return callingOperation != null;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION:
				return callingVersion != null;
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE:
				return callingMicroservice != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationToOperationCallingDependencyImpl
