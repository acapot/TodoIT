package org.example;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

public class AppUserTest {

    private static final String USERNAME = "acapot";
    private static final String PASSWORD ="admin";
    private static final AppRole ROLE = AppRole.ROLE_APP_ADMIN;
    private AppUser testObject;

    @Before
    public void setUp(){
        testObject = new AppUser(USERNAME,PASSWORD, ROLE);
    }

    @Test
    public void test_object_successfully_created() {
        assertNotNull(testObject);
        //assertTrue(testObject.getId()>0);
        assertEquals(testObject.getPassword(),PASSWORD);
        assertEquals(testObject.getUsername(),USERNAME);
        assertEquals(testObject.getRole(),ROLE);
    }

    @Test(expected = RuntimeException.class)
    public void given_null_runtime_exception() {
        new AppUser (null, null , null);
    }

    @Test(expected = RuntimeException.class)
    public void given_user_name_null_runtime_exception() {
        new AppUser (null, PASSWORD , ROLE);
    }

    @Test(expected = RuntimeException.class)
    public void given_password_null_runtime_exception() {
        new AppUser (USERNAME, null , ROLE);
    }

    /*
    public void testGetUsername() {
    }

    public void testSetUsername() {
    }

    public void testGetPassword() {
    }

    public void testSetPassword() {
    }

    public void testGetRole() {
    }

    public void testSetRole() {
    }*/
}