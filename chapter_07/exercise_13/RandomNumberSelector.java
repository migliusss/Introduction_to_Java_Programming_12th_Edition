package chapt7;

/*
 * Write a method that returns a random number from a 
 * list of numbers passed in the argument. The method header is specified as follows:
 * 
 * public static int getRandom(int[] numbers)
 */

public class RandomNumberSelector {
	/** Main method. */
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Display a random number by invoking the method. 
		System.out.print(getRandom(numbers));
	}
	
	/** Method for returning a random number */ 
	public static int getRandom(int[] numbers) {
		// Generate a random number from 0 - length of an array. 
		int randomIndex = (int) (Math.random() * numbers.length); 
		
		// Return a random number from a list of numbers. 
		return numbers[randomIndex];
	}
}
