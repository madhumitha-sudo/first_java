package com.tnsif.java_programs;

interface Vehicle{
	void start();
	void stop();
}

interface Bike extends Vehicle{
	void drive();
}

class Tesla implements Bike{
	
	public void start() {
		System.out.println("Tesla is Started.");
	}
	
	public void stop() {
		System.out.println("Tesla is Stopped.");
	}
	
	public void drive() {
		System.out.println("Tesla is Driving.");
	}
}

public class InterfaceToInterface {
	public static void main(String[] args) {
		Tesla c1 = new Tesla();
		c1.start();
		c1.stop();
		c1.drive();
	}

}
