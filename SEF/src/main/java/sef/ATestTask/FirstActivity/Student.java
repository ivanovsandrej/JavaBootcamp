package sef.ATestTask.FirstActivity;

public class Student extends Person {
    private int grade;
    private String school;

    public Student() {
        this.grade = 0;
        this.school = "null";
    }

    public Student(int grade, String school) {
        this.grade = grade;
        this.school = school;
    }

    public Student(Person newPerson, int grade, String school) {
        super(newPerson.getFirstName(), newPerson.getSecondName(), newPerson.getAge());
        this.grade = grade;
        this.school = school;
    }

    @Override
    public void welcomeMessage() {
        System.out.println("I am study in university " + getSchool());
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
}
