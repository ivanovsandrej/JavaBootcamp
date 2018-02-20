package sef.ATestTask.FirstActivity;


import java.util.HashMap;
import java.util.Random;

public class FirstActivity {

	public static void main(String[] args) {

        Random r = new Random();

        HashMap employeeMap = new HashMap();

        //TODO 1 Create collection of employee (more than 5)

        Employee curEmployee;
        for (int i = 1; i < 10; i++) {

            curEmployee = new Employee(i, "jobTitle" + i, "companyName" + i, r.nextDouble());
            curEmployee.setempId(i);

            curEmployee.setFirstName("Name" + i);
            curEmployee.setSecondName("SecondName" + i);
            curEmployee.setAge(20);

            curEmployee.setSalary(r.nextDouble());


            employeeMap.put(i, new Employee());

            //		System.out.println() result
            printing(employeeMap);
        }


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        sorting(employeeMap);

        //		System.out.println() result
        printing(employeeMap);

        //TODO 3 create instance of the Person ->
        Person person = new Person();

        // than make them Student
        Student student = (Student) person;

        // than make them Employee
        Employee employee = (Employee) person;

        //		System.out.println() result
        person.introduce();
        student.introduce();
        employee.introduce();

        // Second variant:
        student.printStudent();
        employee.printEmployee();

        //TODO 4 Create method for total change employee information
        // for example some employee change his work
         employee.changeEmployee("Writer", "Redaction", 250.12);
    }

    //sort and this employees by salary (from min to max)
    // TIP - google bubble sort
    private static void sorting( HashMap employeeMap) {
        for (int i = 1; i < 10; i++) {
            Employee temp = null;

            if (((Employee) employeeMap.get(i - 1)).getSalary() > ((Employee) employeeMap.get(i)).getSalary()) {
                temp = (Employee) employeeMap.get(i - 1);
                employeeMap.put(i - 1, (Employee) employeeMap.get(i));
                employeeMap.put(i, temp);
            }
        }
    }

    //		System.out.println() result
    private static void printing( HashMap employeeMap) {
        for (int i = 1; i < 10; i++) {
            Employee temp = (Employee) employeeMap.get(i);

            System.out.println("Person first name " + i + " " + temp.getFirstName());
            System.out.println("Person second name " + i + " " + temp.getSecondName());
            System.out.println("Person salary " + i + " " + temp.getSalary());

        }
    }


}



	

