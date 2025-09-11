package com.tnsif.first_program;

public class Operators {
	
	public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("The Value of a = " + a);
        System.out.println("The Value of b = " + b);
        
        // Arithmetic Operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (a != 0): " + ((a > b) && (a != 0)));
        System.out.println("(a < b) || (b != 0): " + ((a < b) || (b != 0)));
        System.out.println("!(a == b): " + (!(a == b)));

        // Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a)); // pre-increment
        System.out.println("b-- = " + (b--)); // post-decrement
        System.out.println("Now b = " + b);

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 20;
        System.out.println("The Value of c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int x = 6, y = 3;  // 6 -> 110, 3 -> 011
        System.out.println("The Value of x = " + x);
        System.out.println("The Value of y = " + y);
        System.out.println("x & y = " + (x & y)); // AND
        System.out.println("x | y = " + (x | y)); // OR
        System.out.println("x ^ y = " + (x ^ y)); // XOR
        System.out.println("~x = " + (~x));       // NOT
        System.out.println("x << 1 = " + (x << 1)); // left shift
        System.out.println("x >> 1 = " + (x >> 1)); // right shift
    }
}
