package org.example;

import org.example.Sequencers.TodoItemIdSequencer;

import java.time.LocalDate;

public class TodoItem {
   /*
   - id : int
- title: String
- taskDescription : String
- deadLine : LocalDate
- done : boolean
- creator : Person
    */

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        //this.id = id;
        setId();

        //this.title = title;
        setTitle(title);

        //this.taskDescription = taskDescription;
        setTaskDescription(taskDescription);

        //this.deadLine = deadLine;
        setDeadLine(deadLine);

        //this.done = done;
        setDone(done);

        //this.creator = creator;
        setCreator(creator);

        //id++; //Autoimcrement

    }

    public int getId() {
        return this.id;
    }

    public void setId() {
        this.id = TodoItemIdSequencer.nextId();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null){
            throw new RuntimeException("Title was null");
        }

        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if(deadLine == null){
            throw new RuntimeException("Deadline was null");
        }
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue(){
        LocalDate currentDate = LocalDate.now();
        boolean result = currentDate.isAfter(deadLine);
        return result;
    }


    public String getSummary(){
        String result ="The id is: "+this.id +
                        "\nThe Creator is: " + this.creator.getFirstname()  + " " + this.creator.getLastName() +
                        "\nThe title is : " + this.title +
                        "\nIs it Done? : " + this.done +
                        "\nThe Deadline : " + this.deadLine +
                        "\nDescription : " + this.taskDescription;

        return result;
    }
}
