package com.tnsif.java_programs;

class Animal {
    String type = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String type = "Dog";

    void display() {
        System.out.println("This is a " + type);   // refers to Dog's type
        System.out.println("Parent is a " + super.type); // refers to Animal's type
    }

    @Override
    void sound() {
        super.sound(); // calls parent class method
        System.out.println("Dog barks");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.sound();
    }
}