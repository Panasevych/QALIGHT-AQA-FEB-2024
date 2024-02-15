package org.example;

public class Phone {
    String model;
    int charge;

    public Phone(String model) {
        this.model = model;
        this.charge = 0;
    }

    public void chargePhone() {
        System.out.println("Charging " + model + "...");
        for (int i = 0; i <= 100; i++) {
            charge = i;
            System.out.println("Charge: " + charge + "%");
        }
        System.out.println(model + " fully charged.");
    }
}