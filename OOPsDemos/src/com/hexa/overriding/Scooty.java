package com.hexa.overriding;

public class Scooty extends TwoWheeler {

    public Scooty(String model, String brand, double price) {
        super(model, brand, price);
    }

    @Override
    void getMileage() {
        System.out.println("Great mileage!");
    }

    @Override
    String[] showAccessories() {
        return new String[] {"Seat Cover", "Helmet", "Carrier"};
    }
}
