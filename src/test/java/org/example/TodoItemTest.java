package org.example;

import junit.framework.TestCase;
import org.junit.*;
import junit.framework.TestCase;

import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TodoItemTest {

    //private static int ID;
    private static String TITLE = "Class of program";
    private static String TASKDESCRIPTION = "build the classes of the Program";
    private static LocalDate DEADLINE = LocalDate.of(2022,10,16);
    private static boolean DONE = true;
    private static Person CREATOR = new Person("Alexis", "Capot","ac@hotmail.com");
    private TodoItem testObject;


    @Before
    public void setUp(){
        //public TodoItem(String title, String TASKDESCRIPTION, LocalDate deadLine, boolean done, Person creator)
        testObject = new TodoItem(TITLE, TASKDESCRIPTION, DEADLINE, DONE, CREATOR);
    }

    @Test
    public void test_object_successfully_created() {
        assertNotNull(testObject);
        assertTrue(testObject.getId()>0);
        assertEquals(testObject.getTitle(),TITLE);
        assertEquals(testObject.getTaskDescription(),TASKDESCRIPTION);
        assertEquals(testObject.getCreator(),CREATOR);
        assertTrue(testObject.getDeadLine().equals(DEADLINE));
        assertTrue(testObject.isDone());
        assertNotNull(testObject.getTitle());
        assertNotNull(testObject.getDeadLine());
    }

    @Test(expected = RuntimeException.class)
    public void given_null_runtime_exception() {
        new TodoItem (null, null , null, false, null);
        //System.out.println("si");
    }

    @Test(expected = RuntimeException.class)
    public void given_title_null_runtime_exception() {
        new TodoItem (null, TASKDESCRIPTION , DEADLINE, DONE, CREATOR);
        //System.out.println("si");
    }

    @Test(expected = RuntimeException.class)
    public void given_deadline_null_runtime_exception() {
        new TodoItem (TITLE, TASKDESCRIPTION , null, DONE, CREATOR);
        //System.out.println("si");
    }

/*
    public void testTitle() {
    }

    public void testTaskDescription() {
    }

    public void testDeadLine() {
    }

    public void testIsDone() {
    }

    public void testCreator() {
    }

    public void testIsOverdue() {
    }

    public void testSummary() {
    }*/
    //---------------------------------------
    /*
    public void testGetId() {
    }

    public void testGetTitle() {
    }

    public void testSetTitle() {
    }

    public void testGetTaskDescription() {
    }

    public void testSetTaskDescription() {
    }

    public void testGetDeadLine() {
    }

    public void testSetDeadLine() {
    }

    public void testIsDone() {
    }

    public void testSetDone() {
    }

    public void testGetCreator() {
    }

    public void testSetCreator() {
    }

    public void testIsOverdue() {
    }

    public void testGetSummary() {
    }*/
}