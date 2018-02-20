package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {
    private int grade;
    private String school;

    public Student(){
        this.grade = 0;
        this.school = "null";
    }

    public Student(int grade, String school){
        this.grade = grade;
        this.school = school;
    }

    public void Greeting(){ System.out.println("I am study in university " + getSchool());}

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
