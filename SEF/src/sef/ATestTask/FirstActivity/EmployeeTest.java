package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }


    //begin 5) Create unit test for ALL classes (example in EmployeeTest)
    @Test
    public void test1() {
        Person person = new Person("Sabine", "Kuznevoca", 18);
        assertEquals ("Sabine", person.getFirstName());
        assertEquals ("Kuznevoca", person.getSecondName());
        assertEquals (18, person.getAge());
    }

    @Test
    public void test2() {
        Student student = new Student("Sabine", "Latvia University", 18);
        assertEquals ("Sabine", student.getName());
        assertEquals ("Latvia University", student.getSchoolName());
        assertEquals (18, student.getAge());
    }

    @Test
    public void test3() {
        Employee employee = new Employee(1, "Tester", "Accenture", 25000, "Sabine", 18);
        assertEquals (1, employee.getempId());
        assertEquals ("Tester", employee.getjobTitle());
        assertEquals ("Accenture", employee.getcompanyName());
        assertEquals (25000, employee.getsalary(), 00.1);
        assertEquals ("Sabine", employee.getname());
        assertEquals (18, employee.getage());
    }
    //end 5) Create unit test for ALL classes (example in EmployeeTest)
}

//
//