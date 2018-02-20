package sef.ATestTask.FirstActivity;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5)
        //		System.out.println() result
        Employee e1 = new Employee(1, "Tester", "Accenture", 2000, "Sabine", 18 );
        Employee e2 = new Employee(2, "Worker","BalticSia", 700, "Bob", 25 );
        Employee e3 = new Employee(3, "Director", "Rimi", 2200, "Janis", 30  );
        Employee e4 = new Employee(4, "Doctor", "HealthyPeople", 1500, "Laura", 31 );
        Employee e5 = new Employee(5, "Electrician", "Electro", 1000, "John", 35 );


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        double salaryEmployee1 = e1.getSalary();
        double salaryEmployee2 = e2.getSalary();
        double salaryEmployee3 = e3.getSalary();
        double salaryEmployee4 = e4.getSalary();
        double salaryEmployee5 = e5.getSalary();
        double[] numArray = {salaryEmployee1, salaryEmployee2, salaryEmployee3, salaryEmployee4, salaryEmployee5};
        int n = numArray.length;
        double temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numArray[j - 1] < numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }

        System.out.println("Print salary from top salary to less");
        for (int a = 0; a < numArray.length; a++) {
            System.out.println(numArray[a]);
        }
        //google bubble sorting
        //TODO 3 create instance of the Person ->
        // than make them Student
        // than make them Employee
        //		System.out.println() result
        Person person = new Person("Sabine", "Kuznecova", 18);
        Student student = new Student(person.getFirstName(), "University of Latvia", person.getAge());
        Employee employee = new Employee (1, "Tester","Accenture",2000, student.getName(), student.getAge());
        employee.introduceOfPerson();



        //TODO 4 Create method for total change employee information
        // for example some employee change his work


    }


}
