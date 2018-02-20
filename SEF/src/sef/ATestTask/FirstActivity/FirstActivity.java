package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		Employee employee6 = new Employee();


		employee1.setFirstName ("John");
		employee1.setSecondName("Smith");
		employee1.setJobTitle ("Tester");
		employee1.setCompanyName("Sun");
		employee1.setSalary(1000);

		employee2.setFirstName ("Jim");
		employee2.setSecondName("Swanson");
		employee2.setJobTitle ("Tester");
		employee2.setCompanyName("Google");
		employee2.setSalary(1700);

		employee3.setFirstName ("Jack");
		employee3.setSecondName("Strong");
		employee3.setJobTitle ("QA engineer");
		employee3.setCompanyName("Amazon");
		employee3.setSalary(3000);

		employee4.setFirstName ("James");
		employee4.setSecondName("Strict");
		employee4.setJobTitle ("Developer");
		employee4.setCompanyName("Amazon");
		employee4.setSalary(3000);

		employee5.setFirstName ("Seth");
		employee5.setSecondName("Rogan");
		employee5.setJobTitle ("Developer");
		employee5.setCompanyName("Google");
		employee5.setSalary(3400);

		employee6.setFirstName ("Kim");
		employee6.setSecondName("Stray");
		employee6.setJobTitle ("Tester");
		employee6.setCompanyName("Sun");
		employee6.setSalary(3000);



		System.out.println("First Name " + employee1.getFirstName());
		System.out.println("Second Name " + employee1.getSecondName());
		System.out.println("Job title " + employee1.getJobTitle());
		System.out.println("Company Name " + employee1.getCompanyName());
		System.out.println("Salary " + employee1.getSalary());

		//		System.out.println() result
		ArrayList<Employee> employeeList= new ArrayList<>();

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);}


		/*for (Iterator empIterator = employeeList.iterator());
		empIterator.hasNext();{
			Employee emp = (Employee) empIterator.next();
			if (emp.getSalary()>1000);
			empIterator.remove; not finished.

		}
		*/


	public static void BubbleSortSalary (ArrayList<Employee> employeeList){

				employeeList.get(0).getSalary();
				for (int i = 0; i<employeeList.size();i++) System.out.println(employeeList.get(i).getSalary());

				//not finished
		//TODO 2 sort and this employees by salary (from min to max)




		//google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}


}
