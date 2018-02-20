package sef.ATestTask.FirstActivity;

import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class FirstActivity {

    public static void main(String[] args) throws IOException {

        //TODO 1 Create collection of employee (more than 5)
        Employee employee[] = new Employee[5];

        employee[0] = new Employee();
        employee[0].setFirstName("1");
        employee[0].setSalary(1000);
        employee[0].setCompanyName("Accenture");
        employee[0].setJobTitle("programmer");
        employee[0].setEmpId(1);

        employee[1] = new Employee();
        employee[1].setFirstName("2");
        employee[1].setSalary(3000);
        employee[1].setCompanyName("Accenture");
        employee[1].setJobTitle("programmer");
        employee[1].setEmpId(2);

        employee[2] = new Employee();
        employee[2].setFirstName("3");
        employee[2].setSalary(2000);
        employee[2].setCompanyName("Accenture");
        employee[2].setJobTitle("programmer");
        employee[2].setEmpId(3);

        employee[3] = new Employee();
        employee[3].setFirstName("4");
        employee[3].setSalary(6000);
        employee[3].setCompanyName("Accenture");
        employee[3].setJobTitle("programmer");
        employee[3].setEmpId(4);

        employee[4] = new Employee();
        employee[4].setFirstName("5");
        employee[4].setSalary(1100);
        employee[4].setCompanyName("Accenture");
        employee[4].setJobTitle("programmer");
        employee[4].setEmpId(4);


        FileWriter writer = new FileWriter("test.txt");
        for(Employee employee1 : employee) {
            writer.write(employee1.getCompanyName());
            writer.write(employee1.getJobTitle());
            writer.write((int) employee1.getEmpId());
            writer.write(employee1.getCompanyName());
            writer.write((int) employee1.getSalary());
        }
        writer.close();


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        Arrays.sort(employee, new salaryComparator());

        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name : " + employee[i].getFirstName() + ", Salary : " + employee[i].getSalary());
        }
    }


    //TODO 3 create instance of the Person ->


    // than make them Student
    // than make them Employee
    //		System.out.println() result

    //TODO 4 Create method for total change employee information

    public void infoChange(int empId, String jobTitle, String companyName, double salary) {

    }
    // for example some employee change his work


    static class salaryComparator implements Comparator {

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

}

