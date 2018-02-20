package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5)
        Employee emp1 = new Employee(1, "Janitor", "SIA Cleaning", 420);
        Employee emp2 = new Employee(2, "Consultant", "TechnoLand", 600);
        Employee emp3 = new Employee(3, "Plumber", "RNP", 500);
        Employee emp4 = new Employee(4, "Electrician", "Elset", 700);
        Employee emp5 = new Employee(5, "Manager", "ABC Logistics", 850);
        Employee emp6 = new Employee(6, "Developer", "Accenture", 1200);

        //Creating employee collection
        List<Employee> EmpList = new ArrayList();
        EmpList.add(emp1);
        EmpList.add(emp2);
        EmpList.add(emp3);
        EmpList.add(emp4);
        EmpList.add(emp5);
        EmpList.add(emp6);

        //Arranging employees by salary starting from smallest
        for(int i=1; i < EmpList.size(); i++) {
            Employee temp = new Employee();
            double x = EmpList.get(i-1).getSalary();
            double y = EmpList.get(i).getSalary();
            if(x > y) {
                temp = EmpList.get(i-1);
                EmpList.add( i-1, EmpList.get(i));
                EmpList.add(i, temp);
            }
        }

        //Printing out sorted employee information
        for(int i=1; i < EmpList.size(); i++)
        {
            System.out.println(EmpList.get(i-1).getJobTitle() + " from " + EmpList.get(i-1).getCompanyName()
                                + " gets " + EmpList.get(i-1).getSalary() + " for his job.");
        }



        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort


        //		System.out.println() result

        //TODO 3 create instance of the Person ->

        Person p1 = new Person("Sasha", "Torpedin", 20);

        // than make them Student
        // than make them Employee
        //		System.out.println() result

        //TODO 4 Create method for total change employee information
        // for example some employee change his work


    }
}


