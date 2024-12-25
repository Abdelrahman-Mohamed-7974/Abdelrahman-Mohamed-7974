	import java.util.Arrays;

	public class Q7M {

	    public static void main(String[] args) {
	        // Original array
	        int[] sourceArray = {7, 8, 9, 10, 11};

	        // 1. Using System.arraycopy()
	        int[] array1 = new int[sourceArray.length];
	        System.arraycopy(sourceArray, 0, array1, 0, sourceArray.length);

	        // 2. Using Arrays.copyOf()
	        int[] array2 = Arrays.copyOf(sourceArray, sourceArray.length);

	        // 3. Using Manual Loop
	        int[] array3 = new int[sourceArray.length];
	        for (int i = 0; i < sourceArray.length; i++) {
	            array3[i] = sourceArray[i];
	        }

	        // Print the original and copied arrays
	        System.out.println("Original Array: " + Arrays.toString(sourceArray));
	        System.out.println("Copied Array using System.arraycopy: " + Arrays.toString(array1));
	        System.out.println("Copied Array using Arrays.copyOf: " + Arrays.toString(array2));
	        System.out.println("Copied Array using Manual Loop: " + Arrays.toString(array3));
	    }
	}


