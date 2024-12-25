public class Q7H {
	
	    public static int findMaxSumSubmatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int maxSum = Integer.MIN_VALUE;

	        // Temporary array to store column sums
	        for (int top = 0; top < rows; top++) {
	            int[] colSum = new int[cols];

	            // Iterate through all row ranges starting from 'top'
	            for (int bottom = top; bottom < rows; bottom++) {
	                // Update column sums for the current row range
	                for (int col = 0; col < cols; col++) {
	                    colSum[col] += matrix[bottom][col];
	                }

	                // Apply Kadane's algorithm on the column sums
	                int currentMax = kadane(colSum);
	                maxSum = Math.max(maxSum, currentMax);
	            }
	        }

	        return maxSum;
	    }

	    // Kadane's algorithm to find the maximum sum of a 1D array
	    private static int kadane(int[] arr) {
	        int maxEndingHere = 0, maxSoFar = Integer.MIN_VALUE;

	        for (int num : arr) {
	            maxEndingHere = Math.max(num, maxEndingHere + num);
	            maxSoFar = Math.max(maxSoFar, maxEndingHere);
	        }

	        return maxSoFar;
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, -1, -4, -20},
	            {-8, -3, 4, 2, 1},
	            {3, 8, 10, 1, 3},
	            {-4, -1, 1, 7, -6}
	        };

	        System.out.println("Maximum sum of submatrix: " + findMaxSumSubmatrix(matrix));
	    }
	}


