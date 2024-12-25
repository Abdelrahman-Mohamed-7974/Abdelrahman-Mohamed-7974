	import java.util.HashMap;
	import java.util.Map;

	public class Q5M {

	    // Method to count the occurrences of each number
	    public static void countOccurrences(int[] arr) {
	        // Create a HashMap to store the frequency of each element
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Traverse the array and update the frequency in the map
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Print the occurrences of each number
	        System.out.println("Occurrences of each number:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        // Sample array
	        int[] arr = {12, 35, 1, 10, 34, 1, 12, 35, 12};

	        // Call method to count occurrences
	        countOccurrences(arr);
	    }
	}


