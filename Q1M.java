public class Q1M {
	
	    public static int findSecondLargest(int[] arr) {
	        int n = arr.length;

	        // Check if there are at least two elements
	        if (n < 2) {
	            System.out.println("Array must have at least two elements");
	            return -1;
	        }

	        // Initialize two variables to store the largest and second largest elements
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        // Traverse the array to find the largest and second largest elements
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        // Check if there is no second largest element
	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element.");
	            return -1;
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] arr = {18, 55, 7, 10, 11, 100};

	        int secondLargest = findSecondLargest(arr);
	        if (secondLargest != -1) {
	            System.out.println("Second largest element is: " + secondLargest);
	        }
	    }
	}


