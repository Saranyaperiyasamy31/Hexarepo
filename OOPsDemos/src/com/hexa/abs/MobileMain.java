package com.hexa.abs;

public class MobileMain {

	    public static void main(String[] args) {
	        Mobile mobile = new Mobile("Galaxy S23", "Samsung", 79999.99);
	        mobile.printDetails();
	        mobile.showFeatures();
	        String[] accessories = mobile.showAccessories();
	        System.out.println("Accessories:");
	        for (String accessory : accessories) {
	            System.out.println(accessory);
	        }
	    }
	}


