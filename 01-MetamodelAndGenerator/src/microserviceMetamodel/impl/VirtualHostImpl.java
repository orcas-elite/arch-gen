/**
 */
package microserviceMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.PhysicalHost;
import microserviceMetamodel.VirtualHost;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.VirtualHostImpl#getParentHost <em>Parent Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualHostImpl extends HostImpl implements VirtualHost {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.VIRTUAL_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalHost getParentHost() {
		if (eContainerFeatureID() != AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST) return null;
		return (PhysicalHost)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentHost(PhysicalHost newParentHost, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentHost, AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentHost(PhysicalHost newParentHost) {
		if (newParentHost != eInternalContainer() || (eContainerFeatureID() != AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST && newParentHost != null)) {
			if (EcoreUtil.isAncestor(this, newParentHost))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentHost != null)
				msgs = ((InternalEObject)newParentHost).eInverseAdd(this, AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS, PhysicalHost.class, msgs);
			msgs = basicSetParentHost(newParentHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST, newParentHost, newParentHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentHost((PhysicalHost)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST:
				return basicSetParentHost(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST:
				return eInternalContainer().eInverseRemove(this, AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS, PhysicalHost.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST:
				return getParentHost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST:
				setParentHost((PhysicalHost)newValue);
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
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST:
				setParentHost((PhysicalHost)null);
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
			case AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST:
				return getParentHost() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualHostImpl
