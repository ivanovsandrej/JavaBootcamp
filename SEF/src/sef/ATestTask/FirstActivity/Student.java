package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private String schoolName;

    //Constructors

    public Student(){

    }
    public Student (String schoolName){
        this.schoolName = schoolName;
    }

    //Getter and setter

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public void introducePerson(String firstName, String secondName, int age ) {
        System.out.println("My name is " + firstName + "" + secondName + "and I am " + age + " year old." +
                " I study in " + schoolName + " university");
    }
}
