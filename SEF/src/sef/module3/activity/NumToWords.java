/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
				
		int i = 6;
		String numText = "";

		switch(i) {
		
		case 1:
			numText = "ONE";break;
		case 2:
			numText = "TWO";break;
		case 3:
			numText = "THREE";break;
		case 4:
			numText = "FOUR";break;
		case 5:
			numText = "FIVE";break;
		// complete the code.
			case 6:
				numText = "SIX";break;
		default:
			numText = "NUMBER " + i;
		}
		System.out.println(numText);
		
	
	}
	

}
