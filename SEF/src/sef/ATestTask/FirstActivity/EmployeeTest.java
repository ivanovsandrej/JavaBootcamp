package sef.ATestTask.FirstActivity;

import org.junit.Test ;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTest {

    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        try {
            employee.setFirstName("Test");
        } catch (Exception ex) {
            fail("Exception while changing first name");
        }
        assertEquals("Name wasn't set properly", "Test", employee.getFirstName());
    }

}