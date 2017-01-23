/**
 */
package microserviceMetamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import microserviceMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage
 * @generated
 */
public class AnotherMicroserviceMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnotherMicroserviceMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherMicroserviceMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnotherMicroserviceMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnotherMicroserviceMetamodelSwitch<Adapter> modelSwitch =
		new AnotherMicroserviceMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseMicroservice(Microservice object) {
				return createMicroserviceAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironment(ExecutionEnvironment object) {
				return createExecutionEnvironmentAdapter();
			}
			@Override
			public Adapter caseAnomalyInjector(AnomalyInjector object) {
				return createAnomalyInjectorAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object) {
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseRESTOperation(RESTOperation object) {
				return createRESTOperationAdapter();
			}
			@Override
			public Adapter caseMicroserviceType(MicroserviceType object) {
				return createMicroserviceTypeAdapter();
			}
			@Override
			public Adapter caseMicroserviceRepository(MicroserviceRepository object) {
				return createMicroserviceRepositoryAdapter();
			}
			@Override
			public Adapter caseHost(Host object) {
				return createHostAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseVirtualHost(VirtualHost object) {
				return createVirtualHostAdapter();
			}
			@Override
			public Adapter casePhysicalHost(PhysicalHost object) {
				return createPhysicalHostAdapter();
			}
			@Override
			public Adapter caseInfrastructureModel(InfrastructureModel object) {
				return createInfrastructureModelAdapter();
			}
			@Override
			public Adapter caseDependencyModel(DependencyModel object) {
				return createDependencyModelAdapter();
			}
			@Override
			public Adapter caseOperationToOperationCallingDependency(OperationToOperationCallingDependency object) {
				return createOperationToOperationCallingDependencyAdapter();
			}
			@Override
			public Adapter caseTimeSeries(TimeSeries object) {
				return createTimeSeriesAdapter();
			}
			@Override
			public Adapter caseTimeSeriesPoint(TimeSeriesPoint object) {
				return createTimeSeriesPointAdapter();
			}
			@Override
			public Adapter caseMicroserviceOperationTimeSeriesPoint(MicroserviceOperationTimeSeriesPoint object) {
				return createMicroserviceOperationTimeSeriesPointAdapter();
			}
			@Override
			public Adapter caseMetaModelStructure(MetaModelStructure object) {
				return createMetaModelStructureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.AnomalyInjector <em>Anomaly Injector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.AnomalyInjector
	 * @generated
	 */
	public Adapter createAnomalyInjectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.RESTOperation <em>REST Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.RESTOperation
	 * @generated
	 */
	public Adapter createRESTOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.MicroserviceType <em>Microservice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.MicroserviceType
	 * @generated
	 */
	public Adapter createMicroserviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.MicroserviceRepository <em>Microservice Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.MicroserviceRepository
	 * @generated
	 */
	public Adapter createMicroserviceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.Host
	 * @generated
	 */
	public Adapter createHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.VirtualHost <em>Virtual Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.VirtualHost
	 * @generated
	 */
	public Adapter createVirtualHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.PhysicalHost <em>Physical Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.PhysicalHost
	 * @generated
	 */
	public Adapter createPhysicalHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.InfrastructureModel <em>Infrastructure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.InfrastructureModel
	 * @generated
	 */
	public Adapter createInfrastructureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.DependencyModel <em>Dependency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.DependencyModel
	 * @generated
	 */
	public Adapter createDependencyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.OperationToOperationCallingDependency <em>Operation To Operation Calling Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.OperationToOperationCallingDependency
	 * @generated
	 */
	public Adapter createOperationToOperationCallingDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.TimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.TimeSeries
	 * @generated
	 */
	public Adapter createTimeSeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.TimeSeriesPoint <em>Time Series Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.TimeSeriesPoint
	 * @generated
	 */
	public Adapter createTimeSeriesPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint <em>Microservice Operation Time Series Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.MicroserviceOperationTimeSeriesPoint
	 * @generated
	 */
	public Adapter createMicroserviceOperationTimeSeriesPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link microserviceMetamodel.MetaModelStructure <em>Meta Model Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see microserviceMetamodel.MetaModelStructure
	 * @generated
	 */
	public Adapter createMetaModelStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnotherMicroserviceMetamodelAdapterFactory
