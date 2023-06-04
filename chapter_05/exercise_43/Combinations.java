package chapt5;

/*
 * Write a program that displays all possible combinations 
 * for picking two numbers from integers 1 to 7. Also display the total number of 
 * all combinations. 
 */

public class Combinations {
	public static void main(String[] args) {
		int numberOfCombinations = 0; // Variable for storing number of combinations. 
		// Outer loop for each number that has an inner loop to find all combinations. 
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j<= 7; j++) {
				// Increment the number of combinations for each iteration. 
				numberOfCombinations++;
				// Display the combination.
				System.out.println(i + " " + j);
			}
		}
		
		// Display the number of combinations. 
		System.out.println("The total number of all combinations is 21.");
	}
}
