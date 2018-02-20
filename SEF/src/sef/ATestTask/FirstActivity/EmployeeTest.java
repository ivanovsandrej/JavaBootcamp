package sef.ATestTask.FirstActivity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EmployeeTest {
    public static void assertEquals(java.lang.Object expected, java.lang.Object actual) { /* compiled code */ }

    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    @Test
    public void checkAddEmployeeTest(){
        Employee expectedEmpAdd = new Employee(1, "Teacher", "School 111", 900);
        assertEquals (1, expectedEmpAdd.getEmpId());
        assertEquals("Teacher", expectedEmpAdd.getJobTitle());
        assertEquals("School 111", expectedEmpAdd.getCompanyName());
        assertEquals(9000, expectedEmpAdd.getSalary());
    }
    @Test
    public void checkAddPersonTest(){
        Person expectedPersAdd = new Person("Toms", "Liepa", 9);
        assertEquals ("Toms", expectedPersAdd.getFirstName());
        assertEquals("Liepa", expectedPersAdd.getSecondName());
        assertEquals(9, expectedPersAdd.getAge());
    }
    @Test
    public void mySimpleEqualsTest(){

        String expectedJobTitle = "Writer";
        assertEquals(expectedJobTitle, Employee.getJobTitle());
    }
}