package com.mycompany.bonuschallenges;
import java.util.Scanner;

public class BonusChallenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Enter the upper limit (N) for Armstrong Numbers: ");
        int n = scanner.nextInt();
        System.out.println("Armstrong Numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        

        System.out.print("Enter a number for the Collatz Conjecture: ");
        int collatzNumber = scanner.nextInt();
        System.out.println("Collatz Sequence for " + collatzNumber + ":");
        generateCollatzSequence(collatzNumber);
        
        scanner.close();
    }


    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNum;
    }

    public static void generateCollatzSequence(int num) {
        while (num != 1) {
            System.out.print(num + " ");
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
        }
        System.out.println(1); 
    }
}



