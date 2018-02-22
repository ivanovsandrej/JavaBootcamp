package ATestTask.FirstActivity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


import static org.junit.Assert.assertTrue;

public class HelperTest {

    @Test
    public void checkBubleSorting(){

        Helper h = new Helper();
        Random r = new Random();
        ArrayList<Employee> emplArr = new ArrayList<Employee>();

        //TODO 1 Create collection of employee (more than 5)

        Employee curEmployee;
        double rand;
        for (int i = 1; i < 10; i++) {
        // filling the Employees array
            curEmployee = new Employee();
            curEmployee.setEmpId(i);

            curEmployee.setFirstName("Name" + i);

            rand = 1000.00 * r.nextDouble();
            curEmployee.setSalary(rand);

            emplArr.add(curEmployee);
        }

        h.bubbleSort(emplArr); // the sorting

        assertTrue(emplArr.get(7).getSalary() > emplArr.get(8).getSalary());
        assertTrue(emplArr.get(4).getSalary() > emplArr.get(6).getSalary());
    }

    @Test
    public void checkComparatorSorting(){

        Helper h = new Helper();
        Random r = new Random();
        ArrayList<Employee> emplArr = new ArrayList<Employee>();

        //TODO 1 Create collection of employee (more than 5)

        Employee curEmployee;
        double rand;
        for (int i = 1; i < 10; i++) {
            // filling the Employees array
            curEmployee = new Employee();
            curEmployee.setEmpId(i);

            curEmployee.setFirstName("Name" + i);

            rand = 1000.00 * r.nextDouble();
            curEmployee.setSalary(rand);

            emplArr.add(curEmployee);
        }

        emplArr.sort(h.EmpSalary); // the sorting

        assertTrue(emplArr.get(7).getSalary() > emplArr.get(8).getSalary());
        assertTrue(emplArr.get(4).getSalary() > emplArr.get(6).getSalary());
    }
}
