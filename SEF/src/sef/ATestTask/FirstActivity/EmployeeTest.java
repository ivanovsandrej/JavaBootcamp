package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest extends TestCase {

    @Test
    public void test() {
        Employee employee = new Employee();
        employee.setFirstName("Test");
        assertEquals("Here should be String Value", "Test", employee.getFirstName());
    }
    @Test
    public void test2(){
        Employee employee = new Employee();
        employee.setSecondName("secondName");
        assertEquals("Here should be String Value", "secondName", employee.getSecondName());
    }
 @Test
    public void test1(){
        Employee employee = new Employee();
        employee.setAge(23);
        assertEquals("Here should be INTEGER Value", 23, employee.getAge());
    }
    @Test
    public void test3(){
        Employee employee = new Employee();
        employee.setEmpId(8);
        assertEquals("I am an error message", 8, employee.getEmpId());
    }
    @Test
    public void test4(){
        Employee employee = new Employee();
        employee.setCompanyName("Test2");
        assertEquals("I am an error message", "Test2", employee.getCompanyName());
    }
    @Test
    public void test5(){
        Employee employee = new Employee();
        employee.setJobTitle("Test3");
        assertEquals("I am an error message", "Test3", employee.getJobTitle());
    }
    @Test
    public void testTest(){
        Employee employee = new Employee();
        employee.setSalary(20000);
        assertEquals("I am an error message", 20000, employee.getSalary());
    }
    @Test
    public void test6(){
        Employee employee = new Employee();
        employee.setSalary(20.765);
        assertEquals("I am an error message", 20.765, employee.getSalary());
    }
}