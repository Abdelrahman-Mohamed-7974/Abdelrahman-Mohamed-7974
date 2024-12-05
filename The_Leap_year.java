
package com.mycompany.the_leap_year;

import java.util.Scanner;

public class The_Leap_year {
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
		System.out.println("input year  ");
		int year = scanner.nextInt();
		
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}

}
    
    

