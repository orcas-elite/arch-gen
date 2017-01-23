/**
 */
package microserviceMetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import microserviceMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnotherMicroserviceMetamodelFactoryImpl extends EFactoryImpl implements AnotherMicroserviceMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnotherMicroserviceMetamodelFactory init() {
		try {
			AnotherMicroserviceMetamodelFactory theAnotherMicroserviceMetamodelFactory = (AnotherMicroserviceMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(AnotherMicroserviceMetamodelPackage.eNS_URI);
			if (theAnotherMicroserviceMetamodelFactory != null) {
				return theAnotherMicroserviceMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnotherMicroserviceMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherMicroserviceMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE: return createMicroservice();
			case AnotherMicroserviceMetamodelPackage.CONFIGURATION: return createConfiguration();
			case AnotherMicroserviceMetamodelPackage.VERSION: return createVersion();
			case AnotherMicroserviceMetamodelPackage.ENDPOINT: return createEndpoint();
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION: return createRESTOperation();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE: return createMicroserviceType();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY: return createMicroserviceRepository();
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST: return createVirtualHost();
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST: return createPhysicalHost();
			case AnotherMicroserviceMetamodelPackage.INFRASTRUCTURE_MODEL: return createInfrastructureModel();
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL: return createDependencyModel();
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY: return createOperationToOperationCallingDependency();
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES: return createTimeSeries();
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT: return createTimeSeriesPoint();
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT: return createMicroserviceOperationTimeSeriesPoint();
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE: return createMetaModelStructure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AnotherMicroserviceMetamodelPackage.REST_VERB:
				return createRESTVerbFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AnotherMicroserviceMetamodelPackage.REST_VERB:
				return convertRESTVerbToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTOperation createRESTOperation() {
		RESTOperationImpl restOperation = new RESTOperationImpl();
		return restOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceType createMicroserviceType() {
		MicroserviceTypeImpl microserviceType = new MicroserviceTypeImpl();
		return microserviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceRepository createMicroserviceRepository() {
		MicroserviceRepositoryImpl microserviceRepository = new MicroserviceRepositoryImpl();
		return microserviceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualHost createVirtualHost() {
		VirtualHostImpl virtualHost = new VirtualHostImpl();
		return virtualHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalHost createPhysicalHost() {
		PhysicalHostImpl physicalHost = new PhysicalHostImpl();
		return physicalHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureModel createInfrastructureModel() {
		InfrastructureModelImpl infrastructureModel = new InfrastructureModelImpl();
		return infrastructureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyModel createDependencyModel() {
		DependencyModelImpl dependencyModel = new DependencyModelImpl();
		return dependencyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationToOperationCallingDependency createOperationToOperationCallingDependency() {
		OperationToOperationCallingDependencyImpl operationToOperationCallingDependency = new OperationToOperationCallingDependencyImpl();
		return operationToOperationCallingDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeries createTimeSeries() {
		TimeSeriesImpl timeSeries = new TimeSeriesImpl();
		return timeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeriesPoint createTimeSeriesPoint() {
		TimeSeriesPointImpl timeSeriesPoint = new TimeSeriesPointImpl();
		return timeSeriesPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceOperationTimeSeriesPoint createMicroserviceOperationTimeSeriesPoint() {
		MicroserviceOperationTimeSeriesPointImpl microserviceOperationTimeSeriesPoint = new MicroserviceOperationTimeSeriesPointImpl();
		return microserviceOperationTimeSeriesPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelStructure createMetaModelStructure() {
		MetaModelStructureImpl metaModelStructure = new MetaModelStructureImpl();
		return metaModelStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTVerb createRESTVerbFromString(EDataType eDataType, String initialValue) {
		RESTVerb result = RESTVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRESTVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherMicroserviceMetamodelPackage getAnotherMicroserviceMetamodelPackage() {
		return (AnotherMicroserviceMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnotherMicroserviceMetamodelPackage getPackage() {
		return AnotherMicroserviceMetamodelPackage.eINSTANCE;
	}

} //AnotherMicroserviceMetamodelFactoryImpl
