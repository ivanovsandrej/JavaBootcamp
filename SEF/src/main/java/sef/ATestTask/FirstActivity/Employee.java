package sef.ATestTask.FirstActivity;

import java.math.BigDecimal;

import static java.lang.System.out;

public class Employee extends Person {

    private int employeeId;
    private int salary;
    private String companyName;
    private String jobTitle;

    //TODO 1 create different constructors
    public Employee() {
        this.employeeId = 0;
        this.salary = 0;
        this.jobTitle = "";
        this.companyName = "";
    }

    public Employee(int employeeId, String jobTitle, String companyName, int salary) {
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(Person person, String title, String companyName, int salary) {
        super(person.getFirstName(), person.getSecondName(), person.getAge());
        this.companyName = companyName;
        this.jobTitle = title;
        this.salary = salary;
    }

    public void Greeting() {
        Employee obj = new Employee();
        out.println("My name is " + obj.getFirstName() + " and I am " + obj.getAge() + " years old");
        out.println("I am working as " + getJobTitle() + " in " + getCompanyName());
    }

    //TODO 2 add getters and setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}