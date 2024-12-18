
public class Q28 {
    public static void main(String[] args) {
        int sum = 0;

       
        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                sum += number; 
            }
        }

        System.out.println("The sum of all prime numbers between 1 and 100 is: " + sum);
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}

