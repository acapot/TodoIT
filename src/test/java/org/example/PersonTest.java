package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class PersonTest extends TestCase {

    public static final String FIRSTNAME = "Alexis";
    public static final String LASTNAME = "Capot";
    public static final String EMAIL = "ac@hotmail.com";
    private Person testObject;

    @Before
    public void setUp(){
        testObject = new Person(FIRSTNAME,LASTNAME, EMAIL);
    }

    @Test
    public void test_object_successfully_created() {
        assertNotNull(testObject);
        assertTrue(testObject.getId()>0);
        assertEquals(testObject.getFirstname(),FIRSTNAME);
        assertEquals(testObject.getLastName(),LASTNAME);

    }


    @Test (expected = RuntimeException.class)
    public void given_null_runtime_exception() {
        new Person (null, null , null);
    }

    @Test
    public void testFirstName() {
        String expected = "Alexis";
        assertEquals(expected, testObject.getFirstname());
    }


    @Test
    public void testLastName() {
        String expected = "Capot";
        assertEquals(expected, testObject.getLastName());
    }

    @Test
    public void testEmail() {
        String expected = "ac@hotmail.com";
        assertEquals(expected, testObject.getEmail());
    }
/*
    @Test(expected = RuntimeException.class)
    public void given_first_name_null_runtime_exception() throws RuntimeException {
        new Person (null, LASTNAME , EMAIL);
    }

    @Test(expected = RuntimeException.class)
    public void given_last_name_null_runtime_exception() throws RuntimeException{
        new Person (FIRSTNAME, null , EMAIL);
    }

    @Test(expected = RuntimeException.class)
    public void given_email_null_runtime_exception() throws RuntimeException{
        new Person (FIRSTNAME, FIRSTNAME , null);
    }*/
/*
    @Test
    public void testSetLastName() {
    }

    @Test
    public void testGetEmail() {
    }

    @Test
    public void testSetEmail() {
    }

    @Test
    public void testGetSummary() {
    }*/
}