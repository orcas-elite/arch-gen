/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.MicroserviceType#getRestOperations <em>Rest Operations</em>}</li>
 *   <li>{@link microserviceMetamodel.MicroserviceType#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link microserviceMetamodel.MicroserviceType#getVersions <em>Versions</em>}</li>
 *   <li>{@link microserviceMetamodel.MicroserviceType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link microserviceMetamodel.MicroserviceType#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceType()
 * @model
 * @generated
 */
public interface MicroserviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest Operations</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.RESTOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Operations</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceType_RestOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RESTOperation> getRestOperations();

	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodel.Microservice}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.Microservice#getMicroserviceType <em>Microservice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microservices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceType_Microservices()
	 * @see microserviceMetamodel.Microservice#getMicroserviceType
	 * @model opposite="microserviceType"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceType_Versions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceType_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.MicroserviceType#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodel.OperationToOperationCallingDependency}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingMicroservice <em>Calling Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceType_Dependencies()
	 * @see microserviceMetamodel.OperationToOperationCallingDependency#getCallingMicroservice
	 * @model opposite="callingMicroservice"
	 * @generated
	 */
	EList<OperationToOperationCallingDependency> getDependencies();

} // MicroserviceType
