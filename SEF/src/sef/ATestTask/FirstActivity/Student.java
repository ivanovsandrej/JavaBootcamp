package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private String schoolName;

    public void introduce() {
        System.out.println("I am study in university " + this.schoolName);
    }
    public String getschoolName() {
        return schoolName;
    }

    public void schoolName(String schoolName) {
        this.schoolName = schoolName;
}
