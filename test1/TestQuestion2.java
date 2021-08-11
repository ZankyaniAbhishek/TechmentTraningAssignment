package com.Techment.Day8.test1;



class Employee
{
	String FirstName;
	String LastName;
	public Employee(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
}
public class TestQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter First Name of person 1 : ");
		//int number = scanner.nextInt();
		Employee emp1 = new Employee("Raj", "Singh");
		Employee emp2 = new Employee("Ramesh", "Lal");
		Employee emp3 = new Employee("Tarak", "Mehta");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		

	}

}
