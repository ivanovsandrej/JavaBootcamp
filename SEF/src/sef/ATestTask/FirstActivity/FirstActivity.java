package sef.ATestTask.FirstActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		/*
		Person p1 = new Person();
		p1.setAge(25);
		p1.setFirstName("Abdula");
		p1.setSecondName("Abah");
		 p1.introduce();


		Employee e1 = new Employee();
		e1.setFirstName("Abdula");
		e1.setSecondName("Abah");
		e1.setAge(25);
		e1.setCompanyName("Universal");
		e1.setJobTitle("Director");
		e1.introduce();

		Student s1 = new Student();
		s1.introduce();
		*/

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Employee e1 = new Employee();
		e1.setFirstName("Abdula");
		e1.setSecondName("Abah");
		e1.setAge(25);
		e1.setCompanyName("Universal");
		e1.setJobTitle("Director");
		e1.setEmpId(12);
		e1.setSalary(2000);

		Employee e2 = new Employee();
		e2.setFirstName("Aziz");
		e2.setSecondName("Bakara");
		e2.setAge(30);
		e2.setCompanyName("Paramount");
		e2.setJobTitle("Designer");
		e2.setEmpId(123);
		e2.setSalary(1000);

		Employee e3 = new Employee();
		e3.setFirstName("Adam");
		e3.setSecondName("Folks");
		e3.setAge(32);
		e3.setCompanyName("Eagle");
		e3.setJobTitle("Scout");
		e3.setEmpId(18);
		e3.setSalary(1500);

		Employee e4 = new Employee();
		e4.setFirstName("Marcus");
		e4.setSecondName("Croc");
		e4.setAge(19);
		e4.setCompanyName("Tesla");
		e4.setJobTitle("Brocker");
		e4.setEmpId(33);
		e4.setSalary(4000);

		Employee e5 = new Employee();
		e5.setFirstName("Targo");
		e5.setSecondName("Felps");
		e5.setAge(22);
		e5.setCompanyName("Origin");
		e5.setJobTitle("Intern");
		e5.setEmpId(3456);
		e5.setSalary(500);

		Employee e6 = new Employee();
		e6.setFirstName("Nike");
		e6.setSecondName("Propos");
		e6.setAge(45);
		e6.setCompanyName("Anderson");
		e6.setJobTitle("Manager");
		e6.setEmpId(475);
		e6.setSalary(5000);


				Employee arr[] = {e1, e2, e3, e4, e5,e6 };
		for (int i = 0; i < arr.length; i++  ) {
			System.out.println("My name is " + arr[i].getFirstName() + " " + arr[i].getSecondName() + " and i am "  + arr[i].getAge() + " years old" +
					"\nI am work as " + arr[i].getJobTitle() + " in company " + arr[i].getCompanyName() +
					"\nMy salary is " + arr[i].getSalary() +
						"\n----------------------------");
										}



		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);

		/*

		for (int i = 1; i < employeeList.size(); i++){
			Employee temp = new Employee();
			double x = employeeList.get( i - 1).getSalary();
			double y = employeeList.get(i).getSalary();
			if (x > y) {
				temp = employeeList.get(i -1);
				employeeList.add(i -1, employeeList.get(i));
				employeeList.add(i, temp);
			}
		}
		for (int i=0; i<employeeList.size(); i++) {
			System.out.println(employeeList.get(i).getSalary());
		}

		*/

/*
		for ( int i = 0; i < arr.length; i++) {
			double[] sal = {arr[i].getSalary()};
			System.out.println(arr[i].getSalary());
			//System.out.println(sal[i]);
		}
*/


		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work;



	}

	
	
}
