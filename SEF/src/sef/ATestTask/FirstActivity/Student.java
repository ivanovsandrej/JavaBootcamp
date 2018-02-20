package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private    int studentID;
    private    String schoolName;
    private    double avgGrade;
    private    String firstName = super.getFirstName();
    private    String secondName = super.getSecondName();
    private    int age = super.getAge();
    public Student(){
        this.studentID = 0;
        schoolName = "Unknown";
        avgGrade = 0;
    }
    public Student(int studentID, String schoolName, double avgGrade){
        this.studentID = studentID;
        this.schoolName = schoolName;
        this.avgGrade = avgGrade;
    }

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }
    public String  introduce(){
        System.out.println("---------------------------------------------------");
        return "My name is " + firstName + " " + secondName +" and I study in " + schoolName;
    }
}
