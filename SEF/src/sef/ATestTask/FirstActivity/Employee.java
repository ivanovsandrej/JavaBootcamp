package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        super();
        jobTitle="Unknown";
        companyName = "Unknown";
        empId = 0;
        salary = 0;
    }

    public Employee(String firstName, String secondName, int age, int id,
                    String title, String company, double salary){
        super(firstName, secondName, age);
        empId = id;
        jobTitle = title;
        companyName = company;
        this.salary = salary;
    }
    //TODO 2 add getters and setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String title) {
        jobTitle = title;
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String company) { companyName = company; }
    public int getEmpId() { return empId; }
    public void setEmpId(int id) { empId = id; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String introduce() {
        String introduction = "My name is " + firstName + " "
                + secondName + " and I am " + age + " years old. "
        + " I'm working as an " + jobTitle + " in " + companyName + " and my salary is " + salary;
        System.out.println(introduction);
        return introduction;
    }

    public void changeJob(String company, String title) {
        companyName = company;
        jobTitle = title;
    }






}