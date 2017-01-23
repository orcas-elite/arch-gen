/**
 */
package microserviceMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage
 * @generated
 */
public interface AnotherMicroserviceMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnotherMicroserviceMetamodelFactory eINSTANCE = microserviceMetamodel.impl.AnotherMicroserviceMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice</em>'.
	 * @generated
	 */
	Microservice createMicroservice();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint</em>'.
	 * @generated
	 */
	Endpoint createEndpoint();

	/**
	 * Returns a new object of class '<em>REST Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Operation</em>'.
	 * @generated
	 */
	RESTOperation createRESTOperation();

	/**
	 * Returns a new object of class '<em>Microservice Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice Type</em>'.
	 * @generated
	 */
	MicroserviceType createMicroserviceType();

	/**
	 * Returns a new object of class '<em>Microservice Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice Repository</em>'.
	 * @generated
	 */
	MicroserviceRepository createMicroserviceRepository();

	/**
	 * Returns a new object of class '<em>Virtual Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Host</em>'.
	 * @generated
	 */
	VirtualHost createVirtualHost();

	/**
	 * Returns a new object of class '<em>Physical Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Host</em>'.
	 * @generated
	 */
	PhysicalHost createPhysicalHost();

	/**
	 * Returns a new object of class '<em>Infrastructure Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Model</em>'.
	 * @generated
	 */
	InfrastructureModel createInfrastructureModel();

	/**
	 * Returns a new object of class '<em>Dependency Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Model</em>'.
	 * @generated
	 */
	DependencyModel createDependencyModel();

	/**
	 * Returns a new object of class '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation To Operation Calling Dependency</em>'.
	 * @generated
	 */
	OperationToOperationCallingDependency createOperationToOperationCallingDependency();

	/**
	 * Returns a new object of class '<em>Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Series</em>'.
	 * @generated
	 */
	TimeSeries createTimeSeries();

	/**
	 * Returns a new object of class '<em>Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Series Point</em>'.
	 * @generated
	 */
	TimeSeriesPoint createTimeSeriesPoint();

	/**
	 * Returns a new object of class '<em>Microservice Operation Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice Operation Time Series Point</em>'.
	 * @generated
	 */
	MicroserviceOperationTimeSeriesPoint createMicroserviceOperationTimeSeriesPoint();

	/**
	 * Returns a new object of class '<em>Meta Model Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model Structure</em>'.
	 * @generated
	 */
	MetaModelStructure createMetaModelStructure();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnotherMicroserviceMetamodelPackage getAnotherMicroserviceMetamodelPackage();

} //AnotherMicroserviceMetamodelFactory
