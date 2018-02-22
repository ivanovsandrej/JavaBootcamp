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
        assertEquals("programmer", employee.getjobTitle());}

    public void TestCompanyName() {
        Employee employee = new Employee();
        employee.setcompanyName("Accenture");
        assertEquals("Accenture",employee.getcompanyName());
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
    Employee employee = new Employee();
    employee.setSalary(12000);
    assertEquals(12000,employee.getSalary(), 2);
}


    public void checkPersonCreatedProperly() {
        Person per = new Person("Jade", "Barker", 23);
        assertEquals("Jade", per.getFirstName());
        assertEquals("Barker", per.getSecondName());
        assertEquals(23, per.getAge());
    }
    public void TestFirstNamePerson(){
        Person person = new Person();
        person.setFirstName("Jade");
        assertEquals("Jade", person.getFirstName());
    }
    public void TestSecondNamePerson(){
        Person person=new Person();
        person.setSecondName("Barker");
        assertEquals("Barker", person.getSecondName());
    }
    public void TestPersonage() {
        Person person=new Person();
        person.setAge(24);
        assertEquals(24,person.getAge());
    }
    public void TestSchoolName(){
        Student student=new Student();
        student.setSchoolName("Secondary");
        assertEquals("Secondary",student.getSchoolName());
    }
    public void TestSchoolNumber() {
        Student student=new Student();
        student.setSchoolNumber(34);
        assertEquals(34,student.getSchoolNumber());
    }
    public void testCreateStudent() {
        Student student=new Student("Secondary",54);
        assertEquals("Secondary", student.getSchoolName());
        assertEquals(54,student.getSchoolNumber());
    }
}
