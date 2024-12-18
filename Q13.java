
public class Q13 {
     public static void main(String[] args){
         System.out.print("Enter a number : ");
        int number = scanner.nextInt();

       
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        
        if (num <= 1) {
            return false;
        }

 
        for (int i = 2; i <= Math.sqrt(num); i=i+1) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}
     
    

