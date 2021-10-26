package org.example;

public class TodoItemTask {
    private static int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(boolean assigned, TodoItem todoItem, Person assignee) {
        this.assigned = assigned;

        if(todoItem == null){
            throw new RuntimeException("todoItem was null");
        }

        //this.todoItem = todoItem;
        setTodoItem(todoItem);

        //this.assignee = assignee;
        setAssignee(assignee);
        id++; //Autoincrement
    }

    public static int getId() {
        return id;
    }

    public boolean isAssigned() {
        boolean result = assigned;
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummary(){
        String result ="The id is: "+ id +
                "\nThe Person assigned to do the Task: " + this.assignee.getFirstname()  + " " + this.assignee.getLastName() +
                "\nThe Task : " + this.todoItem.getTaskDescription() +
                "\nIs the task assigned ? : " + this.assigned +
                "\nThe Deadline : " + this.todoItem.getDeadLine();

        return result;
    }
}
