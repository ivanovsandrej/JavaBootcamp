package sef.ATestTask.FirstActivity;


import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {

		Employee employee[] = new Employee[5];

		employee[0] = new Employee();
		employee[0].setFirstName("Alex");
		employee[0].setSalary(100);

		employee[1] = new Employee();
		employee[1].setFirstName("May");
		employee[1].setSalary(300);

		employee[2] = new Employee();
		employee[2].setFirstName("Jay");
		employee[2].setSalary(200);

		employee[3] = new Employee();
		employee[3].setFirstName("Ellie");
		employee[3].setSalary(500);

		employee[4] = new Employee();
		employee[4].setFirstName("Max");
		employee[4].setSalary(160);
	}

}