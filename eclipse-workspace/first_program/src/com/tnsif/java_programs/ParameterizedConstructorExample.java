package com.tnsif.java_programs;

class vehicle {
    String brand;
    int year;

    // Parameterized constructor
    vehicle(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ParameterizedConstructorExample {

	public static void main(String[] args) {
		vehicle c1 = new vehicle("Toyota", 2022); // Calls parameterized constructor
		vehicle c2 = new vehicle("Honda", 2023);

        c1.display();
        c2.display();

	}

}
