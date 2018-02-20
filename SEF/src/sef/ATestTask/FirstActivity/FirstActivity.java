package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List
public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)

		Employee emp1 = new Employee();
		emp1.setFirstName("John");
		emp1.setSecondName("Brown");
		emp1.setAge(30);
		emp1.setjobTitle("manager assistant");
		emp1.setEmpId(1);
		emp1.setCompanyName("ACB Management");
		emp1.setSalary(750);

		Employee emp2 = new Employee();
		emp2.setFirstName("Brad");
		emp2.setSecondName("Green");
		emp2.setAge(38);
		emp2.setjobTitle("sales manager");
		emp2.setEmpId(2);
		emp2.setCompanyName("ACB Management");
		emp2.setSalary(800);

		Employee emp3 = new Employee();
		emp3.setFirstName("Brad");
		emp3.setSecondName("Green");
		emp3.setAge(38);
		emp3.setjobTitle("sales manager");
		emp3.setEmpId(3);
		emp3.setCompanyName("ACB Management");
		emp3.setSalary(800);

		Employee emp4 = new Employee();
		emp4.setFirstName("Jack");
		emp4.setSecondName("White");
		emp4.setAge(45);
		emp4.setjobTitle("director");
		emp4.setEmpId(4);
		emp4.setCompanyName("ACB Management");
		emp4.setSalary(1200);

		Employee emp5 = new Employee();
		emp5.setFirstName("Julia");
		emp5.setSecondName("Black");
		emp5.setAge(25);
		emp5.setjobTitle("administrator");
		emp5.setEmpId(5);
		emp5.setCompanyName("ACB Management");
		emp5.setSalary(600);

		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		BubbleSortSalary(employeeList);

		for(Iterator empIterator=employeeList.iterator();
			empIterator.hasNext();) {
			Employee emp = (Employee) empIterator.next();
			if (emp.getSalary()>800){
				empIterator.remove();
			}
		}}

		private static void BubbleSortSalary(ArrayList<Employee> employeeList){
			employeeList.get(0).getSalary();
			for (int i=0; i<employeeList.size();i++) System.out.println(employeeList.get(i).getSalary();

			//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
