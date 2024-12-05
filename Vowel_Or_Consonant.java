
package com.mycompany.vowel_or_consonant;

import java.util.Scanner;

public class Vowel_Or_Consonant {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a single character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("The input is not a valid letter.");
        } else {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }

        scanner.close();
    }
}
    

