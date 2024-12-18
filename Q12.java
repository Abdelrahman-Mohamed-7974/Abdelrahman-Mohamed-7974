
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int number = scanner.nextInt();

       
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
           
            long factorial = 1;

            for (int i = 1; i <= number; i=i+1) {
                factorial *= i; 
            }

         
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

       
        scanner.close();
    }
}
