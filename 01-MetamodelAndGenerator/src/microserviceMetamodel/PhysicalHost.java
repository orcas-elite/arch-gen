/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.PhysicalHost#getVirtualHosts <em>Virtual Hosts</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getPhysicalHost()
 * @model
 * @generated
 */
public interface PhysicalHost extends Host {
	/**
	 * Returns the value of the '<em><b>Virtual Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.VirtualHost}.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.VirtualHost#getParentHost <em>Parent Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Hosts</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getPhysicalHost_VirtualHosts()
	 * @see microserviceMetamodel.VirtualHost#getParentHost
	 * @model opposite="parentHost" containment="true"
	 * @generated
	 */
	EList<VirtualHost> getVirtualHosts();

} // PhysicalHost
