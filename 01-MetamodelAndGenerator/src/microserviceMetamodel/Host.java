/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.Host#getContainers <em>Containers</em>}</li>
 *   <li>{@link microserviceMetamodel.Host#getHostname <em>Hostname</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getHost()
 * @model abstract="true"
 * @generated
 */
public interface Host extends ExecutionEnvironment {

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.Container}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.Container#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getHost_Containers()
	 * @see microserviceMetamodel.Container#getHost
	 * @model opposite="host" containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getHost_Hostname()
	 * @model required="true"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Host#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);
} // Host
