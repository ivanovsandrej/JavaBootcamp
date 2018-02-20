package sef.ATestTask.FirstActivity;

public class Student extends Person {

    //Attributes
    private int grade;
    private String school;
    private String name;

    //Behavior - default constructor
    public Student() {
        System.out.println("I'm Student I am study in university");
    }

    // getter for int grade
    public int getGrade() {
        return grade;
    }

    // setter for int grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // getter for String school
    public String getSchool() {
        return school;
    }

    // setter for String school
    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "<S>" + name;
    }

    //introducing method
    public String introduce(){
       return "I'm Student I am study in university"+this.school;
    }

}
