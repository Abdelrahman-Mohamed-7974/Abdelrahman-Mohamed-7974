
public class Q26 {
     public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;

           
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i; 
                }
            }

            
            if (sum == num) {
                System.out.println(num); 
            }
        }
    }
}

