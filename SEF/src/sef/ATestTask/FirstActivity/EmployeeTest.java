package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setJobTitle("Pilot");
        employee.setSecondName("Doe");
        employee.setCompanyName("Company");
        employee.setSalary(500);
        employee.setEmpId(345);

        assertEquals("First name error", "John", employee.getFirstName());
        assertEquals("Job title error", "Pilot", employee.getJobTitle());
        assertEquals("Second name error", "Doe", employee.getSecondName());
        assertEquals("Company name error", "Company", employee.getCompanyName());
        assertEquals("Salary error", 500, employee.getSalary(),2);
        assertEquals("Emp ID error", 345, employee.getEmpId());
    }

    @Test
    public void checkEmployeeConstructor() {
        Employee empl11 = new Employee(001, "Name", "Surname", 25, "Job", "Company", 999);

        assertEquals("Error in empId", 001, empl11.getEmpId());
        assertEquals("Error in Name", "Name", empl11.getFirstName());
        assertEquals("Error in Surname", "Surname", empl11.getSecondName());
        assertEquals("Error in Age", 25, empl11.getAge());
        assertEquals("Error in JobTitle", "Job", empl11.getJobTitle());
        assertEquals("Error in Company", "Company", empl11.getCompanyName());
        assertEquals("Error in Salary", 999, empl11.getSalary(),2);

    }

    @Test
    public void checkChangeWork() {
        Employee emp33 = new Employee(001, "Name", "Surname", 25, "Job", "Company", 999);

        emp33.chanegeWork(222, "NewJob", "NewCompany", 525);

        assertEquals("New ID error", 222, emp33.getEmpId());
        assertEquals("New Job error", "NewJob", emp33.getJobTitle());
        assertEquals("New Company error", "NewCompany", emp33.getCompanyName());
        assertEquals("New Salary error", 525, emp33.getSalary(),2);

    }


}