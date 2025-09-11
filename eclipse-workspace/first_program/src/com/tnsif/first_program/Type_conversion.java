package com.tnsif.first_program;

public class Type_conversion {
	
	public static void main(String[] args) {
        
        // Implicit Conversion 
        int intValue = 100;            
        float floatValue = intValue; 
        
        System.out.println("Implicit Conversion:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted Float value: " + floatValue);

        // Explicit Conversion
        float f = (float) 99.99;
        int i = (int) f;  
        
        System.out.println("\nExplicit Conversion:");
        System.out.println("Float value: " + f);
        System.out.println("Converted Integer value: " + i);
    }
}
