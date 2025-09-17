package com.tnsif.java_programs;

class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        brand = "Unknown";
        year = 0;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class DefaultConstructorExample {
	public static void main(String[] args) {
		Car c1 = new Car(); // Calls default constructor
        c1.display();
	}
}