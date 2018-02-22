package ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Helper {

    //		System.out.println() result
    public static void printing( HashMap employeeMap ) {
        Employee temp;
        for (int i = 1; i < 10; i++) {
            temp = (Employee) employeeMap.get(i);
            String begin = "Person " + i;
            System.out.println(temp.getFirstName() + " " + temp.getSecondName() + " " +  String.format("%.2f", temp.getSalary()));
        }
    }
    public static void printing( ArrayList<Employee> employeeArr ) {
        Employee temp;
        for (int i = 0; i < 9; i++) {
            temp = employeeArr.get(i);
            String begin = "Person " + i;
            System.out.println(temp.getFirstName() + " " + temp.getSecondName() + " " +  String.format("%.2f", temp.getSalary()));
        }
    }
    //sort and this employees by salary (from min to max)
    // TIP - google bubble sort
    public void bubbleSort(ArrayList<Employee> arr) {

        boolean isSwapped = true;
        Employee temp;
        for (int i = arr.size() - 1; isSwapped; i--) {

            isSwapped = false;

            for (int j = 0; j < i; j++) {

                if (arr.get(j).getSalary() < arr.get(j + 1).getSalary()) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set((j + 1), temp);
                    isSwapped = true;
                }
            }
        }
    }

    /*Comparator for sorting the list by Salary*/
    public static Comparator EmpSalary = new Comparator<Employee>() {

        public int compare(Employee e1, Employee e2) {
            double salary1 = e1.getSalary();
            double salary2 = e2.getSalary();
            double diff = salary2 - salary1;
            if ((diff > 0) & (diff < 1)) return 1;
            if ((diff < 0) & (diff > -1))return -1;
            return (int)diff;
        }
    };
}
