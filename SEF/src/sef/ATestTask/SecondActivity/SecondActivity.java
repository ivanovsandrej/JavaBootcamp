package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more
		double result = calculator.sum(3,4);
		System.out.println(result);
	}

	//TODO create the Calculator (here or in additional class)
	public double sum(double a, double b) {
		double res = a+b;
		return res;
	}

	public double substract(double a, double b) {

		double res = a-b;
		return res;
	}

	public double multiply(double a, double b) {

		double res = a*b;
		return res;
	}

	public double divide(double a, double b) {
		double res = a/b;
		return res;
	}

}
