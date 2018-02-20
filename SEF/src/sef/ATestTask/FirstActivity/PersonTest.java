package sef.ATestTask.FirstActivity;

import org.junit.Test;

import org.junit.Assert;

public class PersonTest {

    @Test

    public void checkPersonCreatedProperly() {

        Person testPerson1 = new Person();
        testPerson1.setFirstName("John");
        testPerson1.setSecondName("Doe");
        testPerson1.setAge(33);

        Assert.assertEquals("Name error", "John", testPerson1.getFirstName());
        Assert.assertEquals("Surname error", "Doe", testPerson1.getSecondName());
        Assert.assertEquals("Age error", 33, testPerson1.getAge());
    }

    @Test

    public void checkParametrPersonCreation() {

        Person testPerson2 = new Person("John", "Doe", 47);

        Assert.assertEquals("Name error", "John", testPerson2.getFirstName());
        Assert.assertEquals("Surname error", "Doe", testPerson2.getSecondName());
        Assert.assertEquals("Age error", 47, testPerson2.getAge());

    }
}
