package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections.*;

import static java.util.Collections.swap;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		Employee masha = new Employee("Masha", "Pentush", 33, 1, "Engineer",
				"Some company", 1500);
		Employee oleg = new Employee("Oleg", "Kasilov", 33, 2, "Engineer",
				"Some company", 1200);
		Employee vasja = new Employee("Vasja", "Sokolov", 43, 3, "Engineer",
				"Some company", 2500);
		Employee vika = new Employee("Vika", "Skuja", 37, 4, "Doctor",
				"Some company", 1800);
		Employee yura = new Employee("Yury", "Cheburek", 36, 5, "Engineer",
				"Some company", 2000);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(masha);
		list.add(oleg);
		list.add(vika);
		list.add(yura);
		list.add(vasja);

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		// right now the elements in the list are not sorted
		for (int index = 0; index < list.size(); index++)
			list.get(index).introduce();

		int n = list.size();
		Employee temp ;
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				if(list.get(j-1).getSalary() > list.get(j).getSalary()){
					//swap elements
					swap(list, j, j-1);
					//temp = list.get(j-1);
					//list.set(j, list.get(j-1));// arr[j-1] = arr[j];
				//	list.set(j, temp);//arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting");
		// now elements should be sorted
		for (int index = 0; index < list.size(); index++)
			list.get(index).introduce();


		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		Person jelena = new Person("Jelena", "Mihailova", 36);
		// than make them Student
		jelena.introduce();
		jelena = new Student("Jelena", "Mihailova", 36, "RTU");
		jelena.introduce();
		// than make them Employee
		jelena = new Employee("Jelena", "Mihailova", 36, 6, "Chemist", "Roche", 1500);
		jelena.introduce();
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work
		Employee uldis = new Employee("Uldis", "Arajs", 36, 7, "Software Engineer", "Accenture", 2000);
		uldis.introduce();
		uldis.setJobTitle("Manager");
		uldis.setCompanyName("LMT");
		uldis.introduce();
		uldis.changeJob("Vice President", "Novartis");
		uldis.introduce();




	}

	
	
}
