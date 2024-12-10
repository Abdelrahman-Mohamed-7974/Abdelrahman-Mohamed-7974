package com.mycompany.countdigits;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10; 
                count++;
            }
        }

       
        System.out.println("The number has " + count + " digits.");

        scanner.close();
    }
}
