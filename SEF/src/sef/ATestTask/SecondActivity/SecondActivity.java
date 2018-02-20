package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();
		System.out.println(calculator.sum(10.2, 5));
		System.out.println(calculator.subtract(10.2, 5));
		System.out.println(calculator.multiply(10.2, 5));
		System.out.println(calculator.divide(10.2, 5));


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

	}

	//TODO create the Calculator (here or in additional class)
	public double sum(double a, double b) {
		double result = a + b;
		return result;
	}
	public double subtract(double a, double b) {
		double result = a - b;
		return result;
	}
	public double multiply(double a, double b) {
		double result = a * b;
		return result;
	}
	public double divide(double a, double b) {
		if (b == 0) throw new ArithmeticException("Divide by 0 is not allowed");
		double result = a / b;
		return result;
	}
}
