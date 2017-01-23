/**
 */
package microserviceMetamodel.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import microserviceMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage
 * @generated
 */
public class AnotherMicroserviceMetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AnotherMicroserviceMetamodelValidator INSTANCE = new AnotherMicroserviceMetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "anotherMicroserviceMetamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnotherMicroserviceMetamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AnotherMicroserviceMetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE:
				return validateMicroservice((Microservice)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.EXECUTION_ENVIRONMENT:
				return validateExecutionEnvironment((ExecutionEnvironment)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.ANOMALY_INJECTOR:
				return validateAnomalyInjector((AnomalyInjector)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.VERSION:
				return validateVersion((Version)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.ENDPOINT:
				return validateEndpoint((Endpoint)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION:
				return validateRESTOperation((RESTOperation)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_TYPE:
				return validateMicroserviceType((MicroserviceType)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_REPOSITORY:
				return validateMicroserviceRepository((MicroserviceRepository)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.HOST:
				return validateHost((Host)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST:
				return validateVirtualHost((VirtualHost)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST:
				return validatePhysicalHost((PhysicalHost)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.INFRASTRUCTURE_MODEL:
				return validateInfrastructureModel((InfrastructureModel)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.DEPENDENCY_MODEL:
				return validateDependencyModel((DependencyModel)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.OPERATION_TO_OPERATION_CALLING_DEPENDENCY:
				return validateOperationToOperationCallingDependency((OperationToOperationCallingDependency)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES:
				return validateTimeSeries((TimeSeries)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.TIME_SERIES_POINT:
				return validateTimeSeriesPoint((TimeSeriesPoint)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.MICROSERVICE_OPERATION_TIME_SERIES_POINT:
				return validateMicroserviceOperationTimeSeriesPoint((MicroserviceOperationTimeSeriesPoint)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE:
				return validateMetaModelStructure((MetaModelStructure)value, diagnostics, context);
			case AnotherMicroserviceMetamodelPackage.REST_VERB:
				return validateRESTVerb((RESTVerb)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microservice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_typeAndVersionMatch(microservice, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the typeAndVersionMatch constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE__TYPE_AND_VERSION_MATCH__EEXPRESSION = "microserviceType.versions->select(v:Version | v = version)->notEmpty()";

	/**
	 * Validates the typeAndVersionMatch constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice_typeAndVersionMatch(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnotherMicroserviceMetamodelPackage.Literals.MICROSERVICE,
				 microservice,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "typeAndVersionMatch",
				 MICROSERVICE__TYPE_AND_VERSION_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configuration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionEnvironment(ExecutionEnvironment executionEnvironment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executionEnvironment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnomalyInjector(AnomalyInjector anomalyInjector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anomalyInjector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(version, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTOperation(RESTOperation restOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceType(MicroserviceType microserviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microserviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceRepository(MicroserviceRepository microserviceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microserviceRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHost(Host host, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(host, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualHost(VirtualHost virtualHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualHost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalHost(PhysicalHost physicalHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalHost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureModel(InfrastructureModel infrastructureModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infrastructureModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependencyModel(DependencyModel dependencyModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependencyModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationToOperationCallingDependency(OperationToOperationCallingDependency operationToOperationCallingDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationToOperationCallingDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationToOperationCallingDependency_calledCorrespond(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationToOperationCallingDependency_callingCorrespond(operationToOperationCallingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationToOperationCallingDependency_callingVersionFits(operationToOperationCallingDependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the calledCorrespond constraint of '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_CORRESPOND__EEXPRESSION = "calledMicroservice.restOperations->select(rop:RESTOperation | rop=calledOperation)->notEmpty()";

	/**
	 * Validates the calledCorrespond constraint of '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationToOperationCallingDependency_calledCorrespond(OperationToOperationCallingDependency operationToOperationCallingDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnotherMicroserviceMetamodelPackage.Literals.OPERATION_TO_OPERATION_CALLING_DEPENDENCY,
				 operationToOperationCallingDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "calledCorrespond",
				 OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLED_CORRESPOND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the callingCorrespond constraint of '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_CORRESPOND__EEXPRESSION = "callingMicroservice.restOperations->select(rop:RESTOperation | rop=callingOperation)->notEmpty()";

	/**
	 * Validates the callingCorrespond constraint of '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationToOperationCallingDependency_callingCorrespond(OperationToOperationCallingDependency operationToOperationCallingDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnotherMicroserviceMetamodelPackage.Literals.OPERATION_TO_OPERATION_CALLING_DEPENDENCY,
				 operationToOperationCallingDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "callingCorrespond",
				 OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_CORRESPOND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the callingVersionFits constraint of '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION_FITS__EEXPRESSION = "callingMicroservice.versions->select(ver:Version|ver=callingVersion)->notEmpty()";

	/**
	 * Validates the callingVersionFits constraint of '<em>Operation To Operation Calling Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationToOperationCallingDependency_callingVersionFits(OperationToOperationCallingDependency operationToOperationCallingDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnotherMicroserviceMetamodelPackage.Literals.OPERATION_TO_OPERATION_CALLING_DEPENDENCY,
				 operationToOperationCallingDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "callingVersionFits",
				 OPERATION_TO_OPERATION_CALLING_DEPENDENCY__CALLING_VERSION_FITS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeries(TimeSeries timeSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesPoint(TimeSeriesPoint timeSeriesPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSeriesPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceOperationTimeSeriesPoint(MicroserviceOperationTimeSeriesPoint microserviceOperationTimeSeriesPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microserviceOperationTimeSeriesPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroserviceOperationTimeSeriesPoint_nonNullReferences(microserviceOperationTimeSeriesPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroserviceOperationTimeSeriesPoint_correspondingReferences(microserviceOperationTimeSeriesPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonNullReferences constraint of '<em>Microservice Operation Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE_OPERATION_TIME_SERIES_POINT__NON_NULL_REFERENCES__EEXPRESSION = "endpoint <> null and restOperation <> null";

	/**
	 * Validates the nonNullReferences constraint of '<em>Microservice Operation Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceOperationTimeSeriesPoint_nonNullReferences(MicroserviceOperationTimeSeriesPoint microserviceOperationTimeSeriesPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnotherMicroserviceMetamodelPackage.Literals.MICROSERVICE_OPERATION_TIME_SERIES_POINT,
				 microserviceOperationTimeSeriesPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nonNullReferences",
				 MICROSERVICE_OPERATION_TIME_SERIES_POINT__NON_NULL_REFERENCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correspondingReferences constraint of '<em>Microservice Operation Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE_OPERATION_TIME_SERIES_POINT__CORRESPONDING_REFERENCES__EEXPRESSION = "endpoint.restOperations->select(rop:RESTOperation | rop = restOperation)->notEmpty()";

	/**
	 * Validates the correspondingReferences constraint of '<em>Microservice Operation Time Series Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceOperationTimeSeriesPoint_correspondingReferences(MicroserviceOperationTimeSeriesPoint microserviceOperationTimeSeriesPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnotherMicroserviceMetamodelPackage.Literals.MICROSERVICE_OPERATION_TIME_SERIES_POINT,
				 microserviceOperationTimeSeriesPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correspondingReferences",
				 MICROSERVICE_OPERATION_TIME_SERIES_POINT__CORRESPONDING_REFERENCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaModelStructure(MetaModelStructure metaModelStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaModelStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTVerb(RESTVerb restVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AnotherMicroserviceMetamodelValidator
