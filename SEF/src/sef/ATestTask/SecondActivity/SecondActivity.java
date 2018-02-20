package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity Calculat = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		Calculator MyCalculator = new Calculator();

		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

		System.out.println("*** Calculations will be performed using "+ MyCalculator.getCalculatorType() + " calculator ***");

		// Add
		int result = MyCalculator.add(10, 5);
		System.out.println("1) Add result is " + result);

		//Subtract
		int subt = MyCalculator.subtract(7, 3);
		System.out.println("2) Subtract result is " + subt);


		// Multiply
		int[] mul = {5, 3, 4};
		result = MyCalculator.multiply(mul);
		System.out.println("3) Multiplication result is " + result);


		//Divide float
		float resultFloat = MyCalculator.divide(2.0f, 3.0f);
		System.out.println("4) Devidion result is " + resultFloat);

	}

	//TODO create the Calculator (here or in additional class)

}
