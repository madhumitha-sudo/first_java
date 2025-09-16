package com.tnsif.first_program;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 are:");
        for (int num = 2; num <= 100; num++) { 				//-------- Start from 2 (first prime)
            boolean isPrime = true;
            
            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // Not prime
                    break; 
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

	}

}
