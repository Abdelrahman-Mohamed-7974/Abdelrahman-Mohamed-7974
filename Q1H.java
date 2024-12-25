
	import java.util.Arrays;
	public class Q1H {
	

	    public static void rotateArray(int[] arr, int k) {
	        int n = arr.length;
	        k = k % n; // Ensure k is within bounds of the array length
	        if (k < 0) {
	            k += n; // Handle negative rotations
	        }
	        
	        // Step 1: Reverse the entire array
	        reverseArray(arr, 0, n - 1);
	        // Step 2: Reverse the first k elements
	        reverseArray(arr, 0, k - 1);
	        // Step 3: Reverse the remaining elements
	        reverseArray(arr, k, n - 1);
	    }

	    private static void reverseArray(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3; // Number of positions to rotate

	        System.out.println("Original array: " + Arrays.toString(array));
	        rotateArray(array, k);
	        System.out.println("Rotated array: " + Arrays.toString(array));
	    }
	}


