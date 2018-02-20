package sef.ATestTask.FirstActivity;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class FirstActivity {

	public static void main(String[] args) {

		Person per=new Person();
		per.setFirstName("Jonhn3");

		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result
		Employee a = new Employee();
		a.setSalary(15000);
		Employee b = new Employee();
		b.setSalary(13000);
		Employee c = new Employee();
		c.setSalary(11000);
		Employee d = new Employee();
		d.setSalary(9000);
		Employee f = new Employee();
		f.setSalary(8000);
		Employee g = new Employee();
		g.setSalary(7000);
		List employeelist = new ArrayList();
		employeelist.add(a.getSalary());
		employeelist.add(b.getSalary());
		employeelist.add(c.getSalary());
		employeelist.add(d.getSalary());
		employeelist.add(f.getSalary());
		employeelist.add(g.getSalary());
		//TODO 4 Create method for total change employee information
		// for example some employee change his work
		Employee emp = new Employee();
		emp.changeParam("EvolutionLatvia");

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result
		int temp = 0;
	}
	/*
	public void bubbleSort (ArrayList employeelist) {
		for (int i = 0; i < employeelist.size(); i++) {
			for (int j = 1; j < (employeelist.size() - i); j++) {
				if (employeelist[j - 1])<employeelist[j] {
					temp = employeelist[j - 1];
					employeelist[j - 1] = employeelist[j];
					employeelist[j] = temp;
				}

			}
		}
	}



		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result
Person p = new Person("Jade", "Anders", 23);
		p = new Student("45SecondarySchool",456);
		p = new Employee(1, "Programmer", "Accenture", 13000);




	}

*/
}


