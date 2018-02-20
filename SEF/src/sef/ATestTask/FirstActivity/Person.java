package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes
	protected String firstName;
	protected String secondName;
	protected int age;

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

	public String introduce() {
		String introduction = "My name is " + firstName + " "
				+ secondName + "and I am " + age + " years old" ;
		System.out.println(introduction);
		return introduction;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		if (firstName.contains("0") || firstName.contains("1") || firstName.contains("2")
			|| firstName.contains("3") || firstName.contains("4") || firstName.contains("5")
				||firstName.contains("6") || firstName.contains("7") || firstName.contains("8")
				||firstName.contains("9") )
			throw new Exception("name contains digits!");
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

	public void setSecondName(String secondName) throws Exception {
		if (secondName.contains("0") || secondName.contains("1") || secondName.contains("2")
				|| secondName.contains("3") || secondName.contains("4") || secondName.contains("5")
				||secondName.contains("6") || secondName.contains("7") || secondName.contains("8")
				||secondName.contains("9") )
			throw new Exception("name contains digits!");
		this.secondName = secondName;
	}
}

