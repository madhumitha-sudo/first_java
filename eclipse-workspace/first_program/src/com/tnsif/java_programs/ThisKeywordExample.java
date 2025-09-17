package com.tnsif.java_programs;

class Book {
    String title;
    double price;

    // Parameterized constructor
    Book(String title, double price) {
        this.title = title;   // 'this' refers to current object
        this.price = price;
    }

    void display() {
        System.out.println("Book: " + title + ", Price: " + price);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 499.99);
        b1.display();
    }
}
