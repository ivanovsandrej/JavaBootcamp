package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private String schoolName;

    //constructors
    public Student() {
        this.schoolName = " ";
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }


    //getters and setters

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    //introducing method
    public void introduce() {
        System.out.println("I am studying in university " + this.schoolName);
    }
}
