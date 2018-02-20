package sef.ATestTask.FirstActivity;

import java.util.*;


public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5)

        Employee employee[] = new Employee[6];
        employee[0] = new Employee();
        employee[0].setAge(40);
        employee[0].setFirstName("Joe");
        employee[0].setSalary(500);
        employee[0].setjobTitle("Programmer");
        employee[0].setCompanyName("Accenture");

        employee[1] = new Employee();
        employee[1].setAge(20);
        employee[1].setFirstName("Peter");
        employee[1].setSalary(700);
        employee[1].setjobTitle("Programmer");
        employee[1].setCompanyName("Accenture");

        employee[2] = new Employee();
        employee[2].setAge(45);
        employee[2].setFirstName("Mark");
        employee[2].setSalary(900);
        employee[2].setjobTitle("Programmer");
        employee[2].setCompanyName("Accenture");

        employee[3] = new Employee();
        employee[3].setAge(47);
        employee[3].setFirstName("Cindy");
        employee[3].setSalary(300);
        employee[3].setjobTitle("Programmer");
        employee[3].setCompanyName("Accenture");

        employee[4] = new Employee();
        employee[4].setAge(67);
        employee[4].setFirstName("Robert");
        employee[4].setSalary(450);
        employee[4].setjobTitle("Programmer");
        employee[4].setCompanyName("Accenture");

        employee[5] = new Employee();
        employee[5].setAge(19);
        employee[5].setFirstName("Max");
        employee[5].setSalary(100);
        employee[5].setjobTitle("Programmer");
        employee[5].setCompanyName("Accenture");

        System.out.println("Order of employee before sorting is");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getFirstName() + ", Age :: " + employee[i].getAge() + " Salary :: " + employee[i].getSalary() + " Position :: " + employee[i].getjobTitle() + " Company :: " + employee[i].getcompanyName());
        }


        //		System.out.println() result


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result


        Arrays.sort(employee, new SalaryComparator());
        System.out.println("\n\nOrder of employee after sorting by employee Salary is");

        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getFirstName() + ", Age :: " + employee[i].getAge() + " Salary :: " + employee[i].getSalary()+ " Position :: " + employee[i].getjobTitle() + " Company :: " + employee[i].getcompanyName());
        }



        //TODO 3 create instance of the Person ->

       /* Person p1 = new Person();
        p1.setFirstName("Robert");
        p1 = new Student();
        p1 = new Employee();
        System.out.println("My name is Robert " + p1.getFirstName());
*/

       //Sorry about this one. I tried figuring something out, but in the end nothing goods came out of it :(
      /* Person p1 = new Person();
       p1.setFirstName("Robert");
       System.out.println("My name is Robert " + p1.getFirstName());

    }*/

    static class SalaryComparator implements Comparator {

        public int compare(Object emp1, Object emp2) {

            double emp1Salary = ((Employee) emp1).getSalary();
            double emp2Salary = ((Employee) emp2).getSalary();

            if (emp1Salary < emp2Salary)
                return 1;
            else if (emp1Salary > emp2Salary)
                return -1;
            else
                return 0;

        }



    }




    // than make them Student
    // than make them Employee
    //		System.out.println() result

    //TODO 4 Create method for total change employee information
    // for example some employee change his work

}
