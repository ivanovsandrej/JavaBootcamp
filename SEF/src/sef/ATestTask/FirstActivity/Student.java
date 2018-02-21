package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {
    private int grade;
    private String school;

    public Student (){System.out.println("I'm a Student_I'm so Young");}

    //TODO implement setters and getters

    //Grade setters
    public void setGrade(int grade){this.grade=grade;}
    //Grade getters
    public int getGrade(){return grade;}

    //School setters
    public void setSchool(String school){this.school=school;}
    //School getters
    public String getSchool(){return school;}

}
