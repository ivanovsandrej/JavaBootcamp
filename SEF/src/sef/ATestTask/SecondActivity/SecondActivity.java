package sef.ATestTask.SecondActivity;

public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more
		calculator.add(10.2, 5);
		calculator.divide(100, 33);}

		// Add
	public double add (double x, double y) {
		return x + y;
	}

	// Subtract
	public double subtract(double x, double y) {
		return  x - y;
	}

	// Multiply
	public double multiply(double x, double y) {
		return x * y;
	}

	// Divide
	public int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			divValue = 0;
		} else {
			divValue = x / y;
		}
		return divValue;
	}

}
