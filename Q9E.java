package courses;

public class Q9E {

	public static void main(String[] args) {
		 int[] numbers = {15, 42, 7, 89, 33};
	       
	        int max = numbers[0]; 
	        
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i]; 
	            }
	        }

	        System.out.println("The maximum element in the array is: " + max);
	}

}
