package sef.ATestTask.FirstActivity;

import java.util.Arrays;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Employee a = new Employee();
		a.setEmpId(1);
		a.setJobTitle("Test Specialist");
		a.setCompanyName("Tiger Company");
		a.setSalary(1600);

		System.out.println("-----------------------------");
		System.out.println("Employee's ID number is: " + a.getEmpId());
		System.out.println("Employee's Job Title is: " + a.getJobTitle());
		System.out.println("Employee's Company Name is: " + a.getCompanyName());
		System.out.println("Employee's Salary is: " + a.getSalary());

		Employee b = new Employee();
		b.setEmpId(2);
		b.setJobTitle("Project Manager");
		b.setCompanyName("Tiger Company");
		b.setSalary(600);

		System.out.println("-----------------------------");
		System.out.println("Employee's ID number is: " + b.getEmpId());
		System.out.println("Employee's Job Title is: " + b.getJobTitle());
		System.out.println("Employee's Company Name is: " + b.getCompanyName());
		System.out.println("Employee's Salary is: " + b.getSalary());

		Employee c = new Employee();
		c.setEmpId(3);
		c.setJobTitle("Developer");
		c.setCompanyName("Tiger Company");
		c.setSalary(2100);

		System.out.println("-----------------------------");
		System.out.println("Employee's ID number is: " + c.getEmpId());
		System.out.println("Employee's Job Title is: " + c.getJobTitle());
		System.out.println("Employee's Company Name is: " + c.getCompanyName());
		System.out.println("Employee's Salary is: " + c.getSalary());

		Employee d = new Employee();
		d.setEmpId(4);
		d.setJobTitle("Java Developer");
		d.setCompanyName("Jaguar Company");
		d.setSalary(5340);

		System.out.println("-----------------------------");
		System.out.println("Employee's ID number is: " + d.getEmpId());
		System.out.println("Employee's Job Title is: " + d.getJobTitle());
		System.out.println("Employee's Company Name: " + d.getCompanyName());
		System.out.println("Employee's Salary is: " + d.getSalary());

		Employee e = new Employee();
		e.setEmpId(5);
		e.setJobTitle("C++ Developer");
		e.setCompanyName("Puma Company");
		e.setSalary(2620);

		System.out.println("-----------------------------");
		System.out.println("Employee's ID number is: " + e.getEmpId());
		System.out.println("Employee's Job Title is: " + e.getJobTitle());
		System.out.println("Employee's Company Name is: " + e.getCompanyName());
		System.out.println("Employee's Salary is: " + e.getSalary());

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		// Creating a Double Array
		double[] SalaryArray = new double[] { a.getSalary(), b.getSalary(),c.getSalary(),d.getSalary(),e.getSalary() };

		// Displaying Array before Sorting
		System.out.println("\n**Employees Salary Before Sorting**");
		for (double r: SalaryArray){
			System.out.println(r);
		}

		// Sorting the Array
		Arrays.sort(SalaryArray);
		System.out.println("\n**Employees Salary After Sorting**");
		for (double r: SalaryArray){
			System.out.println(r);
		}

		System.out.println("\n");



//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		Person john = new Person("John", "Doe", 32);
		System.out.println(john.introduce());

		john = new Student(7, "RTU");
		System.out.println(john.introduce());

		john = new Employee(1, "Writer", "Lion Company", 1500);
		System.out.println(john.introduce());

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
