
public class Q3M {	

	    public static void calculateRowSums(int[][] matrix) {
	        int rows = matrix.length;
	        
	        // Traverse each row and calculate the sum
	        for (int i = 0; i < rows; i++) {
	            int rowSum = 0;
	            
	            // Traverse each column in the row and add the element to rowSum
	            for (int j = 0; j < matrix[i].length; j++) {
	                rowSum += matrix[i][j];
	            }
	            
	            // Print the sum of the current row
	            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
	        }
	    }

	    public static void main(String[] args) {
	        // Example 2D array
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Calculate and print the sum of each row
	        calculateRowSums(matrix);
	    }
	}


