package com.hexa.basics;

public class Student {
	String studName;
	String city;
	
	
	
	public static void main(String[] args) {
		
		Student student =new Student();
		student.studName = "Rithi";
		student.city ="Salem";
		System.out.println("Name:"+ student.studName);
		System.out.println("City:"+student.city);
		
		Student student1 =new Student();
		student1.studName = "Sakthi";
		student1.city ="Karur";
		System.out.println("Name:"+ student1.studName);
		System.out.println("City:"+student1.city);
	}

}
