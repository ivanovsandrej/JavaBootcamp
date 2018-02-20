package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private int grade;
    private String school;

    public Student (){

    }

    public Student(int grade, String school) {
        this.grade = grade;
        this.school= school;
    }

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


    public String introduce(){
        return ("I am study in university " + school); }

    public static void main(String[] args) {
        Student introduce = new Student();
        System.out.println(introduce.introduce());
    }

}
