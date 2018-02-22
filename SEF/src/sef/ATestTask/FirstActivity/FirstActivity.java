package ATestTask.FirstActivity;


import java.util.*;
import java.util.function.ToDoubleFunction;
import java.util.function.ToLongFunction;

import static ATestTask.FirstActivity.Helper.printing;


public class FirstActivity {

    public static void main() {

        Random r = new Random();

        HashMap employeeMap;
        // I uses HashMap here to show that I can use it only.
        // ArrayList<Employee> is enough really.

        employeeMap = new HashMap();
        ArrayList<Employee> emplArr1, emplArr;
        emplArr = new ArrayList<Employee>();
        emplArr1 = new ArrayList<Employee>();

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
            emplArr.add(curEmployee);
            emplArr1.add(curEmployee);

        }
        //		System.out.println() result
        System.out.println("--------------- the original order ----------------------------------------");
        printing(employeeMap);

        //TODO 2 sort and this employees by salary (top salary to less)
        // TIP - google bubble sort
        Helper h = new Helper();

        emplArr.sort(h.EmpSalary);

        h.bubbleSort(emplArr1);

        System.out.println("--------------- ordered by salary with comparator( top salary to less ) ----");
        printing(emplArr);

        System.out.println("--------------- ordered by salary bubble sorting ( top salary to less ) ----");
        printing(emplArr1);

        System.out.println("--------------- person is changing his type ---------------------------------");
        //TODO 3 create instance of the Person ->
        Person person = new Person("Vasilij", "Terkin", 30);

        // Next 2 constructors were checked in the corresponding classes
        // than make them Student
        Student student = new Student(person, 1, "RTU");

        // than make them Employee
        Employee employee = new Employee(person, 1, "programmer", "Accenture", 200.00);

        //If the task means changeing from Student to Employee, then:
        Employee employee1 = new Employee((Person) student, 1, "programmer", "Accenture", 200.00);

        //		System.out.println() result
        person.introduce();
        student.introduce();
        employee.introduce();

        // Second variant:
        //student.printStudent();
        //employee.printEmployee();

        //TODO 4 Create method for total change employee information
        // for example some employee change his work
        employee.changeEmployee("Writer", "Redaction", 250.12);
    }

/*    *//*Comparator for sorting the list by Salary*//*
    public static Comparator EmpSalary = new Comparator<Employee>() {

        public int compare(Employee e1, Employee e2) {
            double salary1 = e1.getSalary();
            double salary2 = e2.getSalary();
            double diff = salary2 - salary1;
            if ((diff > 0) & (diff < 1)) return 1;
            if ((diff < 0) & (diff > -1))return -1;
            return (int)diff;
        }
    };*/
}


	

