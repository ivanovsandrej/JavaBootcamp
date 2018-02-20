package sef.ATestTask.FirstActivity;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

    @Test
    public void checkStudentCreatedProperly() {

        Student s1 = new Student("RTU");

        Assert.assertEquals("School name error", "RTU", s1.getSchoolName());
    }
}
