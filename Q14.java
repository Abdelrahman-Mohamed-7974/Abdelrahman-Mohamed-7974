
import java.util.Scanner;


public class Q14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }

        
        System.out.println("The number is : " + reversedNumber);
        
        scanner.close();
    }
}

