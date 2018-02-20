package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //Example
    @Test
    public void checkEmployeeCreateProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an erroe message", "Test1", employee.getFirstName());
    }

    @Test
    public void checkEmployeeCreatedDefault() {
        Employee employee = new Employee();
        double salary = 0.00;
        assertEquals("Unknown", employee.getFirstName());
        assertEquals("Unknown", employee.getSecondName());
        assertEquals(0, employee.getAge());
        assertEquals("Unknown", employee.getJobTitle());
        assertEquals("Unknown", employee.getCompanyName());
        assertEquals(salary, employee.getSalary(),2);
    }

    @Test
    public void checkEmployeeCreatedParameterized(){
        Employee employee = new Employee("Vasja","Pupkin",16,1,"worker","factory",80.00);
        assertEquals("Vasja", employee.getFirstName());
        assertEquals("Pupkin", employee.getSecondName());
        assertEquals(16, employee.getAge());
        assertEquals(1,employee.getEmpId());
        assertEquals("worker",employee.getJobTitle());
        assertEquals("factory",employee.getCompanyName());
    }
    @Test
    public void checkEmployeeCreatedParameterized1(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);
        assertEquals("Vasja", employee.getFirstName());
        assertEquals("Pupkin", employee.getSecondName());
        assertEquals(16, employee.getAge());
        assertEquals(1,employee.getEmpId());
        assertEquals("worker",employee.getJobTitle());
        assertEquals("factory",employee.getCompanyName());
    }
    @Test
    public void checkEmployeeGetEmpId(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals(1,  employee.getEmpId());
    }
    @Test
    public void checkEmployeeEmpId() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setEmpId(2);

        assertEquals(2,  employee.getEmpId());
    }

    @Test
    public void checkEmployeeGetSalary(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals(80.00,  employee.getSalary(),2);
    }
    @Test
    public void checkEmployeeSalary() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setSalary(82.9);

        assertEquals(82.9,  employee.getSalary(),2);
    }
    @Test
    public void checkEmployeeGetJobTitle(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals("worker",  employee.getJobTitle());
    }
    @Test
    public void checkEmployeeJobTitle() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setJobTitle("the best worker");

        assertEquals("the best worker",  employee.getJobTitle());
    }
    @Test
    public void checkEmployeeGetCompanyName(){
        Employee employee = new Employee(new Person("Vasja","Pupkin",16),1,"worker","factory",80.00);

        assertEquals("factory",  employee.getJobTitle());
    }
    @Test
    public void checkEmployeeCompanyName() {
        Employee employee = new Employee(new Person("Vasja", "Pupkin", 16), 1, "worker", "factory", 80.00);
        employee.setJobTitle("new factory");

        assertEquals("new factory",  employee.getCompanyName());
    }
    @Test
    public void checkEmployeeIntroduce(){
        Employee employee = new Employee();
       String introduceLine = employee.introduce().trim();

        assertEquals("My name is Unknown Unknown and i am 0 years old I am work as Unknown in Unknown",introduceLine);
    }


}