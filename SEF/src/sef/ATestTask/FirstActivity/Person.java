package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
	private String firstName;
	private String secondName;
	private int age;

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		try{							//here is shown how try to catch is working! Task for 1.5 points.
		boolean hasDigitInUser = firstName.matches(".*\\d+.*");
			if (hasDigitInUser == true){
			throw new NullPointerException();
		}else this.firstName=firstName;
	}catch (NullPointerException e){
			System.out.println("Not valid input!");
		}
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age ;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		try{
			boolean hasDigitInUser = secondName.matches(".*\\d+.*");
			if (hasDigitInUser == true){
				throw new NullPointerException();
			}else this.secondName=secondName;
		}catch (NullPointerException e){
			System.out.println("Not valid input!");
		}
	}
	}



