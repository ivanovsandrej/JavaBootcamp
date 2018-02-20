package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private int grade;
    private String school;

    //Behavior - parameterized constructor
    public Student(int grade, String school){
        this.grade = grade;
        this.school = school;
    }

    //Behavior - default constructor
    public Student(){
        System.out.println("I'm Student_I constructor");
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

    public void announce(){
        super.announce();  // calls announce() method of Person class
        System.out.println("Inside Student Class");
    }
    public String introduce(){
        return "I am studying in university "+ school+".";
    }
}
