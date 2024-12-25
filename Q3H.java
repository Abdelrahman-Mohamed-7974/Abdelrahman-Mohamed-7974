	import java.util.HashSet;
	public class Q3H {
	
	    public static void findPairs(int[] arr, int targetSum) {
	        HashSet<Integer> seenNumbers = new HashSet<>();
	        boolean pairFound = false;

	        System.out.println("Pairs with sum " + targetSum + ":");
	        for (int num : arr) {
	            int complement = targetSum - num;
	            // Check if the complement exists in the set
	            if (seenNumbers.contains(complement)) {
	                System.out.println("(" + complement + ", " + num + ")");
	                pairFound = true;
	            }
	            // Add the current number to the set
	            seenNumbers.add(num);
	        }

	        if (!pairFound) {
	            System.out.println("No pairs found.");
	        }
	    }

	    public static void main(String[] args) {
	        // Example array
	        int[] array = {2, 4, 3, 7, 8, -1, 5, 1};
	        int targetSum = 6;

	        // Find and print pairs
	        findPairs(array, targetSum);
	    }
	}



