package com.training.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemos {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("1");
		
		System.out.println(fruits);
		
		for(Object fruit : fruits) {
			String fr = (String)fruit;
			System.out.println(fr.toUpperCase());
		}
		
	}

}
