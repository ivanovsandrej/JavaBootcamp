package sef.ATestTask.FirstActivity;


public class Person {
    String firstName;
    String secondName;
    int age;

//TODO 1 Implement Person Attributes


    //Behavior - default constructor
    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.age = 0;
    }

    //Behavior - parameterized constructor
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    // getter for String firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //Tried to catch error
        try {
            Integer.valueOf(firstName);
        } catch (NumberFormatException e) {
            System.out.println("There's numbers");
        }
        //Made manual error throwing
        if (lookForDigits(firstName)) {
            this.firstName = firstName;
        } else {
            System.out.println("Numbers in name");
        }
    }

    public void Greeting() {
        System.out.println("My name is " + getFirstName() + " and i am " + getAge() + " years old");
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if (lookForDigits(firstName)) {
            this.secondName = secondName;
        } else {
            System.out.println("Numbers in name");
        }

    }

    public static boolean lookForDigits(
            final CharSequence input) {
        boolean check = false;
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c > 47 && c < 58) {
                check = false;
            } else {
                check = true;
            }
        }
        if (check == false) {
            return false;
        } else {
            return true;
        }
    }
}

