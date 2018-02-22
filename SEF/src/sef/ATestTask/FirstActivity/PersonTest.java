package sef.ATestTask.FirstActivity;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PersonTest {
    @Test

    public void checkPersonCreatedProperly(){
        Person person = new Person();
        person.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", person.getFirstName());
    }

    @Test
    public void checkpersonSNCreatedProperly(){
        Person person = new Person();
        person.setSecondName("Test2");
        assertEquals("Error", "Test2", person.getSecondName());
    }

    @Test
    public void checkPersonAge(){
        Person person = new Person();
        person.setAge(10);

        assertEquals("Error", 10, person.getAge());
    }

}
