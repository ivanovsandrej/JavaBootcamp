package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private SecondActivity MyCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		MyCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, (Calculator.add(5, 10)));
		assertEquals(15, (Calculator.add(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (Calculator.add(-5, 10)));
		assertEquals(-5, (Calculator.add(5, -10)));
	}

}

