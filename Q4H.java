public class Q4H {
	
	    public static int calculateDeterminant(int[][] matrix) {
	        // Ensure the matrix is 3x3
	        if (matrix.length != 3 || matrix[0].length != 3) {
	            throw new IllegalArgumentException("Matrix must be 3x3.");
	        }

	        // Formula for determinant of a 3x3 matrix:
	        // det(A) = a(ei − fh) − b(di − fg) + c(dh − eg)
	        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
	        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
	        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

	        return a * (e * i - f * h) 
	             - b * (d * i - f * g) 
	             + c * (d * h - e * g);
	    }

	    public static void main(String[] args) {
	        // Example 3x3 matrix
	        int[][] matrix = {
	            {6, 1, 1},
	            {4, -2, 5},
	            {2, 8, 7}
	        };

	        System.out.println("Matrix:");
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }

	        // Calculate and print the determinant
	        int determinant = calculateDeterminant(matrix);
	        System.out.println("Determinant: " + determinant);
	    }
	}


