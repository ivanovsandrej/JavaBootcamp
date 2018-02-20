package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
        this.empId = 1;
        this.jobTitle = "Worker";
        this.companyName = "Default";
        this.salary = 0;
    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }


    //TODO 2 add getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String jobTitle) {
        this.companyName = companyName;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //introducing method
    public void introduce() {
        System.out.println("My name is " + getFirstName() + " and i am " + getAge() + " years old" +
                "I am working as " + this.jobTitle + " in " + this.companyName);
    }
}