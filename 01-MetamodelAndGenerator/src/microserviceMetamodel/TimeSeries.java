/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.TimeSeries#getTimeSeriesPoints <em>Time Series Points</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getTimeSeries()
 * @model
 * @generated
 */
public interface TimeSeries extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Series Points</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.TimeSeriesPoint}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.TimeSeriesPoint#getTimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Points</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getTimeSeries_TimeSeriesPoints()
	 * @see microserviceMetamodel.TimeSeriesPoint#getTimeSeries
	 * @model opposite="timeSeries" containment="true"
	 * @generated
	 */
	EList<TimeSeriesPoint> getTimeSeriesPoints();

} // TimeSeries
