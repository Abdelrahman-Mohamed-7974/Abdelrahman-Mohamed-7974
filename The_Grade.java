
package com.mycompany.the_grade;

import java.util.Scanner;

public class The_Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your grade  ");
		double grade = scanner.nextDouble();
		if (grade > 90) {
			System.out.println("The grade is A+");
	}else if(grade > 80) {
			System.out.println("The grade is" +"A");
	}else if (grade > 70) {
			System.out.println("The grade is" + "B");
	}else if (grade > 60) {
			System.out.println("The grade is" + "C");
	}else {
			System.out.println("The grade is" + "F");
	}
    }
}
