package sef.module8.sample;
// Needs to be completed
public class TryCatchFinallySample {

	//The following String variable is declared at class level. It'd automatically be initialized to null.
	static String str;
	
	public static void main(String[] args) {
		//1 - Create an instance of TryCatchFinallySample and call catchMeIfYouCan()

		TryCatchFinallySample obj = new TryCatchFinallySample();
		obj.catchMeIfYouCan("text");
		obj.catchMeIfYouCan(str);
		obj.catchMeIfYouCan("text after error");

	}
	
	public void catchMeIfYouCan(String s)
	{
		//As long as we try to print it, it'd work and print null.		
		System.out.println(str);

		//However, when we try to execute any operations on it, it'd throw a NullPointerException
		//Uncomment the following line and then run to see what happens.
		//System.out.println(str.toUpperCase());

		//You should program in a way that such issues are captured. Follow the instructions given by your trainer to complete this code with try, catch, finally blocks
		try
		{
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println("A variable is not initialized");
		}
		finally
		{
			System.out.println(""+
			        "This is finally" +
					"\n --------------------");
		}

		
		//Lets see how do we handle this
		//2 - put the above print statement inside a try catch block 
		
		
		
		
	}
	
}
