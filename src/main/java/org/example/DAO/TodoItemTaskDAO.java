package org.example.DAO;

import org.example.TodoItemTask;

import java.util.List;
import java.util.Optional;

public interface TodoItemTaskDAO {
    TodoItemTask persist(TodoItemTask todoItemTask);
    List<TodoItemTask> findAll();
    Optional<TodoItemTask> findById(int id);
    List<TodoItemTask> findByAssignedStatus (boolean status);
    List<TodoItemTask> findByPersonId (int personId);
    void remove(int id);
}