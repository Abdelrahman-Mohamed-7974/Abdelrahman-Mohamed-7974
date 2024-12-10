
package com.mycompany.gcdcalculator;

import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

       
        int gcd = findGCD(number1, number2);

        System.out.println("GCD of " + number1 + " and " + number2 + " is " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
             }

        return a;
    }
}

    

