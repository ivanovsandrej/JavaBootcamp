package ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String title;
    private String companyName;
    private int salary;
/*public String EmployeeName;
public String EmployeeNumber;
public int hireyear;
public double WeeklyEarning; */
    //TODO 1 create different constructors
    public Employee(){


    }
/* public Employee()
{
    EmployeeName = null;
    EmployeeNumber = null;
    hireyear = 0;
    WeeklyEarning = 0;

}*/
    //TODO 2 add getters and setters
    // getter for Id
    public int getempId() {
        return empId;
    }

    // setter for Id
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    //Getter/Setter for Job Title
    public String getTitle(String jobTitle) {
        return Title;
    }


    public void setTitle(String Title) {
        this.title = "I work as" +Title;

}
//Getter/Setter for Company Name
    public String getCompanyName(String companyName) {
        return companyName;
    }


    public void setCompanyName(String companyName) {
        this.companyName = "In" +companyName;}

        //Getter/Setter for Salary
        public int getSalary (int salary) {
            return salary;
        }


    public void setSalary(int salary) {
        this.salary = salary;}


    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle(int salary) {
        this.salary = salary;
    }
}