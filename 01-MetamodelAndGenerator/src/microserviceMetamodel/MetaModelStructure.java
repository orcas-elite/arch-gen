/**
 */
package microserviceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.MetaModelStructure#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link microserviceMetamodel.MetaModelStructure#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link microserviceMetamodel.MetaModelStructure#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link microserviceMetamodel.MetaModelStructure#getTimeSeries <em>Time Series</em>}</li>
 *   <li>{@link microserviceMetamodel.MetaModelStructure#getMicroserviceRepository <em>Microservice Repository</em>}</li>
 * </ul>
 *
 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMetaModelStructure()
 * @model
 * @generated
 */
public interface MetaModelStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Infrastructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure</em>' containment reference.
	 * @see #setInfrastructure(InfrastructureModel)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMetaModelStructure_Infrastructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InfrastructureModel getInfrastructure();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.MetaModelStructure#getInfrastructure <em>Infrastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure</em>' containment reference.
	 * @see #getInfrastructure()
	 * @generated
	 */
	void setInfrastructure(InfrastructureModel value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link microserviceMetamodel.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMetaModelStructure_Configurations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependencyModel)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMetaModelStructure_Dependencies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DependencyModel getDependencies();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.MetaModelStructure#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(DependencyModel value);

	/**
	 * Returns the value of the '<em><b>Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series</em>' containment reference.
	 * @see #setTimeSeries(TimeSeries)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMetaModelStructure_TimeSeries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeSeries getTimeSeries();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.MetaModelStructure#getTimeSeries <em>Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series</em>' containment reference.
	 * @see #getTimeSeries()
	 * @generated
	 */
	void setTimeSeries(TimeSeries value);

	/**
	 * Returns the value of the '<em><b>Microservice Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microservice Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice Repository</em>' containment reference.
	 * @see #setMicroserviceRepository(MicroserviceRepository)
	 * @see microserviceMetamodel.AnotherMicroserviceMetamodelPackage#getMetaModelStructure_MicroserviceRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MicroserviceRepository getMicroserviceRepository();

	/**
	 * Sets the value of the '{@link microserviceMetamodel.MetaModelStructure#getMicroserviceRepository <em>Microservice Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice Repository</em>' containment reference.
	 * @see #getMicroserviceRepository()
	 * @generated
	 */
	void setMicroserviceRepository(MicroserviceRepository value);

} // MetaModelStructure
