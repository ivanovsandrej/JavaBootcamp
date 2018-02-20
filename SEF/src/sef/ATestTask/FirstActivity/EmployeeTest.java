package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();

        employee.setFirstName("Harry");
        employee.setSecondName("Potter");
        employee.setJobTitle("wizard");
        employee.setAge(17);
        employee.setCompanyName("Hogwarts");
        employee.setId(123);
        employee.setSalary(100.50);

        assertEquals("Error with first name", "Harry", employee.getFirstName());
        assertEquals("Error with second name", "Potter", employee.getSecondName()));
        assertEquals("Error with job title", "wizard", employee.getJobTitle());
        assertEquals("Error with age", 17, employee.getAge());
        assertEquals("Error with company name", "Hogwarts", employee.getCompanyName());
        assertEquals("Error with id", 123, employee.getId());
        assertEquals("Error with salary", 100.50, employee.getSalary(),2);
    }

}