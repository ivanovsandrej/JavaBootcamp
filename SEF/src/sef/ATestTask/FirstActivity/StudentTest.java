package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StudentTest {
    @Test
    public void checkStudentCreatedOK() {
        Student student = new Student("Ivan", "Pupkins", 25, "RTU");
        try {
            student.setFirstName("Sergey");
        } catch (Exception exc) {
            fail("failed changing the name");
        }
        assertEquals("Wrong Name", "Sergey", student.getFirstName());
        assertEquals("Wrong last name", "Pupkins", student.getSecondName());
        assertEquals("Wrong age", 25, student.age);
        assertEquals("Wrong school", "RTU", student.getSchoolName());

    }
}
