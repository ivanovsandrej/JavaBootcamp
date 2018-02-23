package sef.ATestTask.SecondActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private SecondActivity calculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		calculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetAddPositiveValue() {
		assertEquals(2, (calculator.add(1, 1)));
		assertEquals(0, (calculator.add(-2, 2)));
	}

	@Test
	public void testGetAddNegativeValue() {
		assertEquals(10, (calculator.add(-10, 20)));
		assertEquals(-10, (calculator.add(20, -30)));
	}
	@Test
	public void testGetSubtractPositiveValue() {
		assertEquals(-5, (calculator.subtract(5, 10)));
		assertEquals(5, (calculator.subtract(10, 5)));
	}
	@Test
	public void testGetSubtractNegativeValue() {
		assertEquals(15, (calculator.subtract(5, -10)));
		assertEquals(-15, (calculator.subtract(-10, 5)));
	}

	@Test
	public void testGetMultiplyPositiveValue() {
		int[] numbers = {4, 3, 3};
		assertEquals(36, (calculator.multiply(numbers)));
	}

	@Test
	public void testGetMultiplyNegativeValue() {
		int[] numbers = { -2, 3, 4};
		assertEquals(-24, (calculator.multiply(numbers)));
	}
	@Test
	public void testGetDividePositiveValue() {
		assertEquals(4, (calculator.divide(100, 25)));
		assertEquals(0, (calculator.divide(1, 4)));
	}

	@Test
	public void testGetSumNegativeValue() {
		assertEquals(-3, (calculator.divide(-6, 2)));
		assertEquals(0, (calculator.divide(2, -6)));
	}

}

