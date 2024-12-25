	import java.util.Arrays;
	public class Q9H {
	
	    public static void spiralPrint(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int top = 0, bottom = rows - 1;
	        int left = 0, right = cols - 1;

	        System.out.println("Spiral Order of the Matrix:");
	        while (top <= bottom && left <= right) {
	            // Traverse from left to right along the top row
	            for (int i = left; i <= right; i++) {
	                System.out.print(matrix[top][i] + " ");
	            }
	            top++;

	            // Traverse from top to bottom along the right column
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(matrix[i][right] + " ");
	            }
	            right--;

	            // Traverse from right to left along the bottom row (if applicable)
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    System.out.print(matrix[bottom][i] + " ");
	                }
	                bottom--;
	            }

	            // Traverse from bottom to top along the left column (if applicable)
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(matrix[i][left] + " ");
	                }
	                left++;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Example 2D matrix
	        int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };

	        System.out.println("Original Matrix:");
	        for (int[] row : matrix) {
	            System.out.println(Arrays.toString(row));
	        }

	        // Print the matrix in spiral order
	        spiralPrint(matrix);
	    }
	}


