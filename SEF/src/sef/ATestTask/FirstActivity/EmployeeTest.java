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
    public void test1() {
        Person person = new Person("Sabine", "Kuznecova", 18);
        assertEquals ("Sabine", person.getFirstName());
        assertEquals ("Kuznecova", person.getSecondName());
        assertEquals (18, person.getAge());
    }
    @Test
    public void test2() {
        Student student = new Student("Sabine", "University of Latvia", 18);
        assertEquals ("Sabine", student.getName());
        assertEquals ("University of Latvia", student.getSchoolName());
        assertEquals (18, student.getAge());
    }
    @Test
    public void test3() {
        Employee employee = new Employee(1, "Tester", "Accenture", 2000, "Sabine", 18);
        assertEquals (1, employee.getEmpId());
        assertEquals ("Tester", employee.getJobTitle());
        assertEquals ("Accenture", employee.getCompanyName());
        assertEquals (2000, employee.getSalary(), 00.1);
        assertEquals ("Sabine", employee.getFirstName());
        assertEquals (18, employee.getage());
}