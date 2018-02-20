package sef.ATestTask.FirstActivity;

import java.util.*;


public class FirstActivity {


	public static void main(String[] args) {
	    //TODO Uncomment
     /*  List<Employee> employeeList = new ArrayList();

       Employee emp1 = new Employee(1, "Dev", "Accenture", 36000);
        employeeList.add(0,emp1);
        Employee emp2 = new Employee(2, "Dev", "Accenture", 30000);
        employeeList.add(1,emp2);
        Employee emp3 = new Employee(3, "Tester", "Accenture",21000);
        employeeList.add(2,emp3);
        Employee emp4 = new Employee(4, "Dev", "Tele2", 30000);
        employeeList.add(3,emp4);
        Employee emp5 = new Employee(5, "Dev", "Tele2", 34000);
        employeeList.add(4,emp5);
        Employee emp6 = new Employee(6, "Tester", "Tele2", 20000);
        employeeList.add(5,emp6);
        Employee emp7 = new Employee(7, "Dev","C.T.Co", 31000);
        employeeList.add(6,emp7);
        Employee emp8 = new Employee(8,"Dev","C.T.Co", 30000);
        employeeList.add(7,emp8);
        Employee emp9 = new Employee(9, "Tester", "C.T.Co", 19000);
        employeeList.add(8,emp9);

        for(int i = 0; i <= 8; i++){
            for(int j = 8; j > i; j--){
                if(employeeList.get(i).getSalary()<employeeList.get(j).getSalary()){
                    Employee obj1 = employeeList.get(i);
                    employeeList.set(i, employeeList.get(j));
                    employeeList.set(j, obj1);
                }
            }
            System.out.println(employeeList.get(i).introduce());
        }*/

        Person person = new Person("Jon", "Doe", 21);
        System.out.println(person.introduce());
        person.setFirstName("Jon1");
        person = new Student(001,"LU",6.7);
        System.out.println(person.introduce());
        person = new Employee(001, "Dev", "Accenture", 12000);
        System.out.println(person.introduce());




		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result




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

    public void changeEmployeeInformation(Employee e, int empID, double salary, String jobTitle, String companyName){
	    e.setCompanyName(companyName);
	    e.setJobTitle(jobTitle);
	    e.setEmpId(empID);
	    e.setSalary(salary);
    }


}
