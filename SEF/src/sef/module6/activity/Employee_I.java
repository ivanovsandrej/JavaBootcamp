package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I {
	
	//Attributes
	private double salary;
	private String title;
	
	//Behavior - default constructor.
	public Employee_I(){
		this.title="Unknown";
		this.salary = 0;
		System.out.println("I'm Employee_I constructor"); // Called when creating a Person instance
	}

	// getter for int salary
	public double getSalary() {
		return salary;
	}
	
	// setter for int salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// getter for String title
	public String getTitle() {
		return title;
	}

	// setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
}
