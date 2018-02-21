package sef.module8.activity;

import java.sql.SQLClientInfoException;

// Needs to be completed
public class ArithmeticExceptionActivity {
	//1 - Type main method and call catchMe with 10 and 0
	public static void main(String arg[]) throws SQLClientInfoException {
		catchMe(10,0);
		catchMe(10,2);
		catchMe(0,2);

		catch2(0,0);
	}

	public static void catch2(int num1, int num2) throws ArithmeticException, NullPointerException, SQLClientInfoException {
		int result  = num1 / num2;
		System.out.println("The result is: " + result);
	}

	static void catchMe(int num1, int num2)
	{
		//The following code results in an Exception.
		//2 - Identify the exception and write code to handle this exception.
		try
		{
			int result = num1 / num2;
			System.out.println("The result is :" + result);
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Your cod fails with exception: " + ex.getMessage());
		}
		//3 - After handling the exception, write a finally block which
		//prints a message "Thank you for using this program."
		finally
		{
			System.out.println("Thank you for using this program.\n");
		}

	
	//4- try to call catchMe with 10 and 2 now and see which messages get printed. 
	
}

}
