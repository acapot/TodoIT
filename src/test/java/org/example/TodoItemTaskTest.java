package org.example;

import junit.framework.TestCase;
import org.junit.*;
import junit.framework.TestCase;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTaskTest {
    private static int ID;
    private static boolean ASSIGNED = true;
    private static Person CREATOR = new Person("Alexis", "Capot","ac@hotmail.com", new AppUser("acapot","admin",AppRole.ROLE_APP_ADMIN));
    private static TodoItem TODOITEM = new TodoItem("Class of program", "build the classes of the Program", LocalDate.of(2022,10,16), false, CREATOR);
    private static Person ASSIGNEE = new Person("Kalle", "Iansson","ki@hotmail.com", new AppUser("kian","user",AppRole.ROLE_APP_USER));
    private TodoItemTask testObject;

    @Before
    public void setUp(){
        //public TodoItemTask(String title, String TASKDESCRIPTION, LocalDate deadLine, boolean done, Person creator)
        testObject = new TodoItemTask(ASSIGNED, TODOITEM, ASSIGNEE);
    }

    @Test
    public void test_object_successfully_created() {
        assertNotNull(testObject);
        assertTrue(testObject.getId()>0);
        assertEquals(testObject.getTodoItem(),TODOITEM);
        assertEquals(testObject.getAssignee(),ASSIGNEE);
        assertTrue(testObject.isAssigned());
        assertNotNull(testObject.getTodoItem());
    }

    @Test(expected = RuntimeException.class)
    public void given_null_runtime_exception() {
        new TodoItemTask (true, null , null);
        //System.out.println("si");
    }

    @Test(expected = RuntimeException.class)
    public void given_null_todo_item_runtime_exception() {
        new TodoItemTask (ASSIGNED, null , ASSIGNEE);
    }

}