package org.example;

public class ChargePhone {
    public static void main(String[] args) {
        Phone[] phones = new Phone[4];

        phones[0] = new Phone("Apple");
        phones[1] = new Phone("Samsung");
        phones[2] = new Phone("LG");
        phones[3] = new Phone("Panasonic");

        for (Phone phone : phones) {
            phone.chargePhone();
            System.out.println("Phone " + phone.model + " fully charged. Charge: " + phone.charge);
        }
    }
}
