/**
 */
package microserviceMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation To Operation Calling Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.OperationToOperationCallingDependency#getCalledMicroservice <em>Called Microservice</em>}</li>
 *   <li>{@link microserviceMetamodel.OperationToOperationCallingDependency#getCalledOperation <em>Called Operation</em>}</li>
 *   <li>{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingOperation <em>Calling Operation</em>}</li>
 *   <li>{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingVersion <em>Calling Version</em>}</li>
 *   <li>{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingMicroservice <em>Calling Microservice</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getOperationToOperationCallingDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='calledCorrespond callingCorrespond callingVersionFits'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot calledCorrespond='calledMicroservice.restOperations->select(rop:RESTOperation | rop=calledOperation)->notEmpty()' callingCorrespond='callingMicroservice.restOperations->select(rop:RESTOperation | rop=callingOperation)->notEmpty()' callingVersionFits='callingMicroservice.versions->select(ver:Version|ver=callingVersion)->notEmpty()'"
 * @generated
 */
public interface OperationToOperationCallingDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Calling Microservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link microserviceMetamodel.MicroserviceType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calling Microservice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calling Microservice</em>' reference.
	 * @see #setCallingMicroservice(MicroserviceType)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getOperationToOperationCallingDependency_CallingMicroservice()
	 * @see microserviceMetamodel.MicroserviceType#getDependencies
	 * @model opposite="dependencies" required="true"
	 * @generated
	 */
	MicroserviceType getCallingMicroservice();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingMicroservice <em>Calling Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calling Microservice</em>' reference.
	 * @see #getCallingMicroservice()
	 * @generated
	 */
	void setCallingMicroservice(MicroserviceType value);

	/**
	 * Returns the value of the '<em><b>Called Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Microservice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Microservice</em>' reference.
	 * @see #setCalledMicroservice(MicroserviceType)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getOperationToOperationCallingDependency_CalledMicroservice()
	 * @model required="true"
	 * @generated
	 */
	MicroserviceType getCalledMicroservice();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCalledMicroservice <em>Called Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Microservice</em>' reference.
	 * @see #getCalledMicroservice()
	 * @generated
	 */
	void setCalledMicroservice(MicroserviceType value);

	/**
	 * Returns the value of the '<em><b>Called Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Operation</em>' reference.
	 * @see #setCalledOperation(RESTOperation)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getOperationToOperationCallingDependency_CalledOperation()
	 * @model required="true"
	 * @generated
	 */
	RESTOperation getCalledOperation();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCalledOperation <em>Called Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Operation</em>' reference.
	 * @see #getCalledOperation()
	 * @generated
	 */
	void setCalledOperation(RESTOperation value);

	/**
	 * Returns the value of the '<em><b>Calling Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calling Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calling Operation</em>' reference.
	 * @see #setCallingOperation(RESTOperation)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getOperationToOperationCallingDependency_CallingOperation()
	 * @model required="true"
	 * @generated
	 */
	RESTOperation getCallingOperation();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingOperation <em>Calling Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calling Operation</em>' reference.
	 * @see #getCallingOperation()
	 * @generated
	 */
	void setCallingOperation(RESTOperation value);

	/**
	 * Returns the value of the '<em><b>Calling Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calling Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calling Version</em>' reference.
	 * @see #setCallingVersion(Version)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getOperationToOperationCallingDependency_CallingVersion()
	 * @model required="true"
	 * @generated
	 */
	Version getCallingVersion();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.OperationToOperationCallingDependency#getCallingVersion <em>Calling Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calling Version</em>' reference.
	 * @see #getCallingVersion()
	 * @generated
	 */
	void setCallingVersion(Version value);

} // OperationToOperationCallingDependency
