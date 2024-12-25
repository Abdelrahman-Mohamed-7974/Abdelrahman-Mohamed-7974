	import java.util.Scanner;
	public class Q4M {

	    // Method to check if the number exists in the array
	    public static boolean doesExist(int[] arr, int number) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == number) {
	                return true; // Return true if the number is found
	            }
	        }
	        return false; // Return false if the number is not found
	    }

	    public static void main(String[] args) {
	        // Sample array
	        int[] arr = {11, 70, 1, 7, 80, 90};

	        // Input number to search
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to search: ");
	        int number = scanner.nextInt();

	        // Check if the number exists in the array
	        if (doesExist(arr, number)) {
	            System.out.println(number + " exists in the array.");
	        } else {
	            System.out.println(number + " does not exist in the array.");
	        }

	        scanner.close();
	    }
	}