package ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
private String firstName;
private String secondName;
	private String age;

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknownn";
		this.age = age;

	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, String age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getName() {
		return firstName;
	}

	public void setName(String firstName) {
		this.firstName = "I am" +firstName;
	}

	// getter for int age
	public String getAge() {
		return age;
	}

	// setter for int age
	public void setAge(String age) {
		this.age = age +"years old";
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
}

