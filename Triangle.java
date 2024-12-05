
package com.mycompany.triangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first angle : ");
		int angle1 = scanner.nextInt();
		System.out.println("Enter second angle : ");
		int angle2 = scanner.nextInt();
		System.out.println("Enter third angle : ");
		int angle3 = scanner.nextInt();
		
		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("Invaild triangle");
    }

 }
}