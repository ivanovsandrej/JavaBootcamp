package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private String schoolName;

    public Student(String schoolName) {

    }

    public String introduceStudent() {
        return "I am study in university " + schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
