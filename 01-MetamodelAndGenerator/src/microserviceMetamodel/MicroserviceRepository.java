/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.MicroserviceRepository#getMicroserviceTypes <em>Microservice Types</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceRepository()
 * @model
 * @generated
 */
public interface MicroserviceRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Microservice Types</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.MicroserviceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microservice Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice Types</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMicroserviceRepository_MicroserviceTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MicroserviceType> getMicroserviceTypes();

} // MicroserviceRepository
