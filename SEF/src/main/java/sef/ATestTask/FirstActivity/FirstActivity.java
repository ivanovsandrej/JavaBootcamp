package sef.ATestTask.FirstActivity;

import java.math.BigDecimal;
import java.util.*;

import static java.lang.System.out;

public class FirstActivity {

    public static void main(String[] args) {
        //TODO 1 Create collection of employee (more than 5)
        Employee employee[] = new Employee[6];

        employee[0] = new Employee();
        employee[0].setFirstName("Aleksejs");
        employee[0].setSalary(200);

        employee[1] = new Employee();
        employee[1].setFirstName("Andrejs");
        employee[1].setSalary(300);

        employee[2] = new Employee();
        employee[2].setFirstName("Anatolijs");
        employee[2].setSalary(400);

        employee[3] = new Employee();
        employee[3].setFirstName("Aleksandrs");
        employee[3].setSalary(500);

        employee[4] = new Employee();
        employee[4].setFirstName("Aldis");
        employee[4].setSalary(600);

        employee[5] = new Employee();
        employee[5].setFirstName("Andris");
        employee[5].setSalary(700);

        //TODO 2 sort and this employees by salary (from min to max)
        Arrays.sort(employee, new salaryComparator());
        for (int i = 0; i < employee.length; i++) {
            out.println("Employee " + (i + 1) + " name :: " + employee[i].getFirstName() + ", Salary :: " + employee[i].getSalary());
        }
    }
    //TODO 3 ->  create instance of the Person ->
    // than make them Student
    // than make them Employee
    public static void createInstanceOfThePerson() {
        Person person = new Person("John", "Dohn", 12);
        person = new Student(person, 10, "Bootcamp");
        person = new Employee(person, "Title", "CompanyName", 10);
    }

    //TODO 4 Create method for total change employee information

    public void infoChange(int employeeId, String jobTitle, String companyName, double salary) {
        Employee employee = new Employee();
    }

    static class salaryComparator implements Comparator {

        public int compare(Object emp1, Object emp2) {

            int emp1Salary = ((Employee) emp1).getSalary();
            int emp2Salary = ((Employee) emp2).getSalary();

            if (emp1Salary > emp2Salary) {
                return 1; }
            else if (emp1Salary < emp2Salary)
                    return -1;
                else
                    return 0;
            }
        }
    }

