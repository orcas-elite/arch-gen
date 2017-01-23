/**
 */
package microserviceMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.TimeSeries;
import microserviceMetamodel.TimeSeriesPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Series Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.TimeSeriesPointImpl#getTimeSeries <em>Time Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSeriesPointImpl extends MinimalEObjectImpl.Container implements TimeSeriesPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSeriesPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.TIME_SERIES_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeries getTimeSeries() {
		if (eContainerFeatureID() != AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES) return null;
		return (TimeSeries)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSeries(TimeSeries newTimeSeries, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTimeSeries, AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeries(TimeSeries newTimeSeries) {
		if (newTimeSeries != eInternalContainer() || (eContainerFeatureID() != AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES && newTimeSeries != null)) {
			if (EcoreUtil.isAncestor(this, newTimeSeries))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTimeSeries != null)
				msgs = ((InternalEObject)newTimeSeries).eInverseAdd(this, AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS, TimeSeries.class, msgs);
			msgs = basicSetTimeSeries(newTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES, newTimeSeries, newTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTimeSeries((TimeSeries)otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES:
				return basicSetTimeSeries(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES:
				return eInternalContainer().eInverseRemove(this, AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS, TimeSeries.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES:
				return getTimeSeries();
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES:
				setTimeSeries((TimeSeries)newValue);
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES:
				setTimeSeries((TimeSeries)null);
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES:
				return getTimeSeries() != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeSeriesPointImpl
