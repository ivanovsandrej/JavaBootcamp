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
        calculator.sum(10.2, 5);
        calculator.subtract(7.3, -3.44);
        calculator.divide(44.8, 2.1);
        calculator.multiply(63.1, 88.72);

    }

    //TODO create the Calculator (here or in additional class)
    public double sum(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double divide(double x, double y) {
        double divValue;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double bug(double x, double y) {
        throw new NullPointerException();
    }
}
