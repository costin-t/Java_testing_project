import org.junit.Test;

import static org.junit.Assert.*;


//Equivalence partitioning or equivalence class partitioning (ECP)
// is a software testing technique that divides the input data of a software unit into
// partitions of equivalent data from which test cases can be derived.


//Equivalence partitioning
public class LoginTest {

    @Test
    public void testAgeLoggedIn() {
        Login login = new Login();
        assertEquals("You are logged in.", login.age(20));
    }
    @Test
    public void testAgeTooYoung() {
        Login login = new Login();
        assertEquals("Sorry, you must be 18 or older to log in.", login.age(16));
    }

    @Test
    public void testAgeJustOldEnough() {
        Login login = new Login();
        assertEquals("You are logged in.", login.age(18));
    }

    @Test
    public void testAgeMaxValue() {
        Login login = new Login();
        assertEquals("the value is not correct", login.age(Integer.MAX_VALUE));
    }

    @Test
    public void testAgeMinValue() {
        Login login = new Login();
        assertEquals("Sorry, you must be 18 or older to log in.", login.age(Integer.MIN_VALUE));
    }


//Boundary-value analysis is a software testing technique
// in which tests are designed to include representatives of boundary values in a range.

//Boundary_value
@Test
public void testAgeLogged_agelimit18() {
    Login login = new Login();
    String result = login.age(18);
    assertEquals("You are logged in.", result);
}

    @Test
    public void testAgeNotLoggedIn() {
        Login login = new Login();
        String result = login.age(17);
        assertEquals("Sorry, you must be 18 or older to log in.", result);
    }

    @Test
    public void testAgeBoundaryValueLower() {
        Login login = new Login();
        String result = login.age(18);
        assertEquals("You are logged in.", result);
    }

    @Test
    public void testAgeBoundaryValueUpper() {
        Login login = new Login();
        String result = login.age(120);
        assertEquals("You are logged in.", result);
    }

    @Test
    public void testAgeBoundaryValueLowerMinusOne() {
        Login login = new Login();
        String result = login.age(17);
        assertEquals("Sorry, you must be 18 or older to log in.", result);
    }

    @Test
    public void testAgeBoundaryValueUpperPlusOne() {
        Login login = new Login();
        String result = login.age(121);
        assertEquals("the value is not correct", result);
    }
}
