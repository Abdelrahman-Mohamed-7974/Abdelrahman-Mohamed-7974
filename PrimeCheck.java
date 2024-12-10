package com.mycompany.primecheck;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();

        // Output the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime using a while loop
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        int i = 2; // Start checking from 2
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
            i++;
        }

        return true; // No divisors found, number is prime
    }
}

    

