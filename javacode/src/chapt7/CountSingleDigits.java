package chapt7;

/*
 * Write a program that generates 200 random integers between 0 and 9 and displays the count for each number. 
 * (Hint: Use an array of ten integers, say counts, to store the counts, for the number 
 * of 0s, 1s, ..., 9s.)
 */

public class CountSingleDigits {
	public static void main(String[] args) {
		int randomNumber; 
		int[] counts = new int[10]; // An array that counts occurrences of the numbers from 0-9.
		
		// A loop for generating 200 random integers. 
		for (int i = 1; i <= 200; i++) {
			randomNumber = (int) (Math.random() * 10); // Generate random integer. 
			
			counts[randomNumber]++; // Increase the count for the number. 
		}
		
		// Display results.
		for (int i = 0; i < counts.length; i++) {
			System.out.println("The number of occurrences of " + i + ": " + counts[i]);
		}
	}
}
