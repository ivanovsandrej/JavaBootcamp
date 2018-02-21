package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest extends TestCase{

    @Test
    public void test(){
        Student s = new Student();
        s.setGrade(3);
        assertEquals("I am an error message", 3, s.getGrade());
    }
    @Test
    public void test2(){
        Student s = new Student();
        s.setSchool("Hogwards");
        assertEquals("I am an error message", "Hogwards", s.getSchool());
    }
}