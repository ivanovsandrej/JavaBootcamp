package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {
		public static void main(String[] args) {
			//TODO Use the calculator to calculate different values
			//Example ->
			//calculator.sum(10.2, 5);
			//calculator.divide(100, 33);
			// and more

			Calc normalCalc = new Calc(Calc.CALC_TYPE_BASIC);

			System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");

			// Add
			double result = normalCalc.add(4.2, 5);
			System.out.println("1) Add result is                : " + result);

			// Multiply
			double multiplication = normalCalc.mul(10.3 , 5 );
			System.out.println("2) Multiplication result is     : " + multiplication);

			//Substraction
			double substraction = normalCalc.subtract(6.5,6);
			System.out.println("3) Substraction result is       : " + substraction);

			//Dividing
			double dividing = normalCalc.divide(100, 33);
			System.out.println("4) Dividing result is           : " + dividing);


		}
	}

	//TODO create the Calculator (here or in additional class)
	//There is additional class for cal

