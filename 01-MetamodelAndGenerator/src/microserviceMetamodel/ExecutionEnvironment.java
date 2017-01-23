/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.ExecutionEnvironment#getMicroservices <em>Microservices</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getExecutionEnvironment()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodel.Microservice}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.Microservice#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microservices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getExecutionEnvironment_Microservices()
	 * @see microserviceMetamodel.Microservice#getEnvironment
	 * @model opposite="environment"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

} // ExecutionEnvironment
