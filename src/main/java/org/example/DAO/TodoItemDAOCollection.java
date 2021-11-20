package org.example.DAO;

import org.example.Person;
import org.example.TodoItem;
import org.example.TodoItemTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TodoItemDAOCollection implements TodoItemDAO{

    List<TodoItem> todoItemList  = new ArrayList<TodoItem>();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItemList.add(todoItem);
        return todoItem;
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItemList;
    }

    @Override
    public Optional<TodoItem> findById(int id) {
        return todoItemList.stream()
                .filter(ti -> ti.getId() == id).findFirst();
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean done) {
        return todoItemList.stream()
                .filter(ti -> ti.isDone() == done)
                .collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        return todoItemList.stream()
                .filter(ti -> ti.getTitle() == title)
                .collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByPersonId(int personId) {
        return todoItemList.stream()
                .filter(ti -> ti.getCreator().getId() == personId)
                .collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        return todoItemList.stream()
                .filter(ti -> ti.getDeadLine().isBefore(date))
                .collect(Collectors.toList());
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        return todoItemList.stream()
                .filter(ti -> ti.getDeadLine().isAfter(date))
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        Optional<TodoItem>  t = findById(id);
        todoItemList.remove(t);
    }
}
