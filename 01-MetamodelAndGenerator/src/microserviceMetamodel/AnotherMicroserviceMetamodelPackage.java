/**
 */
package microserviceMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AnotherMicroserviceMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anotherMicroserviceMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/anotherMicroserviceMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anotherMicroserviceMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnotherMicroserviceMetamodelPackage eINSTANCE = microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.MicroserviceImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ENDPOINTS = 1;

	/**
	 * The feature id for the '<em><b>Microservice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__MICROSERVICE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__UUID = 4;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.ConfigurationImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MICROSERVICES = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.ExecutionEnvironmentImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getExecutionEnvironment()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__MICROSERVICES = 0;

	/**
	 * The number of structural features of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.AnomalyInjector <em>Anomaly Injector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.AnomalyInjector
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getAnomalyInjector()
	 * @generated
	 */
	int ANOMALY_INJECTOR = 3;

	/**
	 * The number of structural features of the '<em>Anomaly Injector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY_INJECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Anomaly Injector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY_INJECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.VersionImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 4;

	/**
	 * The feature id for the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_STRING = 0;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.EndpointImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 5;

	/**
	 * The feature id for the '<em><b>Rest Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__REST_OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__IP_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__PORT = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__URL = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__PROTOCOL = 4;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.RESTOperationImpl <em>REST Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.RESTOperationImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getRESTOperation()
	 * @generated
	 */
	int REST_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION__SUB_PATH = 1;

	/**
	 * The feature id for the '<em><b>Rest Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION__REST_VERB = 2;

	/**
	 * The number of structural features of the '<em>REST Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>REST Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.MicroserviceTypeImpl <em>Microservice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.MicroserviceTypeImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroserviceType()
	 * @generated
	 */
	int MICROSERVICE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Rest Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_TYPE__REST_OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_TYPE__MICROSERVICES = 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_TYPE__VERSIONS = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_TYPE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_TYPE__DEPENDENCIES = 4;

	/**
	 * The number of structural features of the '<em>Microservice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Microservice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.MicroserviceRepositoryImpl <em>Microservice Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.MicroserviceRepositoryImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroserviceRepository()
	 * @generated
	 */
	int MICROSERVICE_REPOSITORY = 8;

	/**
	 * The feature id for the '<em><b>Microservice Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Microservice Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Microservice Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.HostImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getHost()
	 * @generated
	 */
	int HOST = 9;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__MICROSERVICES = EXECUTION_ENVIRONMENT__MICROSERVICES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__CONTAINERS = EXECUTION_ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOSTNAME = EXECUTION_ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = EXECUTION_ENVIRONMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_OPERATION_COUNT = EXECUTION_ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.ContainerImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MICROSERVICES = EXECUTION_ENVIRONMENT__MICROSERVICES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HOST = EXECUTION_ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = EXECUTION_ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = EXECUTION_ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.VirtualHostImpl <em>Virtual Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.VirtualHostImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getVirtualHost()
	 * @generated
	 */
	int VIRTUAL_HOST = 11;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HOST__MICROSERVICES = HOST__MICROSERVICES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HOST__CONTAINERS = HOST__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HOST__HOSTNAME = HOST__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Parent Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HOST__PARENT_HOST = HOST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HOST_FEATURE_COUNT = HOST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HOST_OPERATION_COUNT = HOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.PhysicalHostImpl <em>Physical Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.PhysicalHostImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getPhysicalHost()
	 * @generated
	 */
	int PHYSICAL_HOST = 12;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_HOST__MICROSERVICES = HOST__MICROSERVICES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_HOST__CONTAINERS = HOST__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_HOST__HOSTNAME = HOST__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Virtual Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_HOST__VIRTUAL_HOSTS = HOST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_HOST_FEATURE_COUNT = HOST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_HOST_OPERATION_COUNT = HOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.InfrastructureModelImpl <em>Infrastructure Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.InfrastructureModelImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getInfrastructureModel()
	 * @generated
	 */
	int INFRASTRUCTURE_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MODEL__HOSTS = 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Infrastructure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.DependencyModelImpl <em>Dependency Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.DependencyModelImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getDependencyModel()
	 * @generated
	 */
	int DEPENDENCY_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Operation To Operation Calling Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Dependency Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependency Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl <em>Operation To Operation Calling Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getOperationToOperationCallingDependency()
	 * @generated
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY = 15;

	/**
	 * The feature id for the '<em><b>Called Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE = 0;

	/**
	 * The feature id for the '<em><b>Called Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Calling Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Calling Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Calling Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE = 4;

	/**
	 * The number of structural features of the '<em>Operation To Operation Calling Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operation To Operation Calling Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_CALLING_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.TimeSeriesImpl <em>Time Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.TimeSeriesImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getTimeSeries()
	 * @generated
	 */
	int TIME_SERIES = 16;

	/**
	 * The feature id for the '<em><b>Time Series Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__TIME_SERIES_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.TimeSeriesPointImpl <em>Time Series Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.TimeSeriesPointImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getTimeSeriesPoint()
	 * @generated
	 */
	int TIME_SERIES_POINT = 17;

	/**
	 * The feature id for the '<em><b>Time Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_POINT__TIME_SERIES = 0;

	/**
	 * The number of structural features of the '<em>Time Series Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Series Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.MicroserviceOperationTimeSeriesPointImpl <em>Microservice Operation Time Series Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.MicroserviceOperationTimeSeriesPointImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroserviceOperationTimeSeriesPoint()
	 * @generated
	 */
	int MICROSERVICE_OPERATION_TIME_SERIES_POINT = 18;

	/**
	 * The feature id for the '<em><b>Time Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_TIME_SERIES_POINT__TIME_SERIES = TIME_SERIES_POINT__TIME_SERIES;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT = TIME_SERIES_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rest Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION = TIME_SERIES_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Microservice Operation Time Series Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_TIME_SERIES_POINT_FEATURE_COUNT = TIME_SERIES_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Microservice Operation Time Series Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_TIME_SERIES_POINT_OPERATION_COUNT = TIME_SERIES_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.impl.MetaModelStructureImpl <em>Meta Model Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.impl.MetaModelStructureImpl
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMetaModelStructure()
	 * @generated
	 */
	int META_MODEL_STRUCTURE = 19;

	/**
	 * The feature id for the '<em><b>Infrastructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_STRUCTURE__INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_STRUCTURE__CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_STRUCTURE__DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_STRUCTURE__TIME_SERIES = 3;

	/**
	 * The feature id for the '<em><b>Microservice Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY = 4;

	/**
	 * The number of structural features of the '<em>Meta Model Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Meta Model Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link microserviceMetamodel.RESTVerb <em>REST Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microserviceMetamodel.RESTVerb
	 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getRESTVerb()
	 * @generated
	 */
	int REST_VERB = 20;


	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see microserviceMetamodel.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.Microservice#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see microserviceMetamodel.Microservice#getEnvironment()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.Microservice#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see microserviceMetamodel.Microservice#getEndpoints()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Endpoints();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.Microservice#getMicroserviceType <em>Microservice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microservice Type</em>'.
	 * @see microserviceMetamodel.Microservice#getMicroserviceType()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_MicroserviceType();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.Microservice#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see microserviceMetamodel.Microservice#getVersion()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Version();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.Microservice#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see microserviceMetamodel.Microservice#getUuid()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Uuid();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see microserviceMetamodel.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.Configuration#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservices</em>'.
	 * @see microserviceMetamodel.Configuration#getMicroservices()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Microservices();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment</em>'.
	 * @see microserviceMetamodel.ExecutionEnvironment
	 * @generated
	 */
	EClass getExecutionEnvironment();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodel.ExecutionEnvironment#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Microservices</em>'.
	 * @see microserviceMetamodel.ExecutionEnvironment#getMicroservices()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Microservices();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.AnomalyInjector <em>Anomaly Injector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anomaly Injector</em>'.
	 * @see microserviceMetamodel.AnomalyInjector
	 * @generated
	 */
	EClass getAnomalyInjector();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see microserviceMetamodel.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.Version#getVersionString <em>Version String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version String</em>'.
	 * @see microserviceMetamodel.Version#getVersionString()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionString();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see microserviceMetamodel.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodel.Endpoint#getRestOperations <em>Rest Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rest Operations</em>'.
	 * @see microserviceMetamodel.Endpoint#getRestOperations()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_RestOperations();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.Endpoint#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see microserviceMetamodel.Endpoint#getIpAddress()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.Endpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see microserviceMetamodel.Endpoint#getPort()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Port();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.Endpoint#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see microserviceMetamodel.Endpoint#getUrl()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Url();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.Endpoint#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see microserviceMetamodel.Endpoint#getProtocol()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Protocol();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.RESTOperation <em>REST Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Operation</em>'.
	 * @see microserviceMetamodel.RESTOperation
	 * @generated
	 */
	EClass getRESTOperation();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.RESTOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see microserviceMetamodel.RESTOperation#getName()
	 * @see #getRESTOperation()
	 * @generated
	 */
	EAttribute getRESTOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.RESTOperation#getSubPath <em>Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Path</em>'.
	 * @see microserviceMetamodel.RESTOperation#getSubPath()
	 * @see #getRESTOperation()
	 * @generated
	 */
	EAttribute getRESTOperation_SubPath();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.RESTOperation#getRestVerb <em>Rest Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest Verb</em>'.
	 * @see microserviceMetamodel.RESTOperation#getRestVerb()
	 * @see #getRESTOperation()
	 * @generated
	 */
	EAttribute getRESTOperation_RestVerb();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.MicroserviceType <em>Microservice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice Type</em>'.
	 * @see microserviceMetamodel.MicroserviceType
	 * @generated
	 */
	EClass getMicroserviceType();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.MicroserviceType#getRestOperations <em>Rest Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest Operations</em>'.
	 * @see microserviceMetamodel.MicroserviceType#getRestOperations()
	 * @see #getMicroserviceType()
	 * @generated
	 */
	EReference getMicroserviceType_RestOperations();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodel.MicroserviceType#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Microservices</em>'.
	 * @see microserviceMetamodel.MicroserviceType#getMicroservices()
	 * @see #getMicroserviceType()
	 * @generated
	 */
	EReference getMicroserviceType_Microservices();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.MicroserviceType#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see microserviceMetamodel.MicroserviceType#getVersions()
	 * @see #getMicroserviceType()
	 * @generated
	 */
	EReference getMicroserviceType_Versions();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.MicroserviceType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see microserviceMetamodel.MicroserviceType#getIdentifier()
	 * @see #getMicroserviceType()
	 * @generated
	 */
	EAttribute getMicroserviceType_Identifier();

	/**
	 * Returns the meta object for the reference list '{@link microserviceMetamodel.MicroserviceType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see microserviceMetamodel.MicroserviceType#getDependencies()
	 * @see #getMicroserviceType()
	 * @generated
	 */
	EReference getMicroserviceType_Dependencies();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.MicroserviceRepository <em>Microservice Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice Repository</em>'.
	 * @see microserviceMetamodel.MicroserviceRepository
	 * @generated
	 */
	EClass getMicroserviceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.MicroserviceRepository#getMicroserviceTypes <em>Microservice Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservice Types</em>'.
	 * @see microserviceMetamodel.MicroserviceRepository#getMicroserviceTypes()
	 * @see #getMicroserviceRepository()
	 * @generated
	 */
	EReference getMicroserviceRepository_MicroserviceTypes();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see microserviceMetamodel.Host
	 * @generated
	 */
	EClass getHost();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.Host#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see microserviceMetamodel.Host#getContainers()
	 * @see #getHost()
	 * @generated
	 */
	EReference getHost_Containers();

	/**
	 * Returns the meta object for the attribute '{@link microserviceMetamodel.Host#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see microserviceMetamodel.Host#getHostname()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Hostname();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see microserviceMetamodel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the container reference '{@link microserviceMetamodel.Container#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Host</em>'.
	 * @see microserviceMetamodel.Container#getHost()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Host();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.VirtualHost <em>Virtual Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Host</em>'.
	 * @see microserviceMetamodel.VirtualHost
	 * @generated
	 */
	EClass getVirtualHost();

	/**
	 * Returns the meta object for the container reference '{@link microserviceMetamodel.VirtualHost#getParentHost <em>Parent Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Host</em>'.
	 * @see microserviceMetamodel.VirtualHost#getParentHost()
	 * @see #getVirtualHost()
	 * @generated
	 */
	EReference getVirtualHost_ParentHost();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.PhysicalHost <em>Physical Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Host</em>'.
	 * @see microserviceMetamodel.PhysicalHost
	 * @generated
	 */
	EClass getPhysicalHost();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.PhysicalHost#getVirtualHosts <em>Virtual Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Hosts</em>'.
	 * @see microserviceMetamodel.PhysicalHost#getVirtualHosts()
	 * @see #getPhysicalHost()
	 * @generated
	 */
	EReference getPhysicalHost_VirtualHosts();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.InfrastructureModel <em>Infrastructure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Model</em>'.
	 * @see microserviceMetamodel.InfrastructureModel
	 * @generated
	 */
	EClass getInfrastructureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.InfrastructureModel#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see microserviceMetamodel.InfrastructureModel#getHosts()
	 * @see #getInfrastructureModel()
	 * @generated
	 */
	EReference getInfrastructureModel_Hosts();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.DependencyModel <em>Dependency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Model</em>'.
	 * @see microserviceMetamodel.DependencyModel
	 * @generated
	 */
	EClass getDependencyModel();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.DependencyModel#getOperationToOperationCallingDependencies <em>Operation To Operation Calling Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation To Operation Calling Dependencies</em>'.
	 * @see microserviceMetamodel.DependencyModel#getOperationToOperationCallingDependencies()
	 * @see #getDependencyModel()
	 * @generated
	 */
	EReference getDependencyModel_OperationToOperationCallingDependencies();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.OperationToOperationCallingDependency <em>Operation To Operation Calling Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation To Operation Calling Dependency</em>'.
	 * @see microserviceMetamodel.OperationToOperationCallingDependency
	 * @generated
	 */
	EClass getOperationToOperationCallingDependency();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingMicroservice <em>Calling Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calling Microservice</em>'.
	 * @see microserviceMetamodel.OperationToOperationCallingDependency#getCallingMicroservice()
	 * @see #getOperationToOperationCallingDependency()
	 * @generated
	 */
	EReference getOperationToOperationCallingDependency_CallingMicroservice();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCalledMicroservice <em>Called Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Microservice</em>'.
	 * @see microserviceMetamodel.OperationToOperationCallingDependency#getCalledMicroservice()
	 * @see #getOperationToOperationCallingDependency()
	 * @generated
	 */
	EReference getOperationToOperationCallingDependency_CalledMicroservice();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCalledOperation <em>Called Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Operation</em>'.
	 * @see microserviceMetamodel.OperationToOperationCallingDependency#getCalledOperation()
	 * @see #getOperationToOperationCallingDependency()
	 * @generated
	 */
	EReference getOperationToOperationCallingDependency_CalledOperation();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingOperation <em>Calling Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calling Operation</em>'.
	 * @see microserviceMetamodel.OperationToOperationCallingDependency#getCallingOperation()
	 * @see #getOperationToOperationCallingDependency()
	 * @generated
	 */
	EReference getOperationToOperationCallingDependency_CallingOperation();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingVersion <em>Calling Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calling Version</em>'.
	 * @see microserviceMetamodel.OperationToOperationCallingDependency#getCallingVersion()
	 * @see #getOperationToOperationCallingDependency()
	 * @generated
	 */
	EReference getOperationToOperationCallingDependency_CallingVersion();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.TimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Series</em>'.
	 * @see microserviceMetamodel.TimeSeries
	 * @generated
	 */
	EClass getTimeSeries();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.TimeSeries#getTimeSeriesPoints <em>Time Series Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Series Points</em>'.
	 * @see microserviceMetamodel.TimeSeries#getTimeSeriesPoints()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EReference getTimeSeries_TimeSeriesPoints();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.TimeSeriesPoint <em>Time Series Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Series Point</em>'.
	 * @see microserviceMetamodel.TimeSeriesPoint
	 * @generated
	 */
	EClass getTimeSeriesPoint();

	/**
	 * Returns the meta object for the container reference '{@link microserviceMetamodel.TimeSeriesPoint#getTimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Time Series</em>'.
	 * @see microserviceMetamodel.TimeSeriesPoint#getTimeSeries()
	 * @see #getTimeSeriesPoint()
	 * @generated
	 */
	EReference getTimeSeriesPoint_TimeSeries();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint <em>Microservice Operation Time Series Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice Operation Time Series Point</em>'.
	 * @see microserviceMetamodel.MicroserviceOperationTimeSeriesPoint
	 * @generated
	 */
	EClass getMicroserviceOperationTimeSeriesPoint();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint</em>'.
	 * @see microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getEndpoint()
	 * @see #getMicroserviceOperationTimeSeriesPoint()
	 * @generated
	 */
	EReference getMicroserviceOperationTimeSeriesPoint_Endpoint();

	/**
	 * Returns the meta object for the reference '{@link microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getRestOperation <em>Rest Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rest Operation</em>'.
	 * @see microserviceMetamodel.MicroserviceOperationTimeSeriesPoint#getRestOperation()
	 * @see #getMicroserviceOperationTimeSeriesPoint()
	 * @generated
	 */
	EReference getMicroserviceOperationTimeSeriesPoint_RestOperation();

	/**
	 * Returns the meta object for class '{@link microserviceMetamodel.MetaModelStructure <em>Meta Model Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Structure</em>'.
	 * @see microserviceMetamodel.MetaModelStructure
	 * @generated
	 */
	EClass getMetaModelStructure();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodel.MetaModelStructure#getInfrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infrastructure</em>'.
	 * @see microserviceMetamodel.MetaModelStructure#getInfrastructure()
	 * @see #getMetaModelStructure()
	 * @generated
	 */
	EReference getMetaModelStructure_Infrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link microserviceMetamodel.MetaModelStructure#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see microserviceMetamodel.MetaModelStructure#getConfigurations()
	 * @see #getMetaModelStructure()
	 * @generated
	 */
	EReference getMetaModelStructure_Configurations();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodel.MetaModelStructure#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see microserviceMetamodel.MetaModelStructure#getDependencies()
	 * @see #getMetaModelStructure()
	 * @generated
	 */
	EReference getMetaModelStructure_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodel.MetaModelStructure#getTimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Series</em>'.
	 * @see microserviceMetamodel.MetaModelStructure#getTimeSeries()
	 * @see #getMetaModelStructure()
	 * @generated
	 */
	EReference getMetaModelStructure_TimeSeries();

	/**
	 * Returns the meta object for the containment reference '{@link microserviceMetamodel.MetaModelStructure#getMicroserviceRepository <em>Microservice Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Microservice Repository</em>'.
	 * @see microserviceMetamodel.MetaModelStructure#getMicroserviceRepository()
	 * @see #getMetaModelStructure()
	 * @generated
	 */
	EReference getMetaModelStructure_MicroserviceRepository();

	/**
	 * Returns the meta object for enum '{@link microserviceMetamodel.RESTVerb <em>REST Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>REST Verb</em>'.
	 * @see microserviceMetamodel.RESTVerb
	 * @generated
	 */
	EEnum getRESTVerb();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnotherMicroserviceMetamodelFactory getAnotherMicroserviceMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.MicroserviceImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__ENVIRONMENT = eINSTANCE.getMicroservice_Environment();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__ENDPOINTS = eINSTANCE.getMicroservice_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Microservice Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__MICROSERVICE_TYPE = eINSTANCE.getMicroservice_MicroserviceType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__VERSION = eINSTANCE.getMicroservice_Version();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__UUID = eINSTANCE.getMicroservice_Uuid();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.ConfigurationImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MICROSERVICES = eINSTANCE.getConfiguration_Microservices();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.ExecutionEnvironmentImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getExecutionEnvironment()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__MICROSERVICES = eINSTANCE.getExecutionEnvironment_Microservices();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.AnomalyInjector <em>Anomaly Injector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.AnomalyInjector
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getAnomalyInjector()
		 * @generated
		 */
		EClass ANOMALY_INJECTOR = eINSTANCE.getAnomalyInjector();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.VersionImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Version String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_STRING = eINSTANCE.getVersion_VersionString();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.EndpointImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Rest Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__REST_OPERATIONS = eINSTANCE.getEndpoint_RestOperations();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__IP_ADDRESS = eINSTANCE.getEndpoint_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__PORT = eINSTANCE.getEndpoint_Port();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__URL = eINSTANCE.getEndpoint_Url();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__PROTOCOL = eINSTANCE.getEndpoint_Protocol();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.RESTOperationImpl <em>REST Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.RESTOperationImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getRESTOperation()
		 * @generated
		 */
		EClass REST_OPERATION = eINSTANCE.getRESTOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPERATION__NAME = eINSTANCE.getRESTOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPERATION__SUB_PATH = eINSTANCE.getRESTOperation_SubPath();

		/**
		 * The meta object literal for the '<em><b>Rest Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPERATION__REST_VERB = eINSTANCE.getRESTOperation_RestVerb();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.MicroserviceTypeImpl <em>Microservice Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.MicroserviceTypeImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroserviceType()
		 * @generated
		 */
		EClass MICROSERVICE_TYPE = eINSTANCE.getMicroserviceType();

		/**
		 * The meta object literal for the '<em><b>Rest Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_TYPE__REST_OPERATIONS = eINSTANCE.getMicroserviceType_RestOperations();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_TYPE__MICROSERVICES = eINSTANCE.getMicroserviceType_Microservices();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_TYPE__VERSIONS = eINSTANCE.getMicroserviceType_Versions();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE_TYPE__IDENTIFIER = eINSTANCE.getMicroserviceType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_TYPE__DEPENDENCIES = eINSTANCE.getMicroserviceType_Dependencies();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.MicroserviceRepositoryImpl <em>Microservice Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.MicroserviceRepositoryImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroserviceRepository()
		 * @generated
		 */
		EClass MICROSERVICE_REPOSITORY = eINSTANCE.getMicroserviceRepository();

		/**
		 * The meta object literal for the '<em><b>Microservice Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_REPOSITORY__MICROSERVICE_TYPES = eINSTANCE.getMicroserviceRepository_MicroserviceTypes();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.HostImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getHost()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST__CONTAINERS = eINSTANCE.getHost_Containers();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOSTNAME = eINSTANCE.getHost_Hostname();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.ContainerImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__HOST = eINSTANCE.getContainer_Host();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.VirtualHostImpl <em>Virtual Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.VirtualHostImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getVirtualHost()
		 * @generated
		 */
		EClass VIRTUAL_HOST = eINSTANCE.getVirtualHost();

		/**
		 * The meta object literal for the '<em><b>Parent Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_HOST__PARENT_HOST = eINSTANCE.getVirtualHost_ParentHost();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.PhysicalHostImpl <em>Physical Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.PhysicalHostImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getPhysicalHost()
		 * @generated
		 */
		EClass PHYSICAL_HOST = eINSTANCE.getPhysicalHost();

		/**
		 * The meta object literal for the '<em><b>Virtual Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_HOST__VIRTUAL_HOSTS = eINSTANCE.getPhysicalHost_VirtualHosts();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.InfrastructureModelImpl <em>Infrastructure Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.InfrastructureModelImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getInfrastructureModel()
		 * @generated
		 */
		EClass INFRASTRUCTURE_MODEL = eINSTANCE.getInfrastructureModel();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_MODEL__HOSTS = eINSTANCE.getInfrastructureModel_Hosts();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.DependencyModelImpl <em>Dependency Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.DependencyModelImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getDependencyModel()
		 * @generated
		 */
		EClass DEPENDENCY_MODEL = eINSTANCE.getDependencyModel();

		/**
		 * The meta object literal for the '<em><b>Operation To Operation Calling Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_MODEL__OPERATION_TO_OPERATION_CALLING_DEPENDENCIES = eINSTANCE.getDependencyModel_OperationToOperationCallingDependencies();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl <em>Operation To Operation Calling Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.OperationToOperationCallingDependencyImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getOperationToOperationCallingDependency()
		 * @generated
		 */
		EClass OPERATION_TO_OPERATION_CALLING_DEPENDENCY = eINSTANCE.getOperationToOperationCallingDependency();

		/**
		 * The meta object literal for the '<em><b>Calling Microservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_MICROSERVICE = eINSTANCE.getOperationToOperationCallingDependency_CallingMicroservice();

		/**
		 * The meta object literal for the '<em><b>Called Microservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_MICROSERVICE = eINSTANCE.getOperationToOperationCallingDependency_CalledMicroservice();

		/**
		 * The meta object literal for the '<em><b>Called Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_OPERATION = eINSTANCE.getOperationToOperationCallingDependency_CalledOperation();

		/**
		 * The meta object literal for the '<em><b>Calling Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_OPERATION = eINSTANCE.getOperationToOperationCallingDependency_CallingOperation();

		/**
		 * The meta object literal for the '<em><b>Calling Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION = eINSTANCE.getOperationToOperationCallingDependency_CallingVersion();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.TimeSeriesImpl <em>Time Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.TimeSeriesImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getTimeSeries()
		 * @generated
		 */
		EClass TIME_SERIES = eINSTANCE.getTimeSeries();

		/**
		 * The meta object literal for the '<em><b>Time Series Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES__TIME_SERIES_POINTS = eINSTANCE.getTimeSeries_TimeSeriesPoints();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.TimeSeriesPointImpl <em>Time Series Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.TimeSeriesPointImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getTimeSeriesPoint()
		 * @generated
		 */
		EClass TIME_SERIES_POINT = eINSTANCE.getTimeSeriesPoint();

		/**
		 * The meta object literal for the '<em><b>Time Series</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES_POINT__TIME_SERIES = eINSTANCE.getTimeSeriesPoint_TimeSeries();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.MicroserviceOperationTimeSeriesPointImpl <em>Microservice Operation Time Series Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.MicroserviceOperationTimeSeriesPointImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMicroserviceOperationTimeSeriesPoint()
		 * @generated
		 */
		EClass MICROSERVICE_OPERATION_TIME_SERIES_POINT = eINSTANCE.getMicroserviceOperationTimeSeriesPoint();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_OPERATION_TIME_SERIES_POINT__ENDPOINT = eINSTANCE.getMicroserviceOperationTimeSeriesPoint_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Rest Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_OPERATION_TIME_SERIES_POINT__REST_OPERATION = eINSTANCE.getMicroserviceOperationTimeSeriesPoint_RestOperation();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.impl.MetaModelStructureImpl <em>Meta Model Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.impl.MetaModelStructureImpl
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getMetaModelStructure()
		 * @generated
		 */
		EClass META_MODEL_STRUCTURE = eINSTANCE.getMetaModelStructure();

		/**
		 * The meta object literal for the '<em><b>Infrastructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_STRUCTURE__INFRASTRUCTURE = eINSTANCE.getMetaModelStructure_Infrastructure();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_STRUCTURE__CONFIGURATIONS = eINSTANCE.getMetaModelStructure_Configurations();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_STRUCTURE__DEPENDENCIES = eINSTANCE.getMetaModelStructure_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Time Series</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_STRUCTURE__TIME_SERIES = eINSTANCE.getMetaModelStructure_TimeSeries();

		/**
		 * The meta object literal for the '<em><b>Microservice Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY = eINSTANCE.getMetaModelStructure_MicroserviceRepository();

		/**
		 * The meta object literal for the '{@link microserviceMetamodel.RESTVerb <em>REST Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microserviceMetamodel.RESTVerb
		 * @see microserviceMetamodel.impl.AnotherMicroserviceMetamodelPackageImpl#getRESTVerb()
		 * @generated
		 */
		EEnum REST_VERB = eINSTANCE.getRESTVerb();

	}

} //AnotherMicroserviceMetamodelPackage
