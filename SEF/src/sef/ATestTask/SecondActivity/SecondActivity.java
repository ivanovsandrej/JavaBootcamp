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
		double sum = getSum(10.2, 5);
		System.out.println("SUm = " + sum);

		double divided = divide(100, 33);
		System.out.println(" 100 divided by 33 = " + divided);
	}

	public static double getSum(double a, double b) {
		return a + b;
	}

	public static double divide(double a, double b) {
		if (b != 0)
			return a / b;
		return 0;
	}

	public static double subtract(double a, double b) {
		return a - b;
	}

	//TODO create the Calculator (here or in additional class)

}

