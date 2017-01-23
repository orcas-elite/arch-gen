/**
 */
package microserviceMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.PhysicalHost;
import microserviceMetamodel.VirtualHost;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.PhysicalHostImpl#getVirtualHosts <em>Virtual Hosts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalHostImpl extends HostImpl implements PhysicalHost {
	/**
	 * The cached value of the '{@link #getVirtualHosts() <em>Virtual Hosts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualHosts()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualHost> virtualHosts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.PHYSICAL_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualHost> getVirtualHosts() {
		if (virtualHosts == null) {
			virtualHosts = new EObjectContainmentWithInverseEList<VirtualHost>(VirtualHost.class, this, AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS, AnotherMicroserviceMetamodelPackage.VIRTUAL_HOST__PARENT_HOST);
		}
		return virtualHosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualHosts()).basicAdd(otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS:
				return ((InternalEList<?>)getVirtualHosts()).basicRemove(otherEnd, msgs);
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
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS:
				return getVirtualHosts();
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
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS:
				getVirtualHosts().clear();
				getVirtualHosts().addAll((Collection<? extends VirtualHost>)newValue);
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
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS:
				getVirtualHosts().clear();
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
			case AnotherMicroserviceMetamodelPackage.PHYSICAL_HOST__VIRTUAL_HOSTS:
				return virtualHosts != null && !virtualHosts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalHostImpl
