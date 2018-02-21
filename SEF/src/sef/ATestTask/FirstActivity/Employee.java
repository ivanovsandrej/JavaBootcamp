package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;

    }
public Employee(int empId, String JobTitle, String companyName, double salary) {
    this.empId = empId;
    this.jobTitle = JobTitle;
    this.companyName = companyName;
    this.salary = salary;
    String firstName = getFirstName();
    int age = getAge();
    System.out.println("My name is"+firstName+"and i am" + age + "I'm work as"+JobTitle +"in" + companyName);
}
    //TODO 2 add getters and setters
    public void SetempId(int id) {
        this.empId = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setJobTitle(String title) {
        this.jobTitle = title;
    }

    public String getjobTitle() {
        return jobTitle;
    }

    public void setcompanyName(String name) {
        this.companyName = name;
    }

    public String getcompanyName() {
        return companyName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void changeParam(String newCompany) {this.companyName = newCompany;}

    }