/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.DependencyModel#getOperationToOperationCallingDependencies <em>Operation To Operation Calling Dependencies</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getDependencyModel()
 * @model
 * @generated
 */
public interface DependencyModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation To Operation Calling Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.OperationToOperationCallingDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation To Operation Calling Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation To Operation Calling Dependencies</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getDependencyModel_OperationToOperationCallingDependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationToOperationCallingDependency> getOperationToOperationCallingDependencies();

} // DependencyModel
