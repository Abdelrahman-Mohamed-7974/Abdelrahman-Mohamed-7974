package courses;

public class Q10E {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
       
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
       
        System.out.println("Reversed array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }	}

}
