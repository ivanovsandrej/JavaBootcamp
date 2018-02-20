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
    public void checkEmployeeSNCreatedProperly(){
        Employee employee = new Employee();
        employee.setSecondName("Test2");
        assertEquals("Error", "Test2", employee.getSecondName());
    }

    @Test
    public void checkEmployeeAge(){
        Employee employee = new Employee();
        employee.setAge(10);

        assertEquals("Error", 10, employee.getAge());
    }

    @Test
    public void checkEmpId(){
        Employee employee = new Employee();
        employee.setEmpId(123);
        assertEquals("Error", 123, employee.getEmpId());
    }

    @Test
    public void checkjobTitle(){
        Employee employee = new Employee();
        employee.setJobTitle("Test3");
        assertEquals("Error", "Test3", employee.getJobTitle());
    }

    @Test
    public void checkCompanyName(){
        Employee employee = new Employee();
        employee.setCompanyName("Test4");
        assertEquals("Error", "Test4", employee.getCompanyName());
    }

    @Test
    public void checkSalary(){
        Employee employee = new Employee();
        employee.setSalary(100.00);
        assertEquals("Error", 100,  employee.getSalary(), 2);
    }


}