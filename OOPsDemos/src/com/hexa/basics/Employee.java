package com.hexa.basics;

public class Employee {
	String empName;
	double salary;
	
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.empName = "Saran";
		employee.salary = 8000.0;
		System.out.println("Name " +employee.empName);
		System.out.println("Salary " +employee.salary);
		
		Employee employee1 = new Employee();
		employee1.empName = "Kavi";
		employee1.salary = 10000.0;
		System.out.println("Name " +employee1.empName);
		System.out.println("Salary " +employee1.salary);
	}
	
}


