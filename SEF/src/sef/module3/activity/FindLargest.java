/**
 * 
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class FindLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Find Largest of two numbers
				
		int num1 = 1, num2 = 2;

		if (num1 > num2) {
			System.out.println(num1 + " is largest of two numbers");
		} else {
			System.out.println(num2 + " is largest of two numbers");
		}

		// Find Largest of three numbers
				
		int i = 1, j = 2, k = 10;

		if (i > j) {
			//i is largest of two numbers
			if (i > k) {
				System.out.println(i + " is largest of three numbers");
			}
			else
			{
				System.out.println(k + " is largest of three numbers");
			}
		} else {
			//j is largest of two numbers
			if (j > k) {
				System.out.println(j + " is largest of three numbers");
			}
			else
			{
				System.out.println(k + " is largest of three numbers");
			}
		}

	}

}
