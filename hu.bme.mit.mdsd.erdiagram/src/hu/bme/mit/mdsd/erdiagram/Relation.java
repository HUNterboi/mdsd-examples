/**
 */
package hu.bme.mit.mdsd.erdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.Relation#getLeftEnding <em>Left Ending</em>}</li>
 *   <li>{@link hu.bme.mit.mdsd.erdiagram.Relation#getRightEnding <em>Right Ending</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Left Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Ending</em>' containment reference.
	 * @see #setLeftEnding(RelationEnding)
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelation_LeftEnding()
	 * @model containment="true"
	 * @generated
	 */
	RelationEnding getLeftEnding();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.Relation#getLeftEnding <em>Left Ending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Ending</em>' containment reference.
	 * @see #getLeftEnding()
	 * @generated
	 */
	void setLeftEnding(RelationEnding value);

	/**
	 * Returns the value of the '<em><b>Right Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Ending</em>' containment reference.
	 * @see #setRightEnding(RelationEnding)
	 * @see hu.bme.mit.mdsd.erdiagram.ErdiagramPackage#getRelation_RightEnding()
	 * @model containment="true"
	 * @generated
	 */
	RelationEnding getRightEnding();

	/**
	 * Sets the value of the '{@link hu.bme.mit.mdsd.erdiagram.Relation#getRightEnding <em>Right Ending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ending</em>' containment reference.
	 * @see #getRightEnding()
	 * @generated
	 */
	void setRightEnding(RelationEnding value);

} // Relation
