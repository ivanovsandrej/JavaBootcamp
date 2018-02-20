package sef.ATestTask.SecondActivity;
// Complete Code

import junit.framework.TestCase;
import org.junit.Assert;
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

    @Test
    public void testDevidePositiveValue() {
        Assert.assertEquals("Divide positive value Error", 3, theCalculator.divide(9, 3), 2);
        Assert.assertEquals("Divide positive value Error", 0.33, theCalculator.divide(3, 9), 2);
    }

    @Test
    public void testDevideNegativeValue() {
        Assert.assertEquals("Divide positive value Error", -3, theCalculator.divide(-9, 3), 2);
        Assert.assertEquals("Divide positive value Error", -3, theCalculator.divide(9, -3), 2);
    }

    @Test
    public void testMultiplyPositiveValues() {
        Assert.assertEquals("Mult error", 12, theCalculator.multiply(4, 3), 2);
        Assert.assertEquals("Mult error", 12, theCalculator.multiply(3, 4), 2);
    }

    @Test
    public void testMultiplyOneNegativeValue() {
        Assert.assertEquals("Mult error", -12, theCalculator.multiply(-4, 3), 2);
        Assert.assertEquals("Mult error", -12, theCalculator.multiply(-3, 4), 2);
    }

    @Test
    public void testMultiplyTwoNegativeValues() {
        Assert.assertEquals("Mult error", 12, theCalculator.multiply(-4, -3), 2);
        Assert.assertEquals("Mult error", 12, theCalculator.multiply(-3, -4), 2);
    }


    @Test
    public void testBug() {
        boolean isok = false;
        try {
            theCalculator.bug(4, 5);
        } catch (NullPointerException e) {
            isok = true;

        }

        Assert.assertTrue("Error", isok);
    }

}

