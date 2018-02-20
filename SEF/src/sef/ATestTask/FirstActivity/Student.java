package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {
    private String SchoolName;
    private int SchoolNumber;

    public Student() {
        this.SchoolName = "Unknown";
        this.SchoolNumber = 0;

    }

    public Student(String SchoolName, int SchoolNumber) {
        this.SchoolName = SchoolName;
        this.SchoolNumber = SchoolNumber;
    }
}

