package sef.ATestTask.FirstActivity;

import org.junit.Test ;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PersonTest {
    @Test
    public void checkPersonCreatedProperly() {
        Person testing = new Person();
        testing.setAge(55);
        assertEquals("Age is different", 55, testing.getAge());
    }
    @Test
    public void checkNoDigitsName() {
        Person person = new Person();
        try {
            person.setFirstName("OkayName");
        } catch (Exception execption) {
            // shoudln't happen!
            fail("Exception upon a good first name");
        }
        try {
            person.setFirstName("WrongName123");
        } catch (Exception exception) {
            // all fine, an exception is expected to be thrown
        }

    }
}
