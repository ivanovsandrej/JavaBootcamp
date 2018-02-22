package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student{

    //begin 3.1 Create file students from scratch
        private  String name;
        private  String schoolName;
        private  int age;

        public Student(){
            this.name="Unknown";
            this.schoolName = "Unknown";
            this.age = 0;
        }

        //Behavior - parameterized constructor
        public Student(String firstName, String schoolName, int age){
            this.name = firstName;
            this.schoolName = schoolName;
            this.age = age;
        }

        //begin 3.2 Add method for introduce of person -> "I am study in university <schoolName>"
        public void introduceOfPerson (){
            System.out.println("I am study in university" + schoolName);
        }

        //end 3.2 Add method for introduce of person -> "I am study in university <schoolName>"
        public String getName() {
            return name;
        }
        public void setFirstName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getSchoolName() {
            return schoolName;
        }
        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }
       //end 3.1 Create file students from scratch
}
