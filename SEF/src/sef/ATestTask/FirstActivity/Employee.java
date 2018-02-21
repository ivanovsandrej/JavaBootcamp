package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId = 777;
        this.jobTitle = "Unknown Title";
        this.companyName = "Unknown Company";
        this.salary = 155.55;
    }

    public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary){

        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }


    public void workChange (int newempId, String newjobTitle, String newcompanyName, double newsalary) {
        this.empId= newempId;
        this.jobTitle= newjobTitle;
        this.companyName= newcompanyName;
        this.salary= newsalary;
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

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I am work as " + jobTitle + " in " + companyName);}
}