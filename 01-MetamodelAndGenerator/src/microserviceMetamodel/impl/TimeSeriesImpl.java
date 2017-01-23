/**
 */
package microserviceMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.TimeSeries;
import microserviceMetamodel.TimeSeriesPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.TimeSeriesImpl#getTimeSeriesPoints <em>Time Series Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSeriesImpl extends MinimalEObjectImpl.Container implements TimeSeries {
	/**
	 * The cached value of the '{@link #getTimeSeriesPoints() <em>Time Series Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSeriesPoint> timeSeriesPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.TIME_SERIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSeriesPoint> getTimeSeriesPoints() {
		if (timeSeriesPoints == null) {
			timeSeriesPoints = new EObjectContainmentWithInverseEList<TimeSeriesPoint>(TimeSeriesPoint.class, this, AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS, AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT__TIME_SERIES);
		}
		return timeSeriesPoints;
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeSeriesPoints()).basicAdd(otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS:
				return ((InternalEList<?>)getTimeSeriesPoints()).basicRemove(otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS:
				return getTimeSeriesPoints();
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS:
				getTimeSeriesPoints().clear();
				getTimeSeriesPoints().addAll((Collection<? extends TimeSeriesPoint>)newValue);
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS:
				getTimeSeriesPoints().clear();
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
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES__TIME_SERIES_POINTS:
				return timeSeriesPoints != null && !timeSeriesPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeSeriesImpl
