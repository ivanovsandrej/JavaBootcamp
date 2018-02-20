package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student {
    private String name;
    private String schoolName;
    private int age;

    public Student() {
        this.name = "Unknown";
        this.schoolName = "Unknown";
        this.age = 0;
    }

    public Student(String firstName, String schoolName, int age) {
        this.name = firstName;
        this.schoolName = schoolName;
        this.age = age;
    }

    public void introduceOfPerson() {
        System.out.println("I am study in university " + schoolName);
    }

    public void setFirstName() {
        this.name = name;
    }

    public String getFirstName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }
}
