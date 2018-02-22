/**
 * 
 */
package sef.ATestTask.SecondActivity;

/**
 * @author 
 *
 */
public class Calculator {



	public double getSum(double x, double y) {
		double sum = x + y;
		return sum;
	}

	public double getSubtract(double x, double y) {
		double diff = 0;
		//if (x > y) {
		diff = x - y;
		//}
		return diff;
	}

	public double getMultiply(double x, double y) {
		double temp = x * y;

		return temp;

	}

	public double getDivide(double x, double y) {
		double divValue = 0;
		if ( y == 0 ) {
			System.out.println("Dividing to 0 is not allowed!");
			divValue = 0;
		} else {
			divValue = x / y;
		}
		return divValue;

	}

}

