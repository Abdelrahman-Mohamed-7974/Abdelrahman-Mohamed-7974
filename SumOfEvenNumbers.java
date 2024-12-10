package com.mycompany.sumofevennumbers;

import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

     
        int sum = 0;
        int counter = 2;

        
        while (counter <= N) {
            sum += counter;
            counter += 2; 
        }

        System.out.println("Sum of even numbers between 1 and " + N + " is: " + sum);

        scanner.close();
    }
}

    

