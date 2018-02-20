package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors

    public Employee(){

    }
    public Employee(int empId, String jobTitle, String companyName, double salary){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }


    //TODO 2 add getters and setters

    // getter and setter for int empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // getter and setter for String jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // getter and setter for String companyName
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // getter and setter for double salary
    public double getSalary() {
        return getSalary();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduceEmployee() {
        System.out.println("My name is " + getFirstName() + "" + getSecondName() + "and I am " + getAge() + " year old. I work as " + getJobTitle() + " in " + getCompanyName());
    }

   /* public void Change(int empId, String jobTitle, String companyName, double salary){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;*/
    //}
}