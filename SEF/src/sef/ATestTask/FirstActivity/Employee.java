package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
        this.empId = 1;
        this.jobTitle = "Developer";
        this.companyName = "Lion Company";
        this.salary = 1500;
    }

    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }
    //TODO 2 add getters and setters

    // write getter for int emId
    public int getEmpId() { return empId; }

    // write setter for for int emId
    public void setEmpId(int empId){
        this.empId = empId;
    }

    // write getter for String jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // write setter for String jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // write getter for String companyName
    public String getCompanyName() {
        return companyName;
    }

    // write setter for String companyName
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // write getter for double salary
    public double getSalary() {
        return salary;
    }

    // write setter for double salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void announce() {
        super.announce();  // calls announce() method of Person class
        System.out.println("Inside Employee Class");
    }
    public String introduce(){
        return "My name is " + getFirstName() + " and I am " + getAge() + " years old. I am working as " + jobTitle+" in " + companyName;
    }
}