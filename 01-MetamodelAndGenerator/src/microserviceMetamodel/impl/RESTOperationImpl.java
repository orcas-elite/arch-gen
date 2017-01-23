/**
 */
package microserviceMetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import microserviceMetamodel.AnotherMicroserviceMetamodelPackage;
import microserviceMetamodel.RESTOperation;
import microserviceMetamodel.RESTVerb;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link microserviceMetamodel.impl.RESTOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.RESTOperationImpl#getSubPath <em>Sub Path</em>}</li>
 *   <li>{@link microserviceMetamodel.impl.RESTOperationImpl#getRestVerb <em>Rest Verb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RESTOperationImpl extends MinimalEObjectImpl.Container implements RESTOperation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubPath() <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubPath() <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPath()
	 * @generated
	 * @ordered
	 */
	protected String subPath = SUB_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestVerb() <em>Rest Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestVerb()
	 * @generated
	 * @ordered
	 */
	protected static final RESTVerb REST_VERB_EDEFAULT = RESTVerb.GET;

	/**
	 * The cached value of the '{@link #getRestVerb() <em>Rest Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestVerb()
	 * @generated
	 * @ordered
	 */
	protected RESTVerb restVerb = REST_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnotherMicroserviceMetamodelPackage.Literals.REST_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.REST_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubPath() {
		return subPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPath(String newSubPath) {
		String oldSubPath = subPath;
		subPath = newSubPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.REST_OPERATION__SUB_PATH, oldSubPath, subPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTVerb getRestVerb() {
		return restVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestVerb(RESTVerb newRestVerb) {
		RESTVerb oldRestVerb = restVerb;
		restVerb = newRestVerb == null ? REST_VERB_EDEFAULT : newRestVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnotherMicroserviceMetamodelPackage.REST_OPERATION__REST_VERB, oldRestVerb, restVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__NAME:
				return getName();
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__SUB_PATH:
				return getSubPath();
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__REST_VERB:
				return getRestVerb();
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
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__NAME:
				setName((String)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__SUB_PATH:
				setSubPath((String)newValue);
				return;
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__REST_VERB:
				setRestVerb((RESTVerb)newValue);
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
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__SUB_PATH:
				setSubPath(SUB_PATH_EDEFAULT);
				return;
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__REST_VERB:
				setRestVerb(REST_VERB_EDEFAULT);
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
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__SUB_PATH:
				return SUB_PATH_EDEFAULT == null ? subPath != null : !SUB_PATH_EDEFAULT.equals(subPath);
			case AnotherMicroserviceMetamodelPackage.REST_OPERATION__REST_VERB:
				return restVerb != REST_VERB_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", subPath: ");
		result.append(subPath);
		result.append(", restVerb: ");
		result.append(restVerb);
		result.append(')');
		return result.toString();
	}

} //RESTOperationImpl
