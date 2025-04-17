package com.hexa.abs;

public class SmartPhone extends Mobile {

	public SmartPhone(String model, String brand, double price) {
		super(model, brand, price);
	}

	void showFeatures() {
		System.out.println("High Performance , 4k Quality Camera");

	}

	String[] showAccessories() {
		return new String[] { "Mobile case" };
	}

}
