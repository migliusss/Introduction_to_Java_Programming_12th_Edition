package chapt5;

/*
 * Write a program that simulates flipping a coin two million times 
 * and displays the number of heads and tails. 
 */

public class NumberOfHeadTails {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		
		// A for loop to flip a coin 2000000 times. 
		for (int i = 0; i <= 2000000; i++) {
			int number = (int) (Math.random() * 2); // Generate 0 or 1. 
			
			// If number 0 increase heads. 
			if (number == 0) {
				heads++;
			}
			// If number 1 increase tails. 
			else if (number == 1) {
				tails++;
			}
		}
		
		// Print results. 
		System.out.println("Number of heads: " + heads);
		System.out.println("Number of tails: " + tails);
	}
}
