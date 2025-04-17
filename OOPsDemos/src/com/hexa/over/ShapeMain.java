package com.hexa.over;

public class ShapeMain {
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		 shape.area(15);
		 
		 double circle= shape.area(50.0);
		 System.out.println("Circle "+circle);
		 
		 shape.area(10,20);
		 double triangle = shape.area(12,13.4f);
		 System.out.println("Triangle "+triangle);
	}

}
