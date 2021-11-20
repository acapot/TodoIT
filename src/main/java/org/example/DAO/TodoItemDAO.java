package org.example.DAO;

import org.example.AppUser;
import org.example.Person;
import org.example.TodoItem;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TodoItemDAO {
    TodoItem persist(TodoItem todoItem);
    List<TodoItem> findAll();
    Optional<TodoItem> findById(int id);
    List<TodoItem> findAllByDoneStatus (boolean done);
    List<TodoItem> findByTitleContains (String title);
    List<TodoItem> findByPersonId (int personId);
    List<TodoItem> findByDeadlineBefore (LocalDate date);
    List<TodoItem> findByDeadlineAfter (LocalDate date);
    void remove(int id);
}