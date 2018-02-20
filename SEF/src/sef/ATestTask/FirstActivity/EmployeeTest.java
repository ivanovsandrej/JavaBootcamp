package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void checkPersonCreatedProperly(){
        Person person = new Person();
        assertEquals("I am an error message", "Unknown", person.getFirstName());
    }
    @Test
    public void checkParametrizedPersonCreatedProperly(){
        Person person = new Person("Anna", "Doe", 15);
        assertEquals("This is an error message", "Anna", person.getFirstName());
    }
    @Test
    public void checkNameSetProperly(){
        Person person = new Person("Anna", "Doe", 15);
        person.setFirstName("Alina");
        person.setSecondName("Muller");
        assertEquals("This is an error message","Alina", person.getFirstName());
        assertEquals("This is an error message", "Muller", person.getSecondName());
    }
    @Test
    public void checkSetAge(){
        Person person = new Person("Anna", "Doe", 15);
        assertEquals("This is an error message", 15, person.getAge());
        person.setAge(21);
        assertEquals("This is an error message", 21, person.getAge());
    }
    @Test
    public void checkPersonIntroduce(){
        Person person = new Person();
        assertEquals("This is an error message", "My name is Unknown Unknown and i am 0 years old", person.introduce());
    }
    @Test
    public void checkStudentCreatedProperly(){
        Student student = new Student();
        assertEquals("This is an error message", 0,student.getStudentID());
        assertEquals("This is an error message","Unknown", student.getSchoolName());
        assertEquals("This is an error message", 0, student.getAvgGrade(), 0);

    }
    @Test
    public void checkParametrizedStudentCreatedProperly(){
        Student student = new Student(1,"LU", 6.5);
        assertEquals("This is an error message", 1,student.getStudentID());
        assertEquals("This is an error message","LU", student.getSchoolName());
        assertEquals("This is an error message", 6.5, student.getAvgGrade(), 0);
    }
    @Test
    public void checkStudentId(){
        Student student = new Student(1,"LU", 6.5);
        assertEquals("This is an error message", 1,student.getStudentID());
        student.setStudentID(99);
        assertEquals("This is an error message", 99,student.getStudentID());

    }
    @Test
    public void checkSchoolName(){
        Student student = new Student(1,"LU", 6.5);
        assertEquals("This is an error message","LU", student.getSchoolName());
        student.setSchoolName("RTU");
        assertEquals("This is an error message","RTU", student.getSchoolName());
    }
    @Test
    public void checkAvgGrade(){
        Student student = new Student(1,"LU", 6.5);
        assertEquals("This is an error message", 6.5, student.getAvgGrade(), 0);
        student.setAvgGrade((float) 4.5);
        assertEquals("This is an error message", 4.5, student.getAvgGrade(), 0);
    }
    @Test
    public void checkStudentIntroduce(){
        Student student = new Student(1,"LU", 6.5);
        assertEquals("This is an error message","My name is Unknown Unknown and I study in LU", student.introduce());
    }
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    @Test
    public void checkParametrizedEmployeeCreatedProperly(){
        Employee employee = new Employee(1,"Dev","Accenture", 12000);
        assertEquals("I am an error message", 1, employee.getEmpId());
        assertEquals("I am an error message", "Dev", employee.getJobTitle());
        assertEquals("I am an error message", "Accenture", employee.getCompanyName());
        assertEquals("I am an error message", 12000, employee.getSalary(), 0);

    }
    @Test
    public void checkEmployeeID(){
        Employee employee = new Employee(1,"Dev","Accenture", 12000);
        assertEquals("I am an error message", 1, employee.getEmpId());
        employee.setEmpId(99);
        assertEquals("I am an error message", 99, employee.getEmpId());
    }
    @Test
    public void checkJobTitle(){
        Employee employee = new Employee(1,"Dev","Accenture", 12000);
        assertEquals("I am an error message", "Dev", employee.getJobTitle());
        employee.setJobTitle("Tester");
        assertEquals("I am an error message", "Tester", employee.getJobTitle());
    }
    @Test
    public void checkCompanyName(){
        Employee employee = new Employee(1,"Dev","Accenture", 12000);
        assertEquals("I am an error message", "Accenture", employee.getCompanyName());
        employee.setCompanyName("Tele2");
        assertEquals("I am an error message", "Tele2", employee.getCompanyName());
    }
    @Test
    public void checkSalary(){
        Employee employee = new Employee(1,"Dev","Accenture", 12000);
        assertEquals("I am an error message", 12000, employee.getSalary(), 0);
        employee.setSalary(13000);
        assertEquals("I am an error message", 13000, employee.getSalary(), 0);
    }



}