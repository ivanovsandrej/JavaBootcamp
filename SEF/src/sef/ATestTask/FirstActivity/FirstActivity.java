package sef.ATestTask.FirstActivity;


import java.util.HashMap;
import java.util.Random;

public class FirstActivity {

	public static void main() {

        Random r = new Random();

        HashMap employeeMap,employeeMapSorted;
        employeeMap = new HashMap();

        //TODO 1 Create collection of employee (more than 5)

        Employee curEmployee;
        double rand;
        for (int i = 1; i < 10; i++) {

            curEmployee = new Employee(i, "jobTitle" + i, "companyName" + i, r.nextDouble());
            curEmployee.setEmpId(i);

            curEmployee.setFirstName("Name" + i);
            curEmployee.setSecondName("SecondName" + i);
            curEmployee.setAge(20);

            //rand = Math.round((1000.00 * r.nextDouble()));
            rand = 1000.00 * r.nextDouble();
            curEmployee.setSalary(rand);


            employeeMap.put(i, curEmployee);

        }
        //		System.out.println() result
        System.out.println("--------------- the first print ----------------------------------------");
        printing(employeeMap);

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        employeeMapSorted = sorting(employeeMap);

        //		System.out.println() result
        System.out.println("--------------- the second print ----------------------------------------");
        printing(employeeMapSorted);

        //TODO 3 create instance of the Person ->
        Person person = new Person("Vasilij","Terkin",30);

        // than make them Student
        Student student = new Student(person,1,"RTU");

        // than make them Employee
        Employee employee = new Employee(person,1,"programmer", "Accenture", 200.00);

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
    private static HashMap sorting( HashMap employeeMap) {
        //HashMap employeeMapExit = new HashMap();
        double salaryPred, salaryCurrent;
        for (int i = 1; i < 10; i++) {
            Employee temp = null;
            Employee pred = null;
            Employee curr = null;

            if (i > 1)
            {
                pred = (Employee)employeeMap.get((i - 1));
                curr = (Employee)employeeMap.get(i);

                if ( pred.getSalary() > curr.getSalary()) {
                    temp = pred;
                    employeeMap.put((i - 1), curr);
                    employeeMap.put(i, temp);

                }
            }
        }
        return employeeMap;
    }

    //		System.out.println() result
    private static void printing( HashMap employeeMap) {
        for (int i = 1; i < 10; i++) {
            Employee temp = (Employee) employeeMap.get(i);
            String begin = "Person " + i;
            System.out.println(begin + " first name " + temp.getFirstName());
            System.out.println(begin + " second name " + temp.getSecondName());
            System.out.println(begin + " salary " + " " + String.format("%.2f", temp.getSalary()));

        }
    }


}



	

