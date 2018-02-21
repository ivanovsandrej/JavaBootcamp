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
        System.out.println("I am study in university"+SchoolName);
    }

    public void setSchoolName(String schoolName) {
        this.SchoolName = schoolName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.SchoolNumber = schoolNumber;
    }

    public int getSchoolNumber() {
        return SchoolNumber;
    }
}
