package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private Calc theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new Calc();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15.0, (theCalculator.add(5,10)));
		assertEquals(15.0, (theCalculator.add(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5.0, (theCalculator.add(-5, 10)));
		assertEquals(-5.0, (theCalculator.add(5, -10)));
	}

	@Test
	public void testGetMulNegativeValue() {
		assertEquals(-50.0, (theCalculator.mul(-5, 10)));
		assertEquals(-50.0, (theCalculator.mul(5, -10)));
		assertEquals(50.0, (theCalculator.mul(-5, -10)));
	}
	@Test
	public void testGetMulZeroValue(){
		assertEquals(0.0, (theCalculator.mul(-5, 0)));
		assertEquals(0.0, (theCalculator.mul(0, -10)));
	}
	@Test
	public void testGetSubZeroValue() {
		assertEquals(5.0, (theCalculator.subtract(-5, 0)));
		assertEquals(10.0, (theCalculator.subtract(0, -10)));
	}
	@Test
	public void testGetDivideNegativesValue() {
		assertEquals(-5.0, (theCalculator.divide(-50, 10)));
		assertEquals(-5.0, (theCalculator.divide(50, -10)));
		assertEquals(5.0, (theCalculator.divide(-50, -10)));
	}
	@Test
	public void testGetDivideZeroValue() {
		assertEquals(0.0, (theCalculator.divide(-5, 0)));
		assertEquals(0.0, (theCalculator.divide(0, -10)));
	}

}

