package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)

		Employee emp1 = new Employee("Anna", "H", 21, 1, "developer", "accenture", 800.50);
		Employee emp2 = new Employee("Alina", "N", 28,2, "tester", "accenture", 300.40);
		Employee emp3 = new Employee("Dima3", "S", 26,3, "devOps", "accenture", 900.80);
		Employee emp4 = new Employee("Nikita", "N", 25,4, "developer", "accenture", 800.50);
		Employee emp5 = new Employee("Irina", "T", 45,5, "project manager", "accenture", 500.00);
        Employee emp6 = new Employee("Inga", "S", 22,6, "tester", "accenture", 400.90);

		List<Employee> listOfEmployess = new ArrayList<Employee>();
		listOfEmployess.add(emp1);
        listOfEmployess.add(emp2);
        listOfEmployess.add(emp3);
        listOfEmployess.add(emp4);
        listOfEmployess.add(emp5);
        listOfEmployess.add(emp6);

		//System.out.println() result
        for (Employee obj : listOfEmployess) {
            obj.introduceEmployee();
        }

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
        for(int i= listOfEmployess.size()-1;i>=0;i--)
            for(int j=0;j<i;j++)
                if(listOfEmployess.get(j).getSalary()>listOfEmployess.get(j+1).getSalary()) {
                    Employee temp = listOfEmployess.get(j);
                    listOfEmployess.set(j, listOfEmployess.get(j+1));
                    listOfEmployess.set(j+1, temp);
                }
		//		System.out.println() result
        System.out.println("After sorting:");
        for (Employee obj : listOfEmployess) {
            obj.introduceEmployee();
        }

		//TODO 3 create instance of the Person ->
        Person somebody = new Person("Luke", "Skywalker", 18);
        System.out.println("\nNEW PERSON:");
        somebody.introducePerson();
        //than make them Student
        somebody = new Student( somebody,"Jedi temple");
        System.out.println("\nNEW STUDENT:");
        ((Student) somebody).introduceStudent();
        // than make them Employee
        somebody = new Employee(somebody, 8, "jedi", "galaxy", 8000);
        System.out.println("\nNEW EMPLOYEE:");
        ((Employee) somebody).introduceEmployee();

		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work
        emp4.changeWork(13,"data scientist",1000,"norway inc.");
        emp4.introduceEmployee();
    }

	
	
}
