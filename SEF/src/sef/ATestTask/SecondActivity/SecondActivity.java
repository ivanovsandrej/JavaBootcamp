package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();{


			// Add

			public double add(x, y){
			double sum = x + y;
			return x+y;
		}

			// Subtract
		public double subtract ( int x, int y){
			int diff = 0;
			if (x > y) {
				diff = x - y;
			} else {
				diff = y - x;
			}

			return diff;
		}

		// Multiply
		public double multiply ( int[] numbers){
			int temp = 1;

			for (int i = 0; i < numbers.length; i++) {
				temp = temp * numbers[i];
			}
			return temp;

		}

		// Divide
		public double divide ( int x, int y){
			int divValue = 0;
			if (x == 0 || y == 0) {
				divValue = 0;
			} else {
				divValue = x / y;
			}
			return divValue;

		}


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

	}

		//TODO create the Calculator (here or in additional class)

	}
}

