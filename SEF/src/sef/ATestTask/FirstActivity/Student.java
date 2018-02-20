package sef.ATestTask.FirstActivity;

public class Student extends Person {

    private int stId;
    private String schoolName;


    public Student(){
        this.stId = 0;
        this.schoolName = "Unknown";
    }

    public Student(int stId, String schoolName){
        this.stId = stId;
        this.schoolName = schoolName;
    }

    public int stId() {
        return this.stId;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setstId(int stId) {
        this.stId = stId;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introduceStudent() {
        return "I am study in university " + this.getSchoolName();
    }
}