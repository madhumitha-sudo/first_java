package com.tnsif.first_program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String originalStr = str;
        String reversedStr = "";

        // Reverse the string 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        // Compare original and reversed
        if (originalStr.equals(reversedStr)) {
            System.out.println(originalStr + " is a Palindrome.");
        } else {
            System.out.println(originalStr + " is not a Palindrome.");
        }

        sc.close();

	}

}
