package com.hexa.over;

public class Shape {
	
	void area(int x) {
		System.out.println("Square " + Math.pow(x, 2));
	}
	double area(double r) {
		// double area = Math.PI*Math.pow(r, 2);
		return Math.PI*Math.pow(r, 2);
	}
	void area(int x, int y) {
		System.out.println("Rectangle "+(x*y));
	}
	double area(int len ,float height) {
		return 0.5*len*height;
	}

}
