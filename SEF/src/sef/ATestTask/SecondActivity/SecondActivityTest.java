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
		assertEquals(15.0, (theCalculator.getSum(5, 10)));
		assertEquals(15.0, (theCalculator.getSum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5.0, (theCalculator.getSum(-5, 10)));
		assertEquals(-5.0, (theCalculator.getSum(5, -10)));
	}
	@Test
	public void testDividePositive() {
		assertEquals(2.0, (theCalculator.divide(10, 5)));
		assertEquals(2.0, (theCalculator.divide(-10, -5)));
		assertEquals(100.0, theCalculator.divide(1000.0, 10.0));
		assertEquals(100.0, theCalculator.divide(0.1, 0.001));
	}
	@Test
	public void testDivideNegative() {
		assertEquals(-5.0, theCalculator.divide(10, -2));
		assertEquals(-5.0, theCalculator.divide(-10, 2));
		assertEquals(-2.0, (theCalculator.divide(10, -5)));
	}
	@Test
	public void testDivisionByZero() {
		assertEquals(0.0, theCalculator.divide(100, 0)); //our calculator returns a zero if we try to divide by 0ok
	}
	@Test
	public void testSubtractions() {
		assertEquals(0.0, theCalculator.subtract(5.0, 5.0));
		assertEquals(-2.0, theCalculator.subtract(3.0, 5.0));
		assertEquals(2.0, theCalculator.subtract(5.0, 3.0));
		assertEquals(100.0, theCalculator.subtract(105.0, 5.0));
	}



}


