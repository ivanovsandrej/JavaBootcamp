package sef.ATestTask.FirstActivity;

import java.util.List;
import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Employee emp1 = new Employee();
		emp1.setFirstName("Anna");
		emp1.setSecondName("Boleyn");
		emp1.setAge(23);
		emp1.setJobTitle("concubine");
		emp1.setEmpId(1);
		emp1.setCompanyName("Royal Court");
		emp1.setSalary(4000);

		Employee emp2 = new Employee();
		emp2.setFirstName("Mike");
		emp2.setSecondName("Pierce");
		emp2.setAge(26);
		emp2.setJobTitle("assessor");
		emp2.setEmpId(2);
		emp2.setCompanyName("Telegraph");
		emp2.setSalary(400);

		Employee emp3 = new Employee();
		emp3.setFirstName("James");
		emp3.setSecondName("Allen");
		emp3.setAge(54);
		emp3.setJobTitle("professor");
		emp3.setEmpId(3);
		emp3.setCompanyName("LU");
		emp3.setSalary(8500);

		Employee emp4 = new Employee();
		emp4.setFirstName("Jane");
		emp4.setSecondName("Pratniece");
		emp4.setAge(21);
		emp4.setJobTitle("waiter");
		emp4.setEmpId(4);
		emp4.setCompanyName("restaurant Presto");
		emp4.setSalary(1500);

		Employee emp5 = new Employee();
		emp5.setFirstName("Jack");
		emp5.setSecondName("Ivanov");
		emp5.setAge(28);
		emp5.setJobTitle("director");
		emp5.setEmpId(5);
		emp5.setCompanyName("cinema 'Spectacular'");
		emp5.setSalary(6500);

		System.out.println("*****************Introduction*********************");
		System.out.println(emp1.introduce());
		System.out.println(emp2.introduce());
		System.out.println(emp3.introduce());
		System.out.println(emp4.introduce());
		System.out.println(emp5.introduce());




		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);

		int n = employeeList.size();
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++){
			Employee temp;
			double x = employeeList.get(j).getSalary();
			double y = employeeList.get(j + 1).getSalary();
				if (x > y) {
					temp = employeeList.get(j);
					employeeList.add(j, employeeList.get(j + 1));
					employeeList.add(j + 1, temp);
				}
			}
		}
		System.out.println("****List of employees in ascending order" +
                " of their salaries earned****");
		for (int k =0; k < employeeList.size()-1; k++) {
			System.out.println(employeeList.get(k).getFirstName());
		}
		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
