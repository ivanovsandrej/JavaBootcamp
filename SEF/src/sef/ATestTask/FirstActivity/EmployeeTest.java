package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeFirstName(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    @Test
    public void checkEmployeeSecondName(){
        Employee employee = new Employee();
        employee.setSecondName("Test2");
        assertEquals("I am an error message", "Test2", employee.getSecondName());
    }

    @Test
    public void checkEmployeeAge(){
        Employee employee = new Employee();
        employee.setAge(20);
        assertEquals("I am an error message", 20, employee.getAge());
    }

    @Test
    public void checkEmployeeSalary(){
        Employee employee = new Employee();
        employee.setSalary(1500);
        assertEquals("I am an error message", 1500, 0.1,  employee.getSalary());
    }

}