package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;
import sef.ATestTask.SecondActivity.SecondActivity;

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
		assertEquals(15, (theCalculator.add(5, 10)));
		assertEquals(15, (theCalculator.add(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.add(-5, 10)));
		assertEquals(-5, (theCalculator.add(5, -10)));
	}

	@Test
	public void testSubtractPositiveValue() {
		assertEquals(-5, (theCalculator.subtract(5, 10)));
		assertEquals(5, (theCalculator.subtract(10, 5)));
	}

	@Test
	public void testSubtractNegativeValue() {
		assertEquals(-15, (theCalculator.subtract(-5, 10)));
		assertEquals(15, (theCalculator.subtract(5, -10)));
		assertEquals(-5, (theCalculator.subtract(-5, -10)));
	}

	@Test
	public void testMultiplyPositiveValues() {
		assertEquals(15, theCalculator.multiply(5, 3));
		assertEquals(15, theCalculator.multiply(3, 5));
	}

	@Test
	public void testMultiplyNegativeValues() {
		assertEquals(-15, theCalculator.multiply(-5, 3));
		assertEquals(-15, theCalculator.multiply(-3, 5));
		assertEquals(15, theCalculator.multiply(-3, -5));
	}

	@Test
	public void testDevidePositiveValue() {
		assertEquals(5, theCalculator.divide(15, 3));
		assertEquals(0.2, theCalculator.divide(3, 15));
	}

	@Test
	public void testDevideNegativeValue() {
		assertEquals(-5, theCalculator.divide(-15, 3));
		assertEquals(-5, theCalculator.divide(15, -3));
		assertEquals(5, theCalculator.divide(-15, -3));
	}
}

