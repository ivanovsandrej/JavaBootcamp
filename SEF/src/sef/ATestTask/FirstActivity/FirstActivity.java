package sef.ATestTask.FirstActivity;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5)
        //begin 4.1 create few employees
        Employee e1 = new Employee();
        Employee e2 = new Employee(2, "Worker", "BalticSIA", 700, "Bob", 25);
        Employee e3 = new Employee(3, "Derector", "Rimi");
        Employee e4 = new Employee(4, "Tester");
        Employee e5 = new Employee(5, "Electric", "BaltEnergo", 1200, "Janis", 27);
        //end 4.1 create few employees

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //begin 4.2 try to print them from top salary to less
        double sallaryEmployee1 = e1.getsalary();
        double sallaryEmployee2 = e2.getsalary();
        double sallaryEmployee3 = e3.getsalary();
        double sallaryEmployee4 = e4.getsalary();
        double sallaryEmployee5 = e5.getsalary();

        double[] numArray = {sallaryEmployee1, sallaryEmployee2, sallaryEmployee3, sallaryEmployee4, sallaryEmployee5};

        int n = numArray.length;
        double temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }

        System.out.println("Print sallary from top salary to less");
        for (int a = 0; a < numArray.length; a++) {
            System.out.println(numArray[a]);
        }
        //end  4.2 try to print them from top salary to less

        //TODO 3 create instance of the Person ->
        //begin  4.3 create person who became a student, and after that became a employee (must be one instance)
        Person person = new Person("Sabine", "Kuznevoca", 18);
        Student student = new Student(person.getFirstName(), "Latvia University", person.getAge());
        Employee employee = new Employee(1, "Tester", "Accenture", 25000, student.getName(), student.getAge());
        employee.introduceOfPerson();
        //end  4.3 create person who became a student, and after that became a employee (must be one instance)


        //TODO 4 Create method for total change employee information
        // for example some employee change his work


    }


}
