

package com.mycompany.even_or_odd;

import java.util.Scanner;

public class Even_or_Odd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  the numberً ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number" + number + " (Even)");
        } else {
            System.out.println("The number" + number + " (Odd)");
        }
        scanner.close();
    }
}
