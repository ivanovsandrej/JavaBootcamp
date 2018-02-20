package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;


    //TODO 1 create different constructors
    public Employee(int empId, String jobTitle, String companyName, int salary, String name, int age) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.firstName = name;
        this.age = age;
    }
    //TODO 2 add getters and setters

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle() {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


    public int getage() { return age; }

    public void setage(int age) { this.age = age; }


    @Override
    public void introduceOfPerson() {
        System.out.println("My name is " + firstName + " " + secondName + " and I am " + age + " years old. I am work as " + jobTitle + " in " + companyName);
    }

}
