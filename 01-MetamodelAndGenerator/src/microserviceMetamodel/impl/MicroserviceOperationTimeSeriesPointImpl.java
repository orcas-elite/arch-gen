/**
 */
package microserviceMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.Endpoint;
import microserviceMetamodel.MicroserviceOperationTimeSeriesPoint;
import microserviceMetamodel.RESTOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice Operation Time Series Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceOperationTimeSeriesPointImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MicroserviceOperationTimeSeriesPointImpl#getRestOperation <em>Rest Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceOperationTimeSeriesPointImpl extends TimeSeriesPointImpl implements MicroserviceOperationTimeSeriesPoint {
	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint endpoint;

	/**
	 * The cached value of the '{@link #getRestOperation() <em>Rest Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestOperation()
	 * @generated
	 * @ordered
	 */
	protected RESTOperation restOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceOperationTimeSeriesPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.MICROSERVICE_OPERATION_TIME_SERIES_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getEndpoint() {
		if (endpoint != null && endpoint.eIsProxy()) {
			InternalEObject oldEndpoint = (InternalEObject)endpoint;
			endpoint = (Endpoint)eResolveProxy(oldEndpoint);
			if (endpoint != oldEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT, oldEndpoint, endpoint));
			}
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint basicGetEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(Endpoint newEndpoint) {
		Endpoint oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTOperation getRestOperation() {
		if (restOperation != null && restOperation.eIsProxy()) {
			InternalEObject oldRestOperation = (InternalEObject)restOperation;
			restOperation = (RESTOperation)eResolveProxy(oldRestOperation);
			if (restOperation != oldRestOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION, oldRestOperation, restOperation));
			}
		}
		return restOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTOperation basicGetRestOperation() {
		return restOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestOperation(RESTOperation newRestOperation) {
		RESTOperation oldRestOperation = restOperation;
		restOperation = newRestOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION, oldRestOperation, restOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT:
				if (resolve) return getEndpoint();
				return basicGetEndpoint();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION:
				if (resolve) return getRestOperation();
				return basicGetRestOperation();
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT:
				setEndpoint((Endpoint)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION:
				setRestOperation((RESTOperation)newValue);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT:
				setEndpoint((Endpoint)null);
				return;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION:
				setRestOperation((RESTOperation)null);
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
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT:
				return endpoint != null;
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION:
				return restOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //MicroserviceOperationTimeSeriesPointImpl
