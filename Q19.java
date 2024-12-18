
public class Q19 {
     public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500 are:");


        for (int number = 1; number <= 500; number++) {
            int originalNumber = number;
            int sum = 0;
            int digits = 0;

   
            int temp = originalNumber;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            
            temp = originalNumber;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

           
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}

