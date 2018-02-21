package sef.ATestTask.FirstActivity;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FirstActivity {
	static FirstActivity fs = new FirstActivity();


	public static void main(String[] args) {
		//1

		Employee e = new Employee();
		e.setEmpId(1);
		e.setAge(32);
		e.setFirstName("Huge1");
		e.setSecondName("Jackman");
		e.setSalary(54000);
		e.setJobTitle("Developer");
		System.out.println(e.getFirstName());
		//2
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setAge(23);
		e2.setFirstName("Dave");
		e2.setSecondName("Jackman");
		e2.setSalary(24000);
		e2.setJobTitle("QA Engeneer");
		//3
		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setAge(22);
		e3.setFirstName("Orbact");
		e3.setSecondName("Jackman");
		e3.setSalary(33000);
		e3.setJobTitle("Security Engenner");
		//4
		Employee e4 = new Employee();
		e4.setEmpId(4);
		e4.setAge(55);
		e4.setFirstName("Nil");
		e4.setSecondName("Armstrong");
		e4.setSalary(54000);
		e4.setJobTitle("Scrum Master");
		//5
		Employee e5 = new Employee();
		e5.setEmpId(5);
		e5.setAge(37);
		e5.setFirstName("Jackie");
		e5.setSecondName("Chan");
		e5.setSalary(34000);
		e5.setJobTitle("Web Designer");

		//TO DO 2nd
		Person p1 = new Person();
		p1.setFirstName("gggg");
		p1 = new Student();
		System.out.println(p1.getFirstName());
		p1 = new Employee();
		System.out.println(p1.getFirstName());

		//collection
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(e);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		BubbleSortSalary(employeeList);

		for(Iterator empIterator=employeeList.iterator();
				empIterator.hasNext();){
			Employee emp = (Employee) empIterator.next();
			if (emp.getSalary()>40000){
				empIterator.remove();
			}

		}}

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result


	private static void BubbleSortSalary(ArrayList<Employee> employeeList) {
		employeeList.get(0).getSalary();
		for (int i=0; i<employeeList.size();i++) System.out.println(employeeList.get(i).getSalary());

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result
		int n = employeeList.size();
		Employee temp;
		for(int i =0; i<n; i++){
			for (int j=1;j<(n-1);j++){
				if (employeeList.get(j-1).getSalary()>employeeList.get(j).getSalary()){
					temp=employeeList.get(j-1);
					employeeList.add(j-1,employeeList.get(j)) ;
					employeeList.add (j, temp);
				}
			}
		}
		System.out.println("" + "\n From buttom to top");
	for (int a=0; a<employeeList.size(); a++){
		System.out.println("Employee Salary = " + employeeList.get(a).getSalary());
	}
	}
	//	//TODO 4 Create method for total change employee information
	//	// for example some employee change his wo
	Employee employee = new Employee(1, "Developer", "Accenture", 78000, "Name", "SecondName" );

	}

	
	

