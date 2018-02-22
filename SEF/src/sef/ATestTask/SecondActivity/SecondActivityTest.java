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
		assertEquals(15d, (theCalculator.getSum(5d, 10d)));
		assertEquals(15d, (theCalculator.getSum(10d, 5d)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5d, (theCalculator.getSum(-5d, 10d)));
		assertEquals(-5d, (theCalculator.getSum(5d, -10d)));
	}

}

