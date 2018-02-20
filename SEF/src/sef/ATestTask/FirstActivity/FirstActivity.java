package sef.ATestTask.FirstActivity;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		Employee a= new Employee("John","Smith",25,111,"Developer","Microsoft",3000.00);
		Employee b= new Employee("Bob","Ivanov",37,112,"Accountant","ZZ Bank",1234.00);
		Employee c= new Employee("Anna","Jhones",22,113,"Manager","abc shop",2440.00);
		Employee d= new Employee("Jane","Petrova",41,114,"Sales Manager","HerbaLife",1500.00);
		Employee e= new Employee("Lisa","Ozola",40,115,"Engineer","Microsistems",2200.00);


		//		System.out.println() result


		System.out.println("-----------------------------");
		System.out.println("Employee's Name is 		    : " + a.getFirstName());
		System.out.println("Employee's Second Name is  	: " + a.getSecondName());
		System.out.println("Employee's Age is 			: " + a.getAge());
		System.out.println("Employee's EmpId is 		: " + a.getEmpId());
		System.out.println("Employee's JobTitle is 		: " + a.getJobTitle());
		System.out.println("Employee's CompanyName is 	: " + a.getCompanyName());
		System.out.println("Employee's Salary is 		: " + a.getSalary());



		System.out.println("-----------------------------");
		System.out.println("Employee's Name is 		    : " + b.getFirstName());
		System.out.println("Employee's Second Name is  	: " + b.getSecondName());
		System.out.println("Employee's Age is 			: " + b.getAge());
		System.out.println("Employee's EmpId is 		: " + b.getEmpId());
		System.out.println("Employee's JobTitle is 		: " + b.getJobTitle());
		System.out.println("Employee's CompanyName is 	: " + b.getCompanyName());
		System.out.println("Employee's Salary is 		: " + b.getSalary());





		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result



		//TODO 3 create instance of the Person ->
		Person pn1= new Person("Igor", "Ivanov", 33);
		// than make them Student
		pn1 = new Student(1, "TSI");
		// than make them Employee
		pn1 = new Employee();
		//		System.out.println() result
		System.out.println();


		//TODO 4 Create method for total change employee information
		// for example some employee change his work
		d.workChange(142,"sda","gasfas",300.00);
		System.out.print(d.getFirstName() + d.getCompanyName() + d.getSalary()+ d.getJobTitle());

	}

	
	
}
