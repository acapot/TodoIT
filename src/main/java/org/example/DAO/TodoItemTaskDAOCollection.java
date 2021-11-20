package org.example.DAO;

import org.example.Person;
import org.example.TodoItemTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO{

    List<TodoItemTask> todoItemTaskList = new ArrayList<TodoItemTask>();

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        todoItemTaskList.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return todoItemTaskList;
    }

    @Override
    public Optional<TodoItemTask> findById(int id) {

        return todoItemTaskList.stream()
                .filter(t -> t.getId() == id).findFirst();
    }

    @Override
    public List<TodoItemTask> findByAssignedStatus(boolean status) {
        return todoItemTaskList.stream()
                .filter(t -> t.isAssigned() == status)
                .collect(Collectors.toList());
    }

    @Override
    public List<TodoItemTask> findByPersonId(int personId) {
        return todoItemTaskList.stream()
                .filter(t -> t.getAssignee().getId() == personId)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        Optional<TodoItemTask>  t = findById(id);
        todoItemTaskList.remove(t);
    }
}
