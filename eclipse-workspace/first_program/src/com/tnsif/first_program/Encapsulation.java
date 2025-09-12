package com.tnsif.first_program;

class CarProperties{

	int model = 5;
	String color = "Black";
	String company = "Mahindra Thar";
	
	public void moves() {
		System.out.println("The "+ company +" is Moving Forward.");
	}
	public void stops() {
		System.out.println("The car stops here.");
	}
	public void drift() {
		System.out.println("The car is drifting.");
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		CarProperties cp = new CarProperties();
		System.out.println("Model: " + cp.model);
		System.out.println("Colour: " + cp.color);
		System.out.println("Car: " + cp.company);
		System.out.println("\n");
		cp.moves();
		cp.stops();
		cp.drift();

	}

}
