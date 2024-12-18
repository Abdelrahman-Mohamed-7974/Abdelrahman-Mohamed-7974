
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number to calculate the sum of its digits: ");
        int number = scanner.nextInt();


        int sum = 0;


        while (number != 0) {
            int digit = number % 10;
            sum += digit;            
            number /= 10;            
        }

        
        System.out.println("The sum of digits is: " + sum);

        scanner.close();
    }
}

