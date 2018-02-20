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

		}

	}

	//TODO create the Calculator (here or in additional class)

	float result;
	float a;
	float b;

    // Sum
    public int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
    //Substract
    public float sub(float a, float b) {
        result = a - b;
        return result;
    }
    //Multiply
    public float mult(float a, float b) {
        result = a * b;
        return result;
    }

    public float div(float a, float b) {
        result = a / b;
        return result;
    }

    public float sqrt(float a) {
        result = Math.sqrt(a);
        return result;
    }
}
