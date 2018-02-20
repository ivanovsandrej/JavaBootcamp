package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    public Employee() {
    }

    //TODO 1 create different constructors


    public Employee(int empId, String firstName, String secName, int age, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.setFirstName(firstName);
        this.setSecondName(secName);
        this.setAge(age);


    }

    public String introduceEmployee() {
        return "My name is " + getFirstName() + " and I am " + getAge() + " years old " + "\n" + "I am work as " + jobTitle + " in " + companyName;
    }


    public void chanegeWork(int newEmpId, String newJobTitle, String newCompanyName, double newSalary) {
        this.empId = newEmpId;
        this.jobTitle = newJobTitle;
        this.companyName = newCompanyName;
        this.salary = newSalary;
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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}