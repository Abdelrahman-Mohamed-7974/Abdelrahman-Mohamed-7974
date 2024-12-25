public class Q6H {
	
	    public static boolean areIdentical(int[][] array1, int[][] array2) {
	        // Check if the dimensions of both arrays are the same
	        if (array1.length != array2.length) {
	            return false;
	        }
	        
	        for (int i = 0; i < array1.length; i++) {
	            if (array1[i].length != array2[i].length) {
	                return false;
	            }
	            // Compare elements row by row
	            for (int j = 0; j < array1[i].length; j++) {
	                if (array1[i][j] != array2[i][j]) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        // Example 2D arrays
	        int[][] array1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] array2 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] array3 = {
	            {1, 2, 3},
	            {4, 0, 6},
	            {7, 8, 9}
	        };

	        // Compare array1 and array2
	        System.out.println("Array1 and Array2 are identical: " + areIdentical(array1, array2));

	        // Compare array1 and array3
	        System.out.println("Array1 and Array3 are identical: " + areIdentical(array1, array3));
	    }
	}


