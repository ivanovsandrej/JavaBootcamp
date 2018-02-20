package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());

    }

    public void TestempId() {
        Employee employee = new Employee();
        employee.SetempId(1);
        assertEquals(1, employee.getEmpId());}

    public void TestJobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("programmer");
        assertEquals("programmer", employee.getjobTitle();}

    public void TestCompanyName() {
        Employee employee = new Employee();
        employee.setcompanyName("Accenture");
        assertEquals("Accenture",employee.getjobTitle());
    }


    @Test
    public void TestCreate() {
        Employee employee = new Employee(1, "programmer", "Accenture", 10000);
        assertEquals(1, employee.getEmpId());
        assertEquals("programmer", employee.getjobTitle());
        assertEquals("Accenture", employee.getcompanyName());
        assertEquals(10000, employee.getSalary(), 2);

    }

public void TestSalary () {
    Employee employee = new Employee;
    employee.setSalary(12000);
    assertEquals(12000,employee.getSalary(), 2);
}
}
