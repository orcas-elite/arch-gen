/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.Microservice#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link microserviceMetamodel.Microservice#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link microserviceMetamodel.Microservice#getMicroserviceType <em>Microservice Type</em>}</li>
 *   <li>{@link microserviceMetamodel.Microservice#getVersion <em>Version</em>}</li>
 *   <li>{@link microserviceMetamodel.Microservice#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroservice()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeAndVersionMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeAndVersionMatch='microserviceType.versions->select(v:Version | v = version)->notEmpty()'"
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.ExecutionEnvironment#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(ExecutionEnvironment)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroservice_Environment()
	 * @see microserviceMetamodel.ExecutionEnvironment#getMicroservices
	 * @model opposite="microservices" required="true"
	 * @generated
	 */
	ExecutionEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Microservice#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(ExecutionEnvironment value);

	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.Endpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoints</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroservice_Endpoints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Endpoint> getEndpoints();

	/**
	 * Returns the value of the '<em><b>Microservice Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.MicroserviceType#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microservice Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice Type</em>' reference.
	 * @see #setMicroserviceType(MicroserviceType)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroservice_MicroserviceType()
	 * @see microserviceMetamodel.MicroserviceType#getMicroservices
	 * @model opposite="microservices" required="true"
	 * @generated
	 */
	MicroserviceType getMicroserviceType();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Microservice#getMicroserviceType <em>Microservice Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice Type</em>' reference.
	 * @see #getMicroserviceType()
	 * @generated
	 */
	void setMicroserviceType(MicroserviceType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(Version)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroservice_Version()
	 * @model required="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Microservice#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroservice_Uuid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Microservice#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Microservice
