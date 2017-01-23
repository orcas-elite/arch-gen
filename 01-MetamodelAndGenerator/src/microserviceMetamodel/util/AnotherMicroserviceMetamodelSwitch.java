/**
 */
package microserviceMetamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import microserviceMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage
 * @generated
 */
public class AnotherMicroserviceMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnotherMicroserviceMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherMicroserviceMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = AnotherMicroserviceMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE: {
				Microservice microservice = (Microservice)theEObject;
				T result = caseMicroservice(microservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.EXECUTION_ENVIRONMENT: {
				ExecutionEnvironment executionEnvironment = (ExecutionEnvironment)theEObject;
				T result = caseExecutionEnvironment(executionEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.ANOMALY_INJECTOR: {
				AnomalyInjector anomalyInjector = (AnomalyInjector)theEObject;
				T result = caseAnomalyInjector(anomalyInjector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.ENDPOINT: {
				Endpoint endpoint = (Endpoint)theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION: {
				RESTOperation restOperation = (RESTOperation)theEObject;
				T result = caseRESTOperation(restOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE: {
				MicroserviceType microserviceType = (MicroserviceType)theEObject;
				T result = caseMicroserviceType(microserviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY: {
				MicroserviceRepository microserviceRepository = (MicroserviceRepository)theEObject;
				T result = caseMicroserviceRepository(microserviceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.HOST: {
				Host host = (Host)theEObject;
				T result = caseHost(host);
				if (result == null) result = caseExecutionEnvironment(host);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseExecutionEnvironment(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST: {
				VirtualHost virtualHost = (VirtualHost)theEObject;
				T result = caseVirtualHost(virtualHost);
				if (result == null) result = caseHost(virtualHost);
				if (result == null) result = caseExecutionEnvironment(virtualHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST: {
				PhysicalHost physicalHost = (PhysicalHost)theEObject;
				T result = casePhysicalHost(physicalHost);
				if (result == null) result = caseHost(physicalHost);
				if (result == null) result = caseExecutionEnvironment(physicalHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.INFRASTRUCTURE_MODEL: {
				InfrastructureModel infrastructureModel = (InfrastructureModel)theEObject;
				T result = caseInfrastructureModel(infrastructureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL: {
				DependencyModel dependencyModel = (DependencyModel)theEObject;
				T result = caseDependencyModel(dependencyModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY: {
				OperationToOperationCallingDependency operationToOperationCallingDependency = (OperationToOperationCallingDependency)theEObject;
				T result = caseOperationToOperationCallingDependency(operationToOperationCallingDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES: {
				TimeSeries timeSeries = (TimeSeries)theEObject;
				T result = caseTimeSeries(timeSeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT: {
				TimeSeriesPoint timeSeriesPoint = (TimeSeriesPoint)theEObject;
				T result = caseTimeSeriesPoint(timeSeriesPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT: {
				MicroserviceOperationTimeSeriesPoint microserviceOperationTimeSeriesPoint = (MicroserviceOperationTimeSeriesPoint)theEObject;
				T result = caseMicroserviceOperationTimeSeriesPoint(microserviceOperationTimeSeriesPoint);
				if (result == null) result = caseTimeSeriesPoint(microserviceOperationTimeSeriesPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE: {
				MetaModelStructure metaModelStructure = (MetaModelStructure)theEObject;
				T result = caseMetaModelStructure(metaModelStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroservice(Microservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anomaly Injector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anomaly Injector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnomalyInjector(AnomalyInjector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoint(Endpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRESTOperation(RESTOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroserviceType(MicroserviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroserviceRepository(MicroserviceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHost(Host object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualHost(VirtualHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalHost(PhysicalHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureModel(InfrastructureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyModel(DependencyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation To Operation Calling Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationToOperationCallingDependency(OperationToOperationCallingDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSeries(TimeSeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Series Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSeriesPoint(TimeSeriesPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice Operation Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice Operation Time Series Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroserviceOperationTimeSeriesPoint(MicroserviceOperationTimeSeriesPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModelStructure(MetaModelStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AnotherMicroserviceMetamodelSwitch
