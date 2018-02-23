package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();
    }

    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract
    public int subtract(int x, int y) {
        return x - y;
    }

    // Multiply
    public int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
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
