/**
 */
package microserviceMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.RESTOperation#getName <em>Name</em>}</li>
 *   <li>{@link microserviceMetamodel.RESTOperation#getSubPath <em>Sub Path</em>}</li>
 *   <li>{@link microserviceMetamodel.RESTOperation#getRestVerb <em>Rest Verb</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getRESTOperation()
 * @model
 * @generated
 */
public interface RESTOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getRESTOperation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.RESTOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Path</em>' attribute.
	 * @see #setSubPath(String)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getRESTOperation_SubPath()
	 * @model required="true"
	 * @generated
	 */
	String getSubPath();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.RESTOperation#getSubPath <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Path</em>' attribute.
	 * @see #getSubPath()
	 * @generated
	 */
	void setSubPath(String value);

	/**
	 * Returns the value of the '<em><b>Rest Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link microserviceMetamodel.RESTVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Verb</em>' attribute.
	 * @see microserviceMetamodel.RESTVerb
	 * @see #setRestVerb(RESTVerb)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getRESTOperation_RestVerb()
	 * @model required="true"
	 * @generated
	 */
	RESTVerb getRestVerb();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.RESTOperation#getRestVerb <em>Rest Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Verb</em>' attribute.
	 * @see microserviceMetamodel.RESTVerb
	 * @see #getRestVerb()
	 * @generated
	 */
	void setRestVerb(RESTVerb value);

} // RESTOperation
