package com.hexa.overriding;

public class OverridingDemo {
	    public static void main(String[] args) {
	        
	        TwoWheeler wheeler = new Bike("Rx", "Bajaj", 90000);

	        // call the methods -> they will be called from Bike class only
	        wheeler.printDetails();  // Calls TwoWheeler version
	        wheeler.getMileage();    // Calls overridden version from Bike
	        
	        String[] accessories = wheeler.showAccessories();
	        for (String accessory: accessories) 
	        System.out.println(accessory); 
	        
	        System.out.println(); 
	        wheeler = new Scooty("Activa", "Honda", 120000); 
	        wheeler.printDetails(); 
	        wheeler.getMileage(); 
	        accessories=wheeler.showAccessories(); 
	        for (String accessory: accessories) 
	        System.out.println(accessory);
     }
}