package sef.ATestTask.FirstActivity;

import java.junit.Test;

import static java.junit.Assert.assertEquals;

public class EmployeeTest {


    Employee emp = new Employee(1, "jobTitle", "companyName", 2);

    @Test
    public void getCompanyName() {
        assertEquals("I am an error message", "companyName", emp.getCompanyName());
    }

    @Test
    public void getSalary() {
        assertEquals("I am an error message", 2, emp.getSalary(), 0);
    }

    @Test
    public void getJobTitle() {
        assertEquals("I am an error message", "jobTitle", emp.getJobTitle());
    }

    @Test
    public void getEmpId() {
        assertEquals("I am an error message", 1, emp.getEmpId(), 0);
    }


    @Test
    public void setCompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("Test1");
        assertEquals("I am an error message", "Test1", employee.getCompanyName());
    }

    @Test
    public void setSalary() {
        Employee employee = new Employee();
        employee.setSalary(100);
        assertEquals("I am an error message", 100, employee.getSalary(), 0);
    }


    @Test
    public void setJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("Test1");
        assertEquals("I am an error message", "Test1", employee.getJobTitle());
    }


    @Test
    public void setEmpId() {
        Employee employee = new Employee();
        employee.setEmpId(3);
        assertEquals("I am an error message", 3, employee.getEmpId(), 0);
    }


}