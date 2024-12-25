
public class Q9M {
	
	    // Method to print diagonal elements of a square matrix
	    public static void printDiagonals(int[][] matrix) {
	        int n = matrix.length;

	        System.out.println("Primary Diagonal Elements:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(matrix[i][i] + " ");  // Primary diagonal (i == j)
	        }

	        System.out.println("\nSecondary Diagonal Elements:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(matrix[i][n - 1 - i] + " ");  // Secondary diagonal (i == n - 1 - j)
	        }
	    }

	    public static void main(String[] args) {
	        // Example square matrix
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Print the diagonal elements
	        printDiagonals(matrix);
	    }
	}


