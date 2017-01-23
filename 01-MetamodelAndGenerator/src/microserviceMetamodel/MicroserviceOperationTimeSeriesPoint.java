/**
 */
package microserviceMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice Operation Time Series Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getRestOperation <em>Rest Operation</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceOperationTimeSeriesPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonNullReferences correspondingReferences'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nonNullReferences='endpoint <> null and restOperation <> null' correspondingReferences='endpoint.restOperations->select(rop:RESTOperation | rop = restOperation)->notEmpty()'"
 * @generated
 */
public interface MicroserviceOperationTimeSeriesPoint extends TimeSeriesPoint {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' reference.
	 * @see #setEndpoint(Endpoint)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceOperationTimeSeriesPoint_Endpoint()
	 * @model required="true"
	 * @generated
	 */
	Endpoint getEndpoint();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getEndpoint <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Rest Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Operation</em>' reference.
	 * @see #setRestOperation(RESTOperation)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceOperationTimeSeriesPoint_RestOperation()
	 * @model required="true"
	 * @generated
	 */
	RESTOperation getRestOperation();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getRestOperation <em>Rest Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Operation</em>' reference.
	 * @see #getRestOperation()
	 * @generated
	 */
	void setRestOperation(RESTOperation value);

} // MicroserviceOperationTimeSeriesPoint
