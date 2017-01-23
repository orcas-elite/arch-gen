/**
 */
package microserviceMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.VirtualHost#getParentHost <em>Parent Host</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getVirtualHost()
 * @model
 * @generated
 */
public interface VirtualHost extends Host {
	/**
	 * Returns the value of the '<em><b>Parent Host</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.PhysicalHost#getVirtualHosts <em>Virtual Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Host</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Host</em>' container reference.
	 * @see #setParentHost(PhysicalHost)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getVirtualHost_ParentHost()
	 * @see microserviceMetamodel.PhysicalHost#getVirtualHosts
	 * @model opposite="virtualHosts" required="true" transient="false"
	 * @generated
	 */
	PhysicalHost getParentHost();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.VirtualHost#getParentHost <em>Parent Host</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Host</em>' container reference.
	 * @see #getParentHost()
	 * @generated
	 */
	void setParentHost(PhysicalHost value);

} // VirtualHost
