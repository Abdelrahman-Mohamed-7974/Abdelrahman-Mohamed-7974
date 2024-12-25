	import java.util.Arrays;

	public class Q8H {
	    public static int[] convertTo1D(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        // Create a single-dimensional array with size equal to total elements
	        int[] result = new int[rows * cols];
	        int index = 0;

	        // Flatten the 2D array into the 1D array
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[index++] = matrix[i][j];
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        // Example 2D array
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        System.out.println("Original 2D Array:");
	        for (int[] row : matrix) {
	            System.out.println(Arrays.toString(row));
	        }

	        // Convert the 2D array to 1D array
	        int[] singleArray = convertTo1D(matrix);

	        System.out.println("\nConverted 1D Array:");
	        System.out.println(Arrays.toString(singleArray));
	    }
	}


