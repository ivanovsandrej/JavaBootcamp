package sef.ATestTask.SecondActivity;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondActivityTest extends TestCase{
    private SecondActivity theCalculator;
    @Before
    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theCalculator = new SecondActivity();
    }

    @After
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void addPositive() throws Exception {
    }
    @Test
    public void addNegative() throws Exception {
    }

    @Test
    public void subtract() throws Exception {
    }

    @Test
    public void subtractNegative() throws Exception {
    }
    @Test
    public void multiply() throws Exception {
    }
    @Test
    public void multiplyNegative() throws Exception {
    }

    @Test
    public void divide() throws Exception {
    }
    @Test
    public void divideNegative() throws Exception {
    }
    @Test
    public void divideZero() throws Exception {
    }

}