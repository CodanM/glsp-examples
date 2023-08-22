/**
 * Copyright (c) 2022 EclipseSource and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 */
package org.eclipse.glsp.example.tasklist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.TaskList#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.TaskList#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.TaskList#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link org.eclipse.glsp.example.tasklist.model.TaskList#getCompartments <em>Compartments</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getTaskList()
 * @model
 * @generated
 */
public interface TaskList extends Identifiable {
	/**
    * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.glsp.example.tasklist.model.Task}.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Tasks</em>' containment reference list.
    * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getTaskList_Tasks()
    * @model containment="true"
    * @generated
    */
	EList<Task> getTasks();

	/**
    * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.glsp.example.tasklist.model.Transition}.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Transitions</em>' containment reference list.
    * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getTaskList_Transitions()
    * @model containment="true"
    * @generated
    */
	EList<Transition> getTransitions();

	/**
    * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.glsp.example.tasklist.model.Decision}.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Decisions</em>' containment reference list.
    * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getTaskList_Decisions()
    * @model containment="true"
    * @generated
    */
	EList<Decision> getDecisions();

   /**
    * Returns the value of the '<em><b>Compartments</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.glsp.example.tasklist.model.Compartment}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Compartments</em>' reference list.
    * @see org.eclipse.glsp.example.tasklist.model.ModelPackage#getTaskList_Compartments()
    * @model
    * @generated
    */
   EList<Compartment> getCompartments();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Identifiable findById(String id);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   EList<Identifiable> getAll();

} // TaskList
