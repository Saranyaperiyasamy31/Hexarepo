package com.hexa.abs;

public class BasicPhone extends Mobile {

	public BasicPhone(String model, String brand, double price) {
		super(model, brand, price);
	}

	String[] showAccessories() {
		return new String[] { "Charger" };

	}

	void showFeatures() {
		System.out.println("Good Memory , Good Camera");

	}

}

