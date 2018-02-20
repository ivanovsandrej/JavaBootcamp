package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;



	public Employee (){
		System.out.println("My name is <name> and i am <age> years old\n" +
				"   I am work as <jobTitle> in <company>");
	}

	// getter for double salary
	public double getSalary() {
		return salary;
	}

	// setter for double salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// getter for String title
	public String getTitle() {
		return jobTitle;
	}

	// setter for String title
	public void setjobTitle(String title) {
		this.jobTitle = title;
	}

	public String getName(){
		return companyName;
	}

	public void setName(String name){
		this.empId="<E>"+name;
	}

	public String introduce () {
		return
		"My name is " + firstName()+ " and I am " + age()+ " years old" + "I am working as " + jobTitle + " in " +
				companyName);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}


