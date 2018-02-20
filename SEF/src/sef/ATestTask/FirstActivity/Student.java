package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {
    public Student() {
        this.schoolName = "Unknown";
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(Person person,String schoolName) {
        super(person.getFirstName(), person.getSecondName(), person.getAge());
        this.schoolName = schoolName;
    }

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName() {
        this.schoolName=schoolName;
    }

    public void introduceStudent() {
        System.out.println("My name is "+ getFirstName() + " and I am studying at"+ getSchoolName());
    }
}
