package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	private SecondActivity theCalculator;

	//before
	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		SecondActivity theCalculator = new SecondActivity();
	}
//after
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
public void testSubstract(){
		assertEquals(5, theCalculator.substract(10,5));
		assertEquals(-5,theCalculator.substract(5,10));
}
public void testSubstractnegative(){
	assertEquals(-15,theCalculator.substract(-5,10));
	assertEquals(5,theCalculator.substract(5,-10));
}
public void testMultipky(){
	assertEquals(50,theCalculator.multiply(5,10));
	assertEquals(50,theCalculator.multiply(10,5));

}
public void testMultiplynegative(){
	assertEquals(-50,theCalculator.multiply(-5,10));
	assertEquals(-50,theCalculator.multiply(5,-10));
	assertEquals(50,theCalculator.multiply(-5,-10));
}
public void testDivide(){
	assertEquals(-0.5,theCalculator.divide(5,10));
	assertEquals(2,theCalculator.divide(10,5));
}
public void testdivideZero(double a, double b){
	assertEquals(0,theCalculator.divide(0,10));
	assertEquals("You cannot divide to 0", theCalculator.divide(10,0));
	}
}

