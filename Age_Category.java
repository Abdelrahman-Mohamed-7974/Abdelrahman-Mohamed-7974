
package com.mycompany.age_category;

import java.util.Scanner;

public class Age_Category {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 30) {
            System.out.println("Youth");
        } else if (age >= 30 && age < 50) {
            System.out.println("Old");
        } else if (age >= 50) {
            System.out.println("So Old");
        }

        scanner.close();
    }
}
    
