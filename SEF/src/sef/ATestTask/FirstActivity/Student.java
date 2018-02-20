package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends  Person {

    private  String schoolName;

    public Student() {
        this.schoolName = "Unknown School";
    }

    public Student( String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() { return schoolName; }

    public void setSchoolName ( String schoolName) { this.schoolName = schoolName; }

    public void introduce(){
        // I am study in university <schoolName>
        System.out.println("I am study in University " +  this.schoolName);
    }

}
