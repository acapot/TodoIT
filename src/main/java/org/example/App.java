package org.example;

import org.example.DAO.*;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{ //file:///G:/cursoJava/videos/video/G39%20-%20Implementing%20DAO%20pattern-20211102_093125-M%C3%B6tesinspelning.mp4

    public static void main( String[] args )
    {
        AppUserDAOCollection appUserDAO = new AppUserDAOCollection();
        PersonDAOCollection personDAO = new PersonDAOCollection();
        TodoItemDAOCollection todoItemDAO = new TodoItemDAOCollection();
        TodoItemTaskDAOCollection todoItemTaskDAO = new TodoItemTaskDAOCollection();

        AppUser admin1 = new AppUser("acapot","admin",AppRole.ROLE_APP_ADMIN);
        appUserDAO.persist(admin1);

        AppUser admin2 = new AppUser("epeter","admin",AppRole.ROLE_APP_ADMIN);
        appUserDAO.persist(admin2);

        AppUser user1 = new AppUser("asvens","user",AppRole.ROLE_APP_USER);
        appUserDAO.persist(user1);

        AppUser user2 = new AppUser("kian","user",AppRole.ROLE_APP_USER);
        appUserDAO.persist(user2);

        Person personCreatorAdmin1 = new Person("Alexis", "Capot","ac@hotmail.com", admin1);
        personDAO.persist(personCreatorAdmin1);

        Person personCreatorAdmin2 = new Person("Erick", "Petersson","ep@hotmail.com",admin2);
        personDAO.persist(personCreatorAdmin2);

        Person personAssigneeUser1 = new Person("Åsa", "Svensson","ss@hotmail.com", user1);
        personDAO.persist(personAssigneeUser1);

        Person personAssigneeUser2 = new Person("Kalle", "Iansson","ki@hotmail.com",user2);
        personDAO.persist(personAssigneeUser2);

        TodoItem todoItem1 = new TodoItem("Class of program", "build the classes of the Program", LocalDate.of(2022,10,16), false, personCreatorAdmin1);
        todoItemDAO.persist(todoItem1);

        TodoItem todoItem2 = new TodoItem("DB of program", "build the Database of the Program", LocalDate.of(2022,11,10), false, personCreatorAdmin2);
        todoItemDAO.persist(todoItem2);

        TodoItemTask todoItemTask1 =    new TodoItemTask(true, todoItem1, personAssigneeUser1);
        todoItemTaskDAO.persist(todoItemTask1);

        TodoItemTask todoItemTask2 =    new TodoItemTask(true, todoItem2, personAssigneeUser2);
        todoItemTaskDAO.persist(todoItemTask2);

        System.out.println("=========== Star -> TodoItem Part 3==========");
        System.out.println("--------appUserDAO.findAll()---------");
        appUserDAO.findAll().forEach(System.out::println);
        System.out.println("-------------------------------------");
        System.out.println("--------personDAO.findAll()---------");
        personDAO.findAll().forEach(System.out::println);
        System.out.println("-------------------------------------");
        System.out.println("--------todoItemDAO.findAll()---------");
        todoItemDAO.findAll().stream().filter(x -> x.getId() > 0).map(x -> x.getSummary()).forEach(System.out::println);
        System.out.println("-------------------------------------");
        System.out.println("--------todoItemTaskDAO.findAll()---------");
        todoItemTaskDAO.findAll().stream().filter(x -> x.getId() > 0).map(x -> x.getSummary()).forEach(System.out::println);
        System.out.println("-------------------------------------");
        System.out.println("=========== End -> TodoItem Part 3==========");

/*
        System.out.println("=========== Star -> TodoItem Part 2==========");

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
        System.out.println("=========== End -> TodoItem Part 2==========");*/
    }
}