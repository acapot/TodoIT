package org.example;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("=========== Info 1==========");
        System.out.println("--------Person Creator---------");
        Person creator =                new Person("Alexis", "Capot","ac@hotmail.com", new AppUser("acapot","admin",AppRole.ROLE_APP_ADMIN));
        System.out.println(creator.toString());

        System.out.println("\n--------Person Assignee---------");
        Person assignee =               new Person("Åsa", "Svensson","ss@hotmail.com", new AppUser("asvens","user",AppRole.ROLE_APP_USER));
        System.out.println(assignee.toString());

        System.out.println("\n--------TodoItem myTodoItem---------");
        TodoItem myTodoItem =           new TodoItem("Class of program", "build the classes of the Program", LocalDate.of(2022,10,16), false, creator);
        System.out.println(myTodoItem.getSummary());

        System.out.println("\n--------TodoItemTask myTodoItemTask---------");
        TodoItemTask myTodoItemTask=    new TodoItemTask(true, myTodoItem, assignee);
        System.out.println(myTodoItemTask.getSummary());

        System.out.println("\n\n\n=========== Info 2==========");

        System.out.println("--------Person Creator---------");
        Person creator2 =                new Person("Erick", "Petersson","ep@hotmail.com",new AppUser("epeter","admin",AppRole.ROLE_APP_ADMIN));
        System.out.println(creator2.toString());

        System.out.println("\n--------Person Assignee---------");
        Person assignee2 =               new Person("Kalle", "Iansson","ki@hotmail.com", new AppUser("kian","user",AppRole.ROLE_APP_USER));
        System.out.println(assignee2.toString());

        System.out.println("\n--------TodoItem myTodoItem---------");
        TodoItem myTodoItem2 =           new TodoItem("DB of program", "build the Database of the Program", LocalDate.of(2022,11,10), false, creator2);
        System.out.println(myTodoItem2.getSummary());

        System.out.println("\n--------TodoItemTask myTodoItemTask---------");
        TodoItemTask myTodoItemTask2=    new TodoItemTask(true, myTodoItem2, assignee2);
        System.out.println(myTodoItemTask2.getSummary());
    }
}