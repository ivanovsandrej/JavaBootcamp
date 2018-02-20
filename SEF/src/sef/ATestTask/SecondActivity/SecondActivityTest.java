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
	public void testGetAddPositiveValue() {
		assertEquals(15, (theCalculator.add(5, 10)));
		assertEquals(15, (theCalculator.add(10, 5)));
	}

	//Example ->
	@Test
	public void testGetAddNegativeValue() {
		assertEquals(5, (theCalculator.add(-5, 10)));
		assertEquals(-5, (theCalculator.add(5, -10)));
	}
	@Test
	public void testGetSubtractPositiveValue() {
		assertEquals(-5, (theCalculator.subtract(5, 10)));
		assertEquals(5, (theCalculator.subtract(10, 5)));
	}
	@Test
	public void testGetSubtractNegativeValue() {
		assertEquals(15, (theCalculator.subtract(5, -10)));
		assertEquals(-15, (theCalculator.subtract(-10, 5)));
	}

	//Example ->
	@Test
	public void testGetMultiplyPositiveValue() {
		int[] test={2,3,4};
		assertEquals(24, (theCalculator.multiply(test)));
	}

	//Example ->
	@Test
	public void testGetMultiplyNegativeValue() {
		int[] test={-2,3,4};
		assertEquals(-24, (theCalculator.multiply(test)));
	}
	@Test
	public void testGetDividePositiveValue() {
		assertEquals(3, (theCalculator.divide(6, 2)));
		assertEquals(0, (theCalculator.divide(2, 6)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(-3, (theCalculator.divide(-6, 2)));
		assertEquals(0, (theCalculator.divide(2, -6)));
	}

}

