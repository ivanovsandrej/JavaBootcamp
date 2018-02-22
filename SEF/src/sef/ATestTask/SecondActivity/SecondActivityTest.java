package sef.ATestTask.SecondActivity;
// Complete Code

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

    private SecondActivity theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theCalculator = new SecondActivity();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //Example ->
    @Test
    public void testGetSumPositiveValue() {
        assertEquals(15.0, (theCalculator.sum(5, 10)));
        assertEquals(15.0, (theCalculator.sum(10, 5)));
    }

    //Example ->
    @Test
    public void testGetSumNegativeValue() {
        assertEquals(5.0, (theCalculator.sum(-5, 10)));
        assertEquals(-5.0, (theCalculator.sum(5, -10)));
    }

    //begin 7) Add tests for calculator
    @Test
    public void test1() {
        assertEquals(5.0, (theCalculator.subtract(5, 10)));
        assertEquals(5.0, (theCalculator.subtract(10, 5)));
    }

    @Test
    public void test2() {
        assertEquals(50.0, (theCalculator.multiply(5, 10)));
        assertEquals(50.0, (theCalculator.multiply(10, 5)));
    }

    @Test
    public void test3() {
        assertEquals(0.5, (theCalculator.divide(5, 10)));
        assertEquals(2.0, (theCalculator.divide(10, 5)));
        assertEquals(0.0, (theCalculator.divide(0, 5)));
    }

    @Test
    public void test4() {
        boolean testPass = false;

        try {
            theCalculator.divide(5, 0);
        } catch (ArithmeticException e) {
            testPass = true;
        }

        assertEquals(testPass, true);
    }
    //end 7) Add tests for calculator
}

