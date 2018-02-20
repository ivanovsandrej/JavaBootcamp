package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private int grade;
    private String schoolName;

    public Student(){
        this.grade = 0;
        this.schoolName = "Unknown";

    }
    public Student(int grade, String schoolName){
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public String getGrade() {
        if (grade == 1){
        return grade + "st";}
        if (grade == 2){
        return grade + "nd";}
        if (grade == 3){
        return grade + "rd";}
        else{
        return grade + "th";}
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introduce() {
        return super.introduce() + "\n I study in " + this.schoolName + "university" + " in " + this.grade;
    }
}
