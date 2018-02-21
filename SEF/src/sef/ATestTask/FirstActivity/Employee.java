package sef.ATestTask.FirstActivity;

public class Employee extends Person {

   private int empId;
   private String jobTitle;
   private String companyName;
   private double salary;
   private String firstName;
   private String secondName;
   Employee(){}

   Employee(int empId, String jobTitle, String companyName, double salary, String firstName, String secondName){
       this.empId=empId;
       this.jobTitle=jobTitle;
       this.companyName=companyName;
       this.salary=salary;
       this.firstName=firstName;
       this.secondName=secondName;
   }
    //TODO 1 create different constructors


    //TODO 2 add getters and setters
   public void setSalary(double salary) {this.salary = salary;}
    public double getSalary(){return salary;}

    public void setJobTitle(String jobTitle){this.jobTitle=jobTitle;}
    public String getJobTitle(){return jobTitle;}

    public void setCompanyName(String companyName){this.companyName=companyName;}
    public String getCompanyName(){return companyName;}

    public void setEmpId(int empId){this.empId=empId;}
    public int getEmpId(){return empId;}


}