
import java.util.Scanner;

public class Q27 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Collatz sequence for " + number + ":");

            
            while (number != 1) {
                System.out.print(number + " ");
                if (number % 2 == 0) {
                    number /= 2; 
                } else {
                    number = 3 * number + 1;
                }
            }

            
            System.out.println(number);
        }

        scanner.close();
    }
}

