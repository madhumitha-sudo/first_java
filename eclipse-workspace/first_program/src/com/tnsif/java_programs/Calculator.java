package com.tnsif.java_programs;

abstract class Shape{
	double area = 4;
	
	abstract void calArea();
	
	void show() {
		System.out.println("Area : " + area);
	}
}

class Square extends Shape{
	double side;
	
	Square(double s){
		side = s;
	}
	
	void calArea() {
		area = side * side;
	}
}

class Rectangle extends Shape{
	double length,breadth;
	
	Rectangle(double l, double b){
		length = l;
		breadth = b;
	}
	
	void calArea() {
		area = length * breadth;
	}
}

public class Calculator {

	public static void main(String[] args) {
		Square s = new Square(4);
		Rectangle r = new Rectangle(4,5);
		s.calArea();
		s.show();
		r.calArea();
		r.show();

	}

}
