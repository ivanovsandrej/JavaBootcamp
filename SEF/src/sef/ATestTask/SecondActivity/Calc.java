package sef.ATestTask.SecondActivity;

public class Calc {

    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    // Default constructor
    public Calc() {}

    // Parameterized constructor
    public Calc(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Getter for CalculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    // Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public double add(double x, double y) {
        double sum = x + y;
        return sum;
    }

    // Subtract
    public double subtract(double x, double y) {
        double diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }
    // Multiply
    public double mul(double x, double y){
        double mulValue = 0;
        if (x == 0 || y == 0) {
            mulValue = 0;
        } else {
            mulValue = x * y;
        }
        return mulValue;
    }

    // Divide
    public double divide(double x, double y) {
        double divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;

    }
}
