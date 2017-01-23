/**
 */
package microserviceMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Series Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.TimeSeriesPoint#getTimeSeries <em>Time Series</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getTimeSeriesPoint()
 * @model
 * @generated
 */
public interface TimeSeriesPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Series</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.TimeSeries#getTimeSeriesPoints <em>Time Series Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series</em>' container reference.
	 * @see #setTimeSeries(TimeSeries)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getTimeSeriesPoint_TimeSeries()
	 * @see microserviceMetamodel.TimeSeries#getTimeSeriesPoints
	 * @model opposite="timeSeriesPoints" required="true" transient="false"
	 * @generated
	 */
	TimeSeries getTimeSeries();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.TimeSeriesPoint#getTimeSeries <em>Time Series</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series</em>' container reference.
	 * @see #getTimeSeries()
	 * @generated
	 */
	void setTimeSeries(TimeSeries value);

} // TimeSeriesPoint
