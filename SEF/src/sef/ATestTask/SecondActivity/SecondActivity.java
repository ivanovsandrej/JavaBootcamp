package sef.ATestTask.SecondActivity;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        SecondActivity calculator = new SecondActivity();}


        //TODO Use the calculator to calculate different values
        //Example ->
        //calculator.sum(10.2, 5);
        //calculator.divide(100, 33);
        // and more

    public double getSum(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
    private static double divideZero(double a,double b) {
        double divValue;
        if (b == 0) {
            divValue = 0;
            System.out.println("You cannot divide to 0");
        } else {
            divValue = a / b;
        }
        return divValue;
    }
    public double multiply (double a,double b) {
        return a*b;
    }
    public double substract (double a, double b){
        return a-b;
    }



//TODO create the Calculator (here or in additional class)
public void Calculator() {
        double a;
        double b;
    }
        }



