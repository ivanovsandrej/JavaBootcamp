package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

    public static void main(String[] args) {


        //TODO 1 Create collection of employee (more than 5)

        Employee emp1 = new Employee(001, "John", "Nik", 25, "Test Specialist", "Tele2", 850.50);
        Employee emp2 = new Employee(002, "Aleks", "Brik", 27, "Team Leader", "TIETO", 1250.75);
        Employee emp3 = new Employee(003, "Deniss", "Ivanov", 33, "Java Developer", "Tele2", 850.50);
        Employee emp4 = new Employee(004, "Anna", "Petrova", 22, "Automation Test Specialist", "Accenture", 1100.00);
        Employee emp5 = new Employee(005, "Janis", "Kirsons", 28, "Test Specialist", "Accenture", 900.90);
        Employee emp6 = new Employee(006, "Andrey", "Smirnov", 29, "Accountant", "JavaGuru", 730.50);
        Employee emp7 = new Employee(007, "Konstantin", "Novikov", 26, "Truck Driver", "Logistica", 650.10);

        List employeeList = new ArrayList();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);


        //		System.out.println() result

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result

        //TODO 3 create instance of the Person ->

        Person pers1 = new Person("Anton", "Nikol", 29);
        Person pers2 = new Person("Sveta", "Nikitina", 27);
        Person pers3 = new Person("Sergey", "Terentev", 23);


        pers1 = new Student("TSI");
        pers1 = new Employee();
        // than make them Student
        // than make them Employee
        //		System.out.println() result


        //TODO 4 Create method for total change employee information
        emp5.chanegeWork(118, "Pilot", "Aeroflot", 3750.99);
        // for example some employee change his work

        pers1.setAge(-5);

        pers2.setFirstName("Anna3");
        pers2.setSecondName("Niko5");
    }


}
