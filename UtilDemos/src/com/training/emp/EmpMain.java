package com.training.emp;

import java.util.ArrayList;

public class EmpMain {
	public static void main(String[] args) {
		    Employee e1 = new Employee("Saranya", 101, "Chennai", 50000);
	        Employee e2 = new Employee("Rithika", 102, "Delhi", 60000);
	        Employee e3 = new Employee("Yuvasri", 103, "Mumbai", 55000);
	        Employee e4 = new Employee("Monika", 104, "Hyderabad", 58000);
	        Employee e5 = new Employee("Thasnim", 105, "Bangalore", 62000);
	        
	        
	        ArrayList<Employee> employeeList = new ArrayList<>();
	        employeeList.add(e1);
	        employeeList.add(e2);
	        employeeList.add(e3);
	        employeeList.add(e4);
	        employeeList.add(e5);
	        
	        for (Employee emp : employeeList) {
	            System.out.println(emp);
	        }
	    }
	}

	


