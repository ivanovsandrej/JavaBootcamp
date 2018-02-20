package sef.ATestTask.FirstActivity;

import javax.swing.text.StringContent;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;


    public Employee() {
        this.companyName = "";
        this.empId = 0;
        this.jobTitle = "";
        this.salary = 0;
    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        System.out.println("Test");
    }

    public void Greeting() {
        Employee obj = new Employee();
        System.out.println("My name is " + obj.getFirstName() + " I' m " + obj.getAge() + " years old");
        System.out.println("I'm working " + getJobTitle() + " in " + getCompanyName());
    }


    /*-------------------------------------------------------TODO 2 add getters and setters*/

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary =  double salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


}