package sef.ATestTask.FirstActivity;


import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.text.ParseException;

public class Person {

//TODO 1 Implement Person Attributes

	//Behavior - default constructor
	public Person() {
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

	//properties
	private String firstName;
	private String secondName;
	private int age;

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		boolean hasDigit = firstName.matches(".*\\d+.*");
		if (hasDigit==true) {
			throw new NumberFormatException();
		} else this.firstName = firstName;
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

	//method for introducing a person
	public void introducePerson() {
		System.out.println("My name is "+ getFirstName() + " and I am "+ getAge() + " years old");
	}
}

