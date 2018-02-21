package sef.ATestTask.Bonus;

import java.util.Scanner;

/**
 * @author Crunchify.com
 *
 */

// BEFORE you'll read it, i would like to say that this code is with USER INPUT but the output is not really
    // match for the Task, because the loop starts from "1", not from "0"


public class Fibonacci_UserInput {

    @SuppressWarnings("resource")
    public static void main(String args[]) {

        // User unput
        log("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        // printing Fibonacci series upto number
        for (int i = 2; i <=number; i++) {
            log(fibonacciRecusion(i) + " ");
        }
        log("\n Fibonacci number at location " + number + " is ==> " + (fibonacciLoop(number) + ""));
    }
    public static int fibonacciRecusion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2);
    }


    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2; // Here is the sum of previous 2 numbers of Fibonacci
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; // returning Fibonacci number
    }

    private static void log(String number) {
        System.out.println(number);

    }
}