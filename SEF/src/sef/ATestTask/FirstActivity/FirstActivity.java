package sef.ATestTask.FirstActivity;

import java.util.Arrays;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result

		public 	class Employee {

			String Name
			int Salary;

			Employee employee[] = new Employee[6];
			employee[0] = new Employee();
			employee[0].setSalary(400);
			employee[0].setName("Joe");

			employee[1] = new Employee();
			employee[1].setSalary(200);
			employee[1].setName("Peter");

			employee[2] = new Employee();
			employee[2].setSalary(450);
			employee[2].setName("Mark");

			employee[3] = new Employee();
			employee[3].setSalary(380);
			employee[3].setName("Brian");

			employee[4] = new Employee();
			employee[4].setSalary(210);
			employee[4].setName("Justin");

			employee[5] = new Employee();
			employee[5].setSalary(520);
			employee[5].setName("Debbie");

			{
				System.out.println("Order of employee before sorting is");
				for (int i = 0; i < employee.salary; i++) {
					System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Salary :: " + employee[i].getSalary());

				}

				Arrays.sort(employee, new AgeComparator());
				System.out.println("\n\nOrder of employee after sorting by employee age is");

				for (int i = 0; i < employee.length; i++) {
					System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
				}

				//Sorting array on the basis of employee Name by passing NameComparator
				Arrays.sort(employee, new NameComparator());

				System.out.println("\n\nOrder of employee after sorting by employee name is");
				for (int i = 0; i < employee.length; i++) {
					System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
				}
				public String getName() {
				return Name;
			}
				public void setName(String Name) {
				this.Name = Name;
			}
			}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result



			//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

			public class Person extends Student {

			}

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
