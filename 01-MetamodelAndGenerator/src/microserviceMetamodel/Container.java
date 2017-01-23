/**
 */
package microserviceMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.Container#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends ExecutionEnvironment {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.Host#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' container reference.
	 * @see #setHost(Host)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getContainer_Host()
	 * @see microserviceMetamodel.Host#getContainers
	 * @model opposite="containers" required="true" transient="false"
	 * @generated
	 */
	Host getHost();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.Container#getHost <em>Host</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' container reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(Host value);

} // Container
