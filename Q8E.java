package courses;

public class Q8E {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        
	        System.out.println("Elements of the 3x3 matrix:");
	        for (int i = 0; i < matrix.length; i++) { 
	            for (int j = 0; j < matrix[i].length; j++) { 
	                System.out.print(matrix[i][j] + " "); 
	            }
	            System.out.println(); 
	        }

	}

}