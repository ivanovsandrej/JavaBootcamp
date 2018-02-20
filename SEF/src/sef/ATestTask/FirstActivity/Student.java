package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person{

    protected String schoolName;
    public Student (String firstName, String lastName, int age, String school) {
        super(firstName, lastName, age);
        schoolName = school;
    }

    @Override
    public String introduce() {
        String introduction = "I'm studying in the university " + schoolName;
        System.out.println(introduction);
        return introduction;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String school) {
        schoolName = school;
    }
}

