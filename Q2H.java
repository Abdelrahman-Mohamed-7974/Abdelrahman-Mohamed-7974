	import java.util.Arrays;
	public class Q2H {
	

	    public static int findRowWithMaxSum(int[][] matrix) {
	        int maxSum = Integer.MIN_VALUE; // Initialize to a very small value
	        int maxRowIndex = -1; // To store the index of the row with the max sum

	        for (int i = 0; i < matrix.length; i++) {
	            int currentRowSum = 0;
	            // Calculate the sum of the current row
	            for (int j = 0; j < matrix[i].length; j++) {
	                currentRowSum += matrix[i][j];
	            }
	            // Check if the current row sum is greater than maxSum
	            if (currentRowSum > maxSum) {
	                maxSum = currentRowSum;
	                maxRowIndex = i;
	            }
	        }

	        return maxRowIndex;
	    }

	    public static void main(String[] args) {
	        // Example 2D array
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {10, 1, 0},
	            {7, 8, 9}
	        };

	        // Find the row with the maximum sum
	        int maxRowIndex = findRowWithMaxSum(matrix);

	        System.out.println("Matrix:");
	        for (int[] row : matrix) {
	            System.out.println(Arrays.toString(row));
	        }
	        System.out.println("Row with the maximum sum: " + maxRowIndex);
	        System.out.println("Sum of that row: " + Arrays.stream(matrix[maxRowIndex]).sum());
	    }
	}


