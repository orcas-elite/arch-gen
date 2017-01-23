/**
 */
package microserviceMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.Configuration;
import microserviceMetamodel.DependencyModel;
import microserviceMetamodel.InfrastructureModel;
import microserviceMetamodel.MetaModelStructure;
import microserviceMetamodel.MicroserviceRepository;
import microserviceMetamodel.TimeSeries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.MetaModelStructureImpl#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MetaModelStructureImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MetaModelStructureImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MetaModelStructureImpl#getTimeSeries <em>Time Series</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.MetaModelStructureImpl#getMicroserviceRepository <em>Microservice Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelStructureImpl extends MinimalEObjectImpl.Container implements MetaModelStructure {
	/**
	 * The cached value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureModel infrastructure;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected DependencyModel dependencies;

	/**
	 * The cached value of the '{@link #getTimeSeries() <em>Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected TimeSeries timeSeries;

	/**
	 * The cached value of the '{@link #getMicroserviceRepository() <em>Microservice Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroserviceRepository()
	 * @generated
	 * @ordered
	 */
	protected MicroserviceRepository microserviceRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.META_MODEL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureModel getInfrastructure() {
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfrastructure(InfrastructureModel newInfrastructure, NotificationChain msgs) {
		InfrastructureModel oldInfrastructure = infrastructure;
		infrastructure = newInfrastructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE, oldInfrastructure, newInfrastructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfrastructure(InfrastructureModel newInfrastructure) {
		if (newInfrastructure != infrastructure) {
			NotificationChain msgs = null;
			if (infrastructure != null)
				msgs = ((InternalEObject)infrastructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE, null, msgs);
			if (newInfrastructure != null)
				msgs = ((InternalEObject)newInfrastructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE, null, msgs);
			msgs = basicSetInfrastructure(newInfrastructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE, newInfrastructure, newInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyModel getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(DependencyModel newDependencies, NotificationChain msgs) {
		DependencyModel oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES, oldDependencies, newDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencies(DependencyModel newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES, newDependencies, newDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeries getTimeSeries() {
		return timeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSeries(TimeSeries newTimeSeries, NotificationChain msgs) {
		TimeSeries oldTimeSeries = timeSeries;
		timeSeries = newTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES, oldTimeSeries, newTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeries(TimeSeries newTimeSeries) {
		if (newTimeSeries != timeSeries) {
			NotificationChain msgs = null;
			if (timeSeries != null)
				msgs = ((InternalEObject)timeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES, null, msgs);
			if (newTimeSeries != null)
				msgs = ((InternalEObject)newTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES, null, msgs);
			msgs = basicSetTimeSeries(newTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES, newTimeSeries, newTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceRepository getMicroserviceRepository() {
		return microserviceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicroserviceRepository(MicroserviceRepository newMicroserviceRepository, NotificationChain msgs) {
		MicroserviceRepository oldMicroserviceRepository = microserviceRepository;
		microserviceRepository = newMicroserviceRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY, oldMicroserviceRepository, newMicroserviceRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroserviceRepository(MicroserviceRepository newMicroserviceRepository) {
		if (newMicroserviceRepository != microserviceRepository) {
			NotificationChain msgs = null;
			if (microserviceRepository != null)
				msgs = ((InternalEObject)microserviceRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY, null, msgs);
			if (newMicroserviceRepository != null)
				msgs = ((InternalEObject)newMicroserviceRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY, null, msgs);
			msgs = basicSetMicroserviceRepository(newMicroserviceRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY, newMicroserviceRepository, newMicroserviceRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE:
				return basicSetInfrastructure(null, msgs);
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES:
				return basicSetTimeSeries(null, msgs);
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY:
				return basicSetMicroserviceRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE:
				return getInfrastructure();
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__CONFIGURATIONS:
				return getConfigurations();
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES:
				return getDependencies();
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES:
				return getTimeSeries();
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY:
				return getMicroserviceRepository();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE:
				setInfrastructure((InfrastructureModel)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES:
				setDependencies((DependencyModel)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES:
				setTimeSeries((TimeSeries)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY:
				setMicroserviceRepository((MicroserviceRepository)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE:
				setInfrastructure((InfrastructureModel)null);
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES:
				setDependencies((DependencyModel)null);
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES:
				setTimeSeries((TimeSeries)null);
				return;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY:
				setMicroserviceRepository((MicroserviceRepository)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__INFRASTRUCTURE:
				return infrastructure != null;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__DEPENDENCIES:
				return dependencies != null;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__TIME_SERIES:
				return timeSeries != null;
			case AnotherMicroserviceMetamodelPackage.META_MODEL_STRUCTURE__MICROSERVICE_REPOSITORY:
				return microserviceRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //MetaModelStructureImpl
