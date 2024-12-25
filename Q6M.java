public class Q6M {
	
	    // Method to transpose a 2D array (matrix)
	    public static int[][] transpose(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        
	        // Create a new matrix to store the transposed result
	        int[][] transposed = new int[cols][rows];

	        // Perform the transpose operation
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transposed[j][i] = matrix[i][j];
	            }
	        }
	        
	        return transposed;
	    }

	    // Method to print a matrix
	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Sample 2D array (matrix)
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Print the original matrix
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        // Transpose the matrix
	        int[][] transposedMatrix = transpose(matrix);

	        // Print the transposed matrix
	        System.out.println("Transposed Matrix:");
	        printMatrix(transposedMatrix);
	    }
	}


