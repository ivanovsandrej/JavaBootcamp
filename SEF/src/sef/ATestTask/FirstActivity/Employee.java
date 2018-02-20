package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee( ){ }
    //TODO 2 add getters and setters

    public int setempId() {
        return empId;
    }
    public void ssetempId(int empId) { this.empId = empId; }

    public String getjobTitle() {
        return jobTitle;
    }
    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getcompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName="<E>"+companyName;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    {
        System.out.println("I am working as " +  getjobTitle() + " in " + getcompanyName() );
    }


}