package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId=0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0.00;
    }

    public  Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary) {
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setAge(age);
        this.empId=empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(Person person, int empId, String jobTitle, String companyName, double salary){
        super(person.getFirstName(), person.getSecondName(), person.getAge());
        this.empId=empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    // getter for String jobTitle
    public String getJobTitle() {

        return jobTitle;
    }

    // setter for String jobTitle
    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }

    // getter for int id
    public int getId() {

        return empId;
    }

    // setter for int id
    public void setId(int age) {

        this.empId = empId;
    }

    //getter for String companyName
    public String getCompanyName() {
        return companyName;
    }

    //setter for String companyName
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //getter for String companyName
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }

    //method for introducing an employee
    public void introduceEmployee() {
        System.out.println("My name is "+ getFirstName() + " and I am "+ getAge() + " years old");
        System.out.println("I am working as a "+getJobTitle()+" in a company "+ getCompanyName());
    }

    public void changeWork(int empId, String jobTitle, double salary, String companyName) {
        this.empId=empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

}