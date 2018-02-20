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
		assertEquals(15, (theCalculator.getSum(5, 10)));
		assertEquals(15, (theCalculator.getSum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.getSum(-5, 10)));
		assertEquals(-5, (theCalculator.getSum(5, -10)));
	}

	@Test
	public void testDifferencePositiveValue() {
		assertEquals(-5, (theCalculator.getSum(5, 10)));
		assertEquals(5, (theCalculator.getSum(10, 5)));
	}

	@Test
	public void testDifferenceNegativeValue() {
		assertEquals(-15, (theCalculator.getSum(-5, 10)));
		assertEquals(15, (theCalculator.getSum(5, -10)));
	}

	@Test
	public void testMultiplyPositiveValue() {
		assertEquals(20, (theCalculator.getSum(10, 2)));
		assertEquals(20, (theCalculator.getSum(2, 10)));
	}
	@Test
	public void testMultiplyNegativeValue() {
		assertEquals(-20, (theCalculator.getSum(-10, 2)));
		assertEquals(20, (theCalculator.getSum(-2, -10)));
	}

	@Test
	public void testDividePositiveValue() {
		assertEquals(20, (theCalculator.getSum(10, 2)));
		assertEquals(0.2, (theCalculator.getSum(2, 10)));
	}

	@Test
	public void testDivideNegativeValue() {
		assertEquals(-5, (theCalculator.getSum(-10, 2)));
		assertEquals(5, (theCalculator.getSum(-10, -2)));
	}
}

