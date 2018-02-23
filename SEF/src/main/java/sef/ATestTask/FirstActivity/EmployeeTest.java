package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EmployeeTest {


    Employee employee = new Employee(21, "jobTitle", "companyName", 10);

    @Test
    public void getCompanyName() {
        assertEquals("Unit test is failed", "companyName", employee.getCompanyName());
    }

    @Test
    public void getSalary() {
        assertEquals("Unit test is failed", 10, employee.getSalary(), 0);
    }

    @Test
    public void getJobTitle() {
        assertEquals("Unit test is failed", "jobTitle", employee.getJobTitle());
    }

    @Test
    public void getEmpId() {
        assertEquals("Unit test is failed", 21, employee.getEmployeeId(), 0);
    }

    @Test
    public void setCompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("FirstCompanyName1");
        assertEquals("Unit test is failed", "FirstCompanyName1", employee.getCompanyName());
    }

    @Test
    public void setSalary() {
        Employee employee = new Employee();
        employee.setSalary(1337);
        assertEquals("Unit test is failed", 1337, employee.getSalary(), 0);
    }

    @Test
    public void setJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("FirstJobTitle1");
        assertEquals("Unit test is failed", "FirstJobTitle1", employee.getJobTitle());
    }

    @Test
    public void setEmpId() {
        Employee employee = new Employee();
        employee.setEmployeeId(21);
        assertEquals("Unit test is failed", 21, employee.getEmployeeId(), 0);
    }

    @Test
    public void employeeObjectNotNull() {
        Employee employee = new Employee();
        employee.setFirstName("FirstName");
        assertNotNull(employee);
    }

}