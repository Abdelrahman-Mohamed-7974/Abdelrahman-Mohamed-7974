public class Q2M {
	
	    public static void main(String[] args) {
	        // Declare and initialize a jagged array
	        int[][] jaggedArray = new int[3][];
	        
	        // Initialize each row with different lengths
	        jaggedArray[0] = new int[2];  // First row with 2 elements
	        jaggedArray[1] = new int[4];  // Second row with 4 elements
	        jaggedArray[2] = new int[3];  // Third row with 3 elements

	        // Populate the jagged array with values
	        jaggedArray[0][0] = 1;
	        jaggedArray[0][1] = 2;

	        jaggedArray[1][0] = 3;
	        jaggedArray[1][1] = 4;
	        jaggedArray[1][2] = 5;
	        jaggedArray[1][3] = 6;

	        jaggedArray[2][0] = 7;
	        jaggedArray[2][1] = 8;
	        jaggedArray[2][2] = 9;

	        // Print the jagged array
	        System.out.println("Jagged Array:");

	        for (int i = 0; i < jaggedArray.length; i++) {
	            for (int j = 0; j < jaggedArray[i].length; j++) {
	                System.out.print(jaggedArray[i][j] + " ");
	            }
	            System.out.println();  // Move to the next line after each row
	        }
	    }
	}


