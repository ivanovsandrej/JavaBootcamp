package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //name and age added
    private String name;
    private int age;

    //TODO 1 create different constructors
    public Employee() {
        this.empId = 1;
        this.jobTitle = "Tester";
        this.companyName = "Accenture";
        this.salary = 25000;
        this.name = "Sabine";
        this.age = 18;
    }

    //begin  2.1 Add different constructors
    // constructior 1
    public Employee(int empId, String jobTitle, String companyName, double salary, String name, int age) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    // constructior 2
    public Employee(int empId, String jobTitle, String companyName) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = 10000;
        this.name = "Sabine";
        this.age = 18;
    }

    // constructior 2
    public Employee(int empId, String jobTitle) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = "Accenture";
        this.salary = 20000;
        this.name = "Sabine";
        this.age = 18;
    }
    //end  2.1 Add different constructors

    //TODO 2 add getters and setters
    //begin 2.2 Add getters and setters
    public int getempId() { return empId;}
    public void setempId(int empId) {this.empId = empId;}

    public String getjobTitle() {return jobTitle;}
    public void setjobTitle(String jobTitle) {this.jobTitle = jobTitle;}

    public String getcompanyName() {return companyName;}
    public void setcompanyName(String companyName) {this.companyName = companyName;}

    public double getsalary() {return salary;}
    public void setsalary(double salary) { this.salary = salary; }

    public String getname() {return name;}
    public void setname(String name) { this.name = name; }

    public int getage() { return age; }
    public void setage(int age) { this.age = age; }
    //end 2.2 Add getters and setters


    //begin 2.3 Add method for introduce of person ->"My name is <name> and i am <age> years old I am work as <jobTitle> in <company>"
    public void introduceOfPerson() {
        //in this class there is no <name> and <age> for Employee
        System.out.println("My name is " + name + " and i am " + age + " years old. I am work as " + jobTitle + " in " + companyName);
    }
    //end 2.3 Add method for introduce of person ->"My name is <name> and i am <age> years old I am work as <jobTitle> in <company>"


}