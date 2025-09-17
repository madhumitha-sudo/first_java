package com.tnsif.java_programs;

class Car1 {
    String brand;
    int year;

    // Parameterized constructor
    Car1(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ParameterizedConstructorExample {

	public static void main(String[] args) {
		Car1 c1 = new Car1("Toyota", 2022); // Calls parameterized constructor
		Car1 c2 = new Car1("Honda", 2023);

        c1.display();
        c2.display();

	}

}
