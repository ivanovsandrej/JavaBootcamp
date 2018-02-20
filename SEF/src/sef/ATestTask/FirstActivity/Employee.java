package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId=0;
        this.jobTitle = "Unknown Title";
        this.companyName = "Unknown Company";
        this.salary = 0;
        // System.out.println("I'm an Employee");
    }

    public Employee(int empID, String jobTitle, String companyName, double salary){
        this.empId = empID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters

    public int getEmpId() { return empId; }

    public void setEmpId (int empId) { this.empId = empId; }

    public String getJobTitle() { return jobTitle; }

    public void setJobTitle ( String jobTitle) { this.jobTitle = jobTitle; }

    public String getCompanyName() { return companyName; }

    public  void setCompanyName ( String companyName ) { this.companyName = companyName; }

    public double getSalary() { return salary; }

    public void setSalary ( double salary)  { this.salary = salary; }

    public void introduce(){
        // "My name is <name> and i am <age> years old
        // I am work as <jobTitle> in <company>"
        System.out.println("My name is " + getFirstName() + " " + getSecondName() + " and i am "  + getAge() + " years old" +
        "\nI am work as " + this.jobTitle + " in company " + this.companyName );
    }


}