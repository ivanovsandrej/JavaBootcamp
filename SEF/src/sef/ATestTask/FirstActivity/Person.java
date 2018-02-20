package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
	private String firstName, secondName;
	public int age;
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

	// getter for String firstName
	public String getFirstName() {
		System.out.println(firstName); return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
			try {
				Integer.valueOf(firstName);
			} catch (NumberFormatException e) {
				System.out.println("Numbers in name");
			}
		}

	// getter for int age
	public int getAge() {
		System.out.println(age);return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		System.out.println(secondName);
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String introduce(){
		System.out.println("---------------------------------------------------");
		return "My name is " + firstName + " " + secondName + " and i am " + age + " years old";
	}

}

