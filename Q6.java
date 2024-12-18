
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the first number");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number ");
        int num2 = scanner.nextInt();

        int largest = 0;

        if (num1 >= num2) {
            largest = num1;
        } else if (num2 >= num1 ) {
            largest = num2;
        } else {
            System.out.print("num1=num2");
        }

        
        System.out.println("The Largest Number" + largest);

       
        scanner.close();
    }
}
    
    