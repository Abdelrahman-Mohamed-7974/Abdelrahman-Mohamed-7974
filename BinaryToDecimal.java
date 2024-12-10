package com.mycompany.binarytodecimal;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a binary number: ");
        int binary = scanner.nextInt();

 
        int decimal = convertBinaryToDecimal(binary);

     
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }

 
    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0;
        int position = 0; 

        while (binary > 0) {
            int currentDigit = binary % 10; 
            decimal += currentDigit * Math.pow(2, position); 
            binary /= 10; 
            position++; 
        }

        return decimal;
    }
}

    

