/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.Endpoint#getRestOperations <em>Rest Operations</em>}</li>
 *   <li>{@link microserviceMetamodel.Endpoint#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link microserviceMetamodel.Endpoint#getPort <em>Port</em>}</li>
 *   <li>{@link microserviceMetamodel.Endpoint#getUrl <em>Url</em>}</li>
 *   <li>{@link microserviceMetamodel.Endpoint#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest Operations</b></em>' reference list.
	 * The list contents are of type {@link microserviceMetamodel.RESTOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Operations</em>' reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getEndpoint_RestOperations()
	 * @model required="true"
	 * @generated
	 */
	EList<RESTOperation> getRestOperations();

	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getEndpoint_IpAddress()
	 * @model required="true" derived="true"
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Endpoint#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getEndpoint_Port()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject" required="true"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Endpoint#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getEndpoint_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Endpoint#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getEndpoint_Protocol()
	 * @model required="true"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Endpoint#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // Endpoint
