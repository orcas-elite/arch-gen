/**
 */
package microserviceMetamodel.impl;

import microserviceMetamodel.AnomalyInjector;
import microserviceMetamodel.AnotherMicroserviceMetamodelFactory;
import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.Configuration;
import microserviceMetamodel.DependencyModel;
import microserviceMetamodel.Endpoint;
import microserviceMetamodel.ExecutionEnvironment;
import microserviceMetamodel.Host;
import microserviceMetamodel.InfrastructureModel;
import microserviceMetamodel.MetaModelStructure;
import microserviceMetamodel.Microservice;
import microserviceMetamodel.MicroserviceOperationTimeSeriesPoint;
import microserviceMetamodel.MicroserviceRepository;
import microserviceMetamodel.MicroserviceType;
import microserviceMetamodel.OperationToOperationCallingDependency;
import microserviceMetamodel.PhysicalHost;
import microserviceMetamodel.RESTOperation;
import microserviceMetamodel.RESTVerb;
import microserviceMetamodel.TimeSeries;
import microserviceMetamodel.TimeSeriesPoint;
import microserviceMetamodel.Version;
import microserviceMetamodel.VirtualHost;
import microserviceMetamodel.util.AnotherMicroserviceMetamodelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnotherMicroserviceMetamodelPackageImpl extends EPackageImpl implements AnotherMicroserviceMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anomalyInjectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationToOperationCallingDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSeriesPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceOperationTimeSeriesPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restVerbEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnotherMicroserviceMetamodelPackageImpl() {
		super(eNS_URI, AnotherMicroserviceMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AnotherMicroserviceMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnotherMicroserviceMetamodelPackage init() {
		if (isInited) return (AnotherMicroserviceMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(AnotherMicroserviceMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		AnotherMicroserviceMetamodelPackageImpl theAnotherMicroserviceMetamodelPackage = (AnotherMicroserviceMetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnotherMicroserviceMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnotherMicroserviceMetamodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnotherMicroserviceMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theAnotherMicroserviceMetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAnotherMicroserviceMetamodelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AnotherMicroserviceMetamodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAnotherMicroserviceMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnotherMicroserviceMetamodelPackage.eNS_URI, theAnotherMicroserviceMetamodelPackage);
		return theAnotherMicroserviceMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Environment() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Endpoints() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_MicroserviceType() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroservice_Version() {
		return (EReference)microserviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroservice_Uuid() {
		return (EAttribute)microserviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Microservices() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment() {
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionEnvironment_Microservices() {
		return (EReference)executionEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnomalyInjector() {
		return anomalyInjectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_VersionString() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint() {
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndpoint_RestOperations() {
		return (EReference)endpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_IpAddress() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Port() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Url() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpoint_Protocol() {
		return (EAttribute)endpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRESTOperation() {
		return restOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTOperation_Name() {
		return (EAttribute)restOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTOperation_SubPath() {
		return (EAttribute)restOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTOperation_RestVerb() {
		return (EAttribute)restOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroserviceType() {
		return microserviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceType_RestOperations() {
		return (EReference)microserviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceType_Microservices() {
		return (EReference)microserviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceType_Versions() {
		return (EReference)microserviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroserviceType_Identifier() {
		return (EAttribute)microserviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceType_Dependencies() {
		return (EReference)microserviceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroserviceRepository() {
		return microserviceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceRepository_MicroserviceTypes() {
		return (EReference)microserviceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHost() {
		return hostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_Containers() {
		return (EReference)hostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Hostname() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Host() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualHost() {
		return virtualHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualHost_ParentHost() {
		return (EReference)virtualHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalHost() {
		return physicalHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalHost_VirtualHosts() {
		return (EReference)physicalHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureModel() {
		return infrastructureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureModel_Hosts() {
		return (EReference)infrastructureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyModel() {
		return dependencyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyModel_OperationToOperationCallingDependencies() {
		return (EReference)dependencyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationToOperationCallingDependency() {
		return operationToOperationCallingDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationCallingDependency_CallingMicroservice() {
		return (EReference)operationToOperationCallingDependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationCallingDependency_CalledMicroservice() {
		return (EReference)operationToOperationCallingDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationCallingDependency_CalledOperation() {
		return (EReference)operationToOperationCallingDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationCallingDependency_CallingOperation() {
		return (EReference)operationToOperationCallingDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationCallingDependency_CallingVersion() {
		return (EReference)operationToOperationCallingDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSeries() {
		return timeSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeries_TimeSeriesPoints() {
		return (EReference)timeSeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSeriesPoint() {
		return timeSeriesPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeriesPoint_TimeSeries() {
		return (EReference)timeSeriesPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroserviceOperationTimeSeriesPoint() {
		return microserviceOperationTimeSeriesPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceOperationTimeSeriesPoint_Endpoint() {
		return (EReference)microserviceOperationTimeSeriesPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceOperationTimeSeriesPoint_RestOperation() {
		return (EReference)microserviceOperationTimeSeriesPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModelStructure() {
		return metaModelStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelStructure_Infrastructure() {
		return (EReference)metaModelStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelStructure_Configurations() {
		return (EReference)metaModelStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelStructure_Dependencies() {
		return (EReference)metaModelStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelStructure_TimeSeries() {
		return (EReference)metaModelStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelStructure_MicroserviceRepository() {
		return (EReference)metaModelStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRESTVerb() {
		return restVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherMicroserviceMetamodelFactory getAnotherMicroserviceMetamodelFactory() {
		return (AnotherMicroserviceMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		microserviceEClass = createEClass(MICROSERVICE);
		createEReference(microserviceEClass, MICROSERVICE__ENVIRONMENT);
		createEReference(microserviceEClass, MICROSERVICE__ENDPOINTS);
		createEReference(microserviceEClass, MICROSERVICE__MICROSERVICE_TYPE);
		createEReference(microserviceEClass, MICROSERVICE__VERSION);
		createEAttribute(microserviceEClass, MICROSERVICE__UUID);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__MICROSERVICES);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);
		createEReference(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__MICROSERVICES);

		anomalyInjectorEClass = createEClass(ANOMALY_INJECTOR);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VERSION_STRING);

		endpointEClass = createEClass(ENDPOINT);
		createEReference(endpointEClass, ENDPOINT__REST_OPERATIONS);
		createEAttribute(endpointEClass, ENDPOINT__IP_ADDRESS);
		createEAttribute(endpointEClass, ENDPOINT__PORT);
		createEAttribute(endpointEClass, ENDPOINT__URL);
		createEAttribute(endpointEClass, ENDPOINT__PROTOCOL);

		restOperationEClass = createEClass(REST_OPERATION);
		createEAttribute(restOperationEClass, REST_OPERATION__NAME);
		createEAttribute(restOperationEClass, REST_OPERATION__SUB_PATH);
		createEAttribute(restOperationEClass, REST_OPERATION__REST_VERB);

		microserviceTypeEClass = createEClass(MICROSERVICE_TYPE);
		createEReference(microserviceTypeEClass, MICROSERVICE_TYPE__REST_OPERATIONS);
		createEReference(microserviceTypeEClass, MICROSERVICE_TYPE__MICROSERVICES);
		createEReference(microserviceTypeEClass, MICROSERVICE_TYPE__VERSIONS);
		createEAttribute(microserviceTypeEClass, MICROSERVICE_TYPE__IDENTIFIER);
		createEReference(microserviceTypeEClass, MICROSERVICE_TYPE__DEPENDENCIES);

		microserviceRepositoryEClass = createEClass(MICROSERVICE_REPOSITORY);
		createEReference(microserviceRepositoryEClass, MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES);

		hostEClass = createEClass(HOST);
		createEReference(hostEClass, HOST__CONTAINERS);
		createEAttribute(hostEClass, HOST__HOSTNAME);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__HOST);

		virtualHostEClass = createEClass(VIRTUAL_HOST);
		createEReference(virtualHostEClass, VIRTUAL_HOST__PARENT_HOST);

		physicalHostEClass = createEClass(PHYSICAL_HOST);
		createEReference(physicalHostEClass, PHYSICAL_HOST__VIRTUAL_HOSTS);

		infrastructureModelEClass = createEClass(INFRASTRUCTURE_MODEL);
		createEReference(infrastructureModelEClass, INFRASTRUCTURE_MODEL__HOSTS);

		dependencyModelEClass = createEClass(DEPENDENCY_MODEL);
		createEReference(dependencyModelEClass, DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES);

		operationToOperationCallingDependencyEClass = createEClass(OPERATION_TO_OPERATION_CALLING_DEPENDENCY);
		createEReference(operationToOperationCallingDependencyEClass, OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE);
		createEReference(operationToOperationCallingDependencyEClass, OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION);
		createEReference(operationToOperationCallingDependencyEClass, OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION);
		createEReference(operationToOperationCallingDependencyEClass, OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION);
		createEReference(operationToOperationCallingDependencyEClass, OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE);

		timeSeriesEClass = createEClass(TIME_SERIES);
		createEReference(timeSeriesEClass, TIME_SERIES__TIME_SERIES_POINTS);

		timeSeriesPointEClass = createEClass(TIME_SERIES_POINT);
		createEReference(timeSeriesPointEClass, TIME_SERIES_POINT__TIME_SERIES);

		microserviceOperationTimeSeriesPointEClass = createEClass(MICROSERVICE_OPERATION_TIME_SERIES_POINT);
		createEReference(microserviceOperationTimeSeriesPointEClass, MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT);
		createEReference(microserviceOperationTimeSeriesPointEClass, MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION);

		metaModelStructureEClass = createEClass(META_MODEL_STRUCTURE);
		createEReference(metaModelStructureEClass, META_MODEL_STRUCTURE__INFRASTRUCTURE);
		createEReference(metaModelStructureEClass, META_MODEL_STRUCTURE__CONFIGURATIONS);
		createEReference(metaModelStructureEClass, META_MODEL_STRUCTURE__DEPENDENCIES);
		createEReference(metaModelStructureEClass, META_MODEL_STRUCTURE__TIME_SERIES);
		createEReference(metaModelStructureEClass, META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY);

		// Create enums
		restVerbEEnum = createEEnum(REST_VERB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hostEClass.getESuperTypes().add(this.getExecutionEnvironment());
		containerEClass.getESuperTypes().add(this.getExecutionEnvironment());
		virtualHostEClass.getESuperTypes().add(this.getHost());
		physicalHostEClass.getESuperTypes().add(this.getHost());
		microserviceOperationTimeSeriesPointEClass.getESuperTypes().add(this.getTimeSeriesPoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(microserviceEClass, Microservice.class, "Microservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroservice_Environment(), this.getExecutionEnvironment(), this.getExecutionEnvironment_Microservices(), "environment", null, 1, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Endpoints(), this.getEndpoint(), null, "endpoints", null, 1, -1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_MicroserviceType(), this.getMicroserviceType(), this.getMicroserviceType_Microservices(), "microserviceType", null, 1, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroservice_Version(), this.getVersion(), null, "version", null, 1, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroservice_Uuid(), theXMLTypePackage.getString(), "uuid", null, 1, 1, Microservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Microservices(), this.getMicroservice(), null, "microservices", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionEnvironment_Microservices(), this.getMicroservice(), this.getMicroservice_Environment(), "microservices", null, 0, -1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anomalyInjectorEClass, AnomalyInjector.class, "AnomalyInjector", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_VersionString(), ecorePackage.getEString(), "versionString", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndpoint_RestOperations(), this.getRESTOperation(), null, "restOperations", null, 1, -1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Port(), theXMLTypePackage.getIntObject(), "port", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Url(), ecorePackage.getEString(), "url", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpoint_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restOperationEClass, RESTOperation.class, "RESTOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRESTOperation_Name(), ecorePackage.getEString(), "name", null, 1, 1, RESTOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTOperation_SubPath(), ecorePackage.getEString(), "subPath", null, 1, 1, RESTOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTOperation_RestVerb(), this.getRESTVerb(), "restVerb", null, 1, 1, RESTOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microserviceTypeEClass, MicroserviceType.class, "MicroserviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroserviceType_RestOperations(), this.getRESTOperation(), null, "restOperations", null, 0, -1, MicroserviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroserviceType_Microservices(), this.getMicroservice(), this.getMicroservice_MicroserviceType(), "microservices", null, 0, -1, MicroserviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroserviceType_Versions(), this.getVersion(), null, "versions", null, 1, -1, MicroserviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroserviceType_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, MicroserviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroserviceType_Dependencies(), this.getOperationToOperationCallingDependency(), this.getOperationToOperationCallingDependency_CallingMicroservice(), "dependencies", null, 0, -1, MicroserviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microserviceRepositoryEClass, MicroserviceRepository.class, "MicroserviceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroserviceRepository_MicroserviceTypes(), this.getMicroserviceType(), null, "microserviceTypes", null, 1, -1, MicroserviceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostEClass, Host.class, "Host", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHost_Containers(), this.getContainer(), this.getContainer_Host(), "containers", null, 0, -1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Hostname(), ecorePackage.getEString(), "hostname", null, 1, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, microserviceMetamodel.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Host(), this.getHost(), this.getHost_Containers(), "host", null, 1, 1, microserviceMetamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualHostEClass, VirtualHost.class, "VirtualHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualHost_ParentHost(), this.getPhysicalHost(), this.getPhysicalHost_VirtualHosts(), "parentHost", null, 1, 1, VirtualHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalHostEClass, PhysicalHost.class, "PhysicalHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalHost_VirtualHosts(), this.getVirtualHost(), this.getVirtualHost_ParentHost(), "virtualHosts", null, 0, -1, PhysicalHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureModelEClass, InfrastructureModel.class, "InfrastructureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureModel_Hosts(), this.getPhysicalHost(), null, "hosts", null, 1, -1, InfrastructureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyModelEClass, DependencyModel.class, "DependencyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyModel_OperationToOperationCallingDependencies(), this.getOperationToOperationCallingDependency(), null, "operationToOperationCallingDependencies", null, 0, -1, DependencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationToOperationCallingDependencyEClass, OperationToOperationCallingDependency.class, "OperationToOperationCallingDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationToOperationCallingDependency_CalledMicroservice(), this.getMicroserviceType(), null, "calledMicroservice", null, 1, 1, OperationToOperationCallingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationToOperationCallingDependency_CalledOperation(), this.getRESTOperation(), null, "calledOperation", null, 1, 1, OperationToOperationCallingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationToOperationCallingDependency_CallingOperation(), this.getRESTOperation(), null, "callingOperation", null, 1, 1, OperationToOperationCallingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationToOperationCallingDependency_CallingVersion(), this.getVersion(), null, "callingVersion", null, 1, 1, OperationToOperationCallingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationToOperationCallingDependency_CallingMicroservice(), this.getMicroserviceType(), this.getMicroserviceType_Dependencies(), "callingMicroservice", null, 1, 1, OperationToOperationCallingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSeriesEClass, TimeSeries.class, "TimeSeries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSeries_TimeSeriesPoints(), this.getTimeSeriesPoint(), this.getTimeSeriesPoint_TimeSeries(), "timeSeriesPoints", null, 0, -1, TimeSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSeriesPointEClass, TimeSeriesPoint.class, "TimeSeriesPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSeriesPoint_TimeSeries(), this.getTimeSeries(), this.getTimeSeries_TimeSeriesPoints(), "timeSeries", null, 1, 1, TimeSeriesPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microserviceOperationTimeSeriesPointEClass, MicroserviceOperationTimeSeriesPoint.class, "MicroserviceOperationTimeSeriesPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroserviceOperationTimeSeriesPoint_Endpoint(), this.getEndpoint(), null, "endpoint", null, 1, 1, MicroserviceOperationTimeSeriesPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroserviceOperationTimeSeriesPoint_RestOperation(), this.getRESTOperation(), null, "restOperation", null, 1, 1, MicroserviceOperationTimeSeriesPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaModelStructureEClass, MetaModelStructure.class, "MetaModelStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaModelStructure_Infrastructure(), this.getInfrastructureModel(), null, "infrastructure", null, 1, 1, MetaModelStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelStructure_Configurations(), this.getConfiguration(), null, "configurations", null, 1, -1, MetaModelStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelStructure_Dependencies(), this.getDependencyModel(), null, "dependencies", null, 1, 1, MetaModelStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelStructure_TimeSeries(), this.getTimeSeries(), null, "timeSeries", null, 1, 1, MetaModelStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelStructure_MicroserviceRepository(), this.getMicroserviceRepository(), null, "microserviceRepository", null, 1, 1, MetaModelStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(restVerbEEnum, RESTVerb.class, "RESTVerb");
		addEEnumLiteral(restVerbEEnum, RESTVerb.GET);
		addEEnumLiteral(restVerbEEnum, RESTVerb.PUT);
		addEEnumLiteral(restVerbEEnum, RESTVerb.POST);
		addEEnumLiteral(restVerbEEnum, RESTVerb.DELETE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore.xml.type", "http://www.eclipse.org/emf/2003/XMLType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (microserviceEClass, 
		   source, 
		   new String[] {
			 "constraints", "typeAndVersionMatch"
		   });	
		addAnnotation
		  (operationToOperationCallingDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "calledCorrespond callingCorrespond callingVersionFits"
		   });	
		addAnnotation
		  (microserviceOperationTimeSeriesPointEClass, 
		   source, 
		   new String[] {
			 "constraints", "nonNullReferences correspondingReferences"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (microserviceEClass, 
		   source, 
		   new String[] {
			 "typeAndVersionMatch", "microserviceType.versions->select(v:Version | v = version)->notEmpty()"
		   });	
		addAnnotation
		  (operationToOperationCallingDependencyEClass, 
		   source, 
		   new String[] {
			 "calledCorrespond", "calledMicroservice.restOperations->select(rop:RESTOperation | rop=calledOperation)->notEmpty()",
			 "callingCorrespond", "callingMicroservice.restOperations->select(rop:RESTOperation | rop=callingOperation)->notEmpty()",
			 "callingVersionFits", "callingMicroservice.versions->select(ver:Version|ver=callingVersion)->notEmpty()"
		   });	
		addAnnotation
		  (microserviceOperationTimeSeriesPointEClass, 
		   source, 
		   new String[] {
			 "nonNullReferences", "endpoint <> null and restOperation <> null",
			 "correspondingReferences", "endpoint.restOperations->select(rop:RESTOperation | rop = restOperation)->notEmpty()"
		   });
	}

} //AnotherMicroserviceMetamodelPackageImpl
