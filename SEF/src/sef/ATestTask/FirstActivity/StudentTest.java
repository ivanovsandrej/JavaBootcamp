package sef.ATestTask.FirstActivity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test

    public void checkStudentGradeCreatedProperly(){
        Student student = new Student();
        student.setGrade(2);
        assertEquals("I am an error message", 2, student.getGrade());
    }

    @Test
    public void checkStudentSchoolCreatedProperly() {
        Student student = new Student();
        student.setSchool("School");
        assertEquals("Error", "School", student.getSchool());
    }
}
