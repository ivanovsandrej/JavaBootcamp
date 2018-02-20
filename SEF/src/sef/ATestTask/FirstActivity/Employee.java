package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    public Employee(){
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0;
    }

    public Employee(int empId, String jobTitle, String companyName, double salary){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getEmpId() {
        return this.empId;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduceEmployee() {
        return (  "I am work as " + this.getJobTitle() + " in " + this.getCompanyName());
    }

}