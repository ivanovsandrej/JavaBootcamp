package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    @Test
    public void setCompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("Test1");
        assertEquals("I am an error message", "Test1", employee.getCompanyName());

    }
    @Test
    public void setEmpId() {
        Employee employee = new Employee();
        employee.setEmpId(1);
        assertEquals("I am an error message", 1, employee.getEmpId(), 0);
    }

}