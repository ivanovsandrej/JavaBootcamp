package sef.ATestTask.FirstActivity;

import sef.ATestTask.FirstActivity.Employee;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;


public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		List<Employee> empL = new ArrayList<Employee>();


		Employee A = new Employee();
		Employee B = new Employee();
		Employee C = new Employee();
		Employee D = new Employee();
		Employee E = new Employee();

		empL.add(A);
		empL.add(B);
		empL.add(C);
		empL.add(D);
		empL.add(E);

		A.setFirstName("Anna ");
		B.setFirstName("Boris ");
		C.setFirstName("Max ");
		D.setFirstName("Linda ");
		E.setFirstName("John ");

		A.setSecondName("Ivanova ");
		B.setSecondName("Dole ");
		C.setSecondName("Simpson ");
		D.setSecondName("Leen ");
		E.setSecondName("Springs ");

		A.setAge(20);
		B.setAge(19);
		C.setAge(21);
		D.setAge(36);
		E.setAge(40);

		A.setCompanyName("SIA BBC");
		B.setCompanyName("AS ABBBA");
		C.setCompanyName("SIA Canon");
		D.setCompanyName("AS Sony");
		E.setCompanyName("SIA Intel");

		A.setJobTitle("Manager");
		B.setJobTitle("CEO");
		C.setJobTitle("Finanse manager");
		D.setJobTitle("Analyst");
		E.setJobTitle("Tester");

		A.setSalary(1000);
		B.setSalary(1500);
		C.setSalary(2000);
		D.setSalary(1300);
		E.setSalary(2500);

		A.setEmpId(1);
		A.setEmpId(2);
		A.setEmpId(3);
		A.setEmpId(4);
		A.setEmpId(5);

		for (Employee ob : empL) {
			ob.introduceEmployee();
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		for (int i = empL.size() - 1; i > 0; i--) {
			for (int j = 0; j < 1; j++) {
				if (empL.get(j).getSalary() > empL.get(j + 1).getSalary()) {
					Employee sor = empL.get(j);
					empL.set(j, empL.get(j + 1));
					empL.set(j + 1, sor);
				}
			}
		}
		System.out.println("Sorted by salary:");
		for (Employee ob : empL) {
			ob.introduceEmployee();
		}

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result
		Person Man1 = new Person("Anna ", "Ivanova ", 20 );
		Person Man2 = new Person();
		Person Man3 = new Person();
		Person Man4 = new Person();
		Person Man5 = new Person();

		//System.out.println(Man.introduce());

		Man1 = new Student("RTU");
		Man1 = new Employee(1,"SIA BBC", "Manager", 1000 );

		//TODO 4 Create method for total change employee information
		// for example some employee change his work

		A.changeWork("SIA Intel");


	}
}
