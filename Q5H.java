	import java.util.HashSet;

	public class Q5H {

	    public static void findCommonElements(int[] array1, int[] array2) {
	        HashSet<Integer> set1 = new HashSet<>();
	        HashSet<Integer> commonElements = new HashSet<>();

	        // Add all elements of the first array to the set
	        for (int num : array1) {
	            set1.add(num);
	        }

	        // Check for common elements in the second array
	        for (int num : array2) {
	            if (set1.contains(num)) {
	                commonElements.add(num);
	            }
	        }

	        // Print the common elements
	        System.out.println("Common elements: " + commonElements);
	    }

	    public static void main(String[] args) {
	        // Example arrays
	        int[] array1 = {1, 2, 3, 4, 5, 6};
	        int[] array2 = {4, 5, 6, 7, 8, 9};

	        System.out.println("Array 1: ");
	        for (int num : array1) {
	            System.out.print(num + " ");
	        }
	        System.out.println("\nArray 2: ");
	        for (int num : array2) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Find and print common elements
	        findCommonElements(array1, array2);
	    }
	}


