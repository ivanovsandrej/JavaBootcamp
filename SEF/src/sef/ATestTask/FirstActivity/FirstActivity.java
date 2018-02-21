package sef.ATestTask.FirstActivity;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class FirstActivity {

	public static void main(String[] args) {

		Person per = new Person();
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
		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		Person p = new Person("Jade", "Anders", 23);
		p = new Student("45SecondarySchool", 456);
		p = new Employee(1, "Programmer", "Accenture", 13000);
	}

	//TODO 2 sort and this employees by salary (from min to max)
	// TIP - google bubble sort
	//		System.out.println() result


	public static void bubbleSort(ArrayList employeelist) {
		Double[] salary = (Double[]) employeelist.toArray(new Double[employeelist.size()]);
		for (int i = 0; i < employeelist.size(); i++) {
			for (int j = employeelist.size() - 1; j > i; j--) {
				if (salary[j] > salary[j - 1]) {
					swap(salary, j, j - 1);
				}
			}
		}
		System.out.printf("Sorted Array using Bubble sort algorithm :%s %n",
				Arrays.toString(salary));

	}

	public static void swap(Double[] array, int from, int to) {
		double temp = array[from];
		array[from] = array[to];
		array[to] = temp;

	}

	}







