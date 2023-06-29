import org.junit.Test;

import static org.junit.Assert.*;

public class bignumberTest {

    // Testic converenge
    @Test
    public void testBiggestNumberIsNumber1() {
        bignumber bigNumber = new bignumber();
        String result = bigNumber.bignumber_method(10, 5, 3);
        assertEquals("Number 1 is the biggest", result);
    }

    @Test
    public void testBiggestNumberIsNumber2() {
        bignumber bigNumber = new bignumber();
        String result = bigNumber.bignumber_method(5, 10, 3);
        assertEquals("Number 2 is the biggest", result);
    }

    @Test
    public void testBiggestNumberIsNumber3() {
        bignumber bigNumber = new bignumber();
        String result = bigNumber.bignumber_method(3, 5, 10);
        assertEquals("Number 3 is the biggest", result);
    }

    @Test
    public void testTwoNumbersAreEqualAndAreTheBiggest() {
        bignumber bigNumber = new bignumber();
        String result = bigNumber.bignumber_method(10, 10, 5);
        assertEquals("Number 1 is the biggest", result);
    }

    @Test
    public void testAllNumbersAreEqual() {
        bignumber bigNumber = new bignumber();
        String result = bigNumber.bignumber_method(5, 5, 5);
        assertEquals("Number 1 is the biggest", result);
    }


    //STATEMENT COVERAGE ___ THIST IS STATEMENT COVERAGE
    @Test
    public void testBiggestNumber() {
        bignumber bn = new bignumber();

        // Test case 1: nr1 is the biggest
        int nr1 = 10;
        int nr2 = 5;
        int nr3 = 2;
        String expected = "Number 1 is the biggest";
        String actual = bn.bignumber_method(nr1, nr2, nr3);
        assertEquals(expected, actual);

        // Test case 2: nr2 is the biggest
        nr1 = 7;
        nr2 = 15;
        nr3 = 4;
        expected = "Number 2 is the biggest";
        actual = bn.bignumber_method(nr1, nr2, nr3);
        assertEquals(expected, actual);


        nr1 = 3;
        nr2 = 8;
        nr3 = 12;
        expected = "Number 3 is the biggest";
        actual = bn.bignumber_method(nr1, nr2, nr3);
        assertEquals(expected, actual);
    }



    //DECISION COVERANGE

    @Test
    public void decision_coverage() {
        bignumber bigNumber = new bignumber();
        assertEquals("Number 1 is the biggest", bigNumber.bignumber_method(10, 5, 2)); // Condition 1 is true
        assertEquals("Number 2 is the biggest", bigNumber.bignumber_method(3, 7, 1)); // Condition 2 is true
        assertEquals("Number 3 is the biggest", bigNumber.bignumber_method(4, 2, 8)); // All conditions are false
        assertEquals("Number 1 is the biggest", bigNumber.bignumber_method(10, 10, 5)); // Condition 1 is true, equal numbers
        assertEquals("Number 2 is the biggest", bigNumber.bignumber_method(8, 10, 10)); // Condition 2 is true, equal numbers
        assertEquals("Number 1 is the biggest", bigNumber.bignumber_method(5, 5, 5)); // All conditions are false, equal numbers

    }
    //To achieve decision coverage, we need to make sure that all
    // possible paths through the if-else statements are executed. In this case, there are three conditions:
    @Test
    public void dicision_coverage() {
        bignumber BigNumber = new bignumber();
        // All three conditions are true
        assertEquals("Number 1 is the biggest", BigNumber.bignumber_method(5, 3, 2));
        assertEquals("Number 1 is the biggest", BigNumber.bignumber_method(7, 7, 4));
        assertEquals("Number 1 is the biggest", BigNumber.bignumber_method(9, 3, 3));

        // Only condition 1 is true
        assertEquals("Number 1 is the biggest", BigNumber.bignumber_method(6, 4, 4));

        // Only condition 2 is true
        assertEquals("Number 2 is the biggest", BigNumber.bignumber_method(4, 8, 2));

        // Only condition 3 is true
        assertEquals("Number 2 is the biggest", BigNumber.bignumber_method(1, 9, 5));

        // Conditions 1 and 2 are true
        assertEquals("Number 1 is the biggest", BigNumber.bignumber_method(10, 7, 3));

        // Conditions 1 and 3 are true
        assertEquals("Number 1 is the biggest", BigNumber.bignumber_method(8, 5, 8));

        // Conditions 2 and 3 are true
        assertEquals("Number 2 is the biggest", BigNumber.bignumber_method(1, 7, 7));

        // No conditions are true
        assertEquals("Number 3 is the biggest", BigNumber.bignumber_method(2, 1, 4));
    }

    // Software testing technique used to ensure that each condition in a decision takes on
    // all possible outcomes at least once, and that each decision is tested in such a way that it takes
    // on all possible outcomes at least once. MC/DC is a type of coverage criteria that requires every possible combination
    // of conditions in a decision to be evaluated, as well as every possible outcome of each condition.
    // This technique is often used in safety-critical systems where a high level of assurance is required


    @Test
    public void mc_dc() {
        bignumber bignumber = new bignumber();
        // Test case 1: nr1 is the biggest number
        String result = bignumber.bignumber_method(5, 2, 3);
        assertEquals("Number 1 is the biggest", result);

        // Test case 2: nr2 is the biggest number
        result = bignumber.bignumber_method(1, 10, 5);
        assertEquals("Number 2 is the biggest", result);

        // Test case 3: nr3 is the biggest number
        result = bignumber.bignumber_method(4, 3, 8);
        assertEquals("Number 3 is the biggest", result);

        // Test case 4: nr1 and nr2 are equal and both are the biggest
        result = bignumber.bignumber_method(10, 10, 4);
        assertEquals("Number 1 is the biggest", result);

        // Test case 5: nr2 and nr3 are equal and both are the biggest
        result = bignumber.bignumber_method(1, 10, 10);
        assertEquals("Number 2 is the biggest", result);

        // Test case 6: nr1 and nr3 are equal and both are the biggest
        result = bignumber.bignumber_method(10, 2, 10);
        assertEquals("Number 1 is the biggest", result);

        // Test case 7: nr1, nr2, and nr3 are equal
        result = bignumber.bignumber_method(7, 7, 7);
        assertEquals("Number 1 is the biggest", result);
    }

}