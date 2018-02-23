package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Anna");
        employee.setSecondName("Ivanova");
        employee.setAge(20);
        employee.setCompanyName("SIA BBC");
        employee.setJobTitle("Manager");
        employee.setSalary(1000);
        employee.setEmpId(1);

        assertEquals("First name ERROR", "Anna", employee.getFirstName());
        assertEquals("Second name ERRON", "Ivanova", employee.getSecondName());
        assertEquals("Age ERROR", 20, employee.getAge());
        assertEquals("Company name ERROR", "SIA ABC", employee.getCompanyName());
        assertEquals("Job title ERROR", "Manager", employee.getJobTitle());
        assertEquals("Id ERROR", 1, employee.getEmpId());
        assertEquals("Salary ERROR", 1000, employee.getSalary(),2);
    }

}