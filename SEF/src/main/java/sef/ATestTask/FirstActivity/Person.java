package sef.ATestTask.FirstActivity;


public class Person {
	String firstName;
	String secondName;
	int age;

//TODO 1 Implement Person Attributes


	//Behavior - default constructor
	public Person(){
		this.firstName="John";
		this.secondName = "Doe";
		this.age = 0;
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
		this.firstName = firstName;
	}

	public void welcomeMessage(){
		System.out.println("My name is " + getFirstName() + " and i am " + getAge() + " years old");
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

