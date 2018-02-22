package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes

	//begin 1.1 Based on code implement Person attributes
	private  String firstName;
	private  String secondName;
	private  int age;
	//end  1.1 Based on code implement Person attributes

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	//begin 1.2 Add method for introduce of person ->"My name is <name> and i am <age> years old"
	public void introduceOfPerson (){
		System.out.println("My name is " + firstName + " " + secondName + " and i am "+age+" years old");
	}
	//end 1.2 Add method for introduce of person ->"My name is <name> and i am <age> years old"

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
}

