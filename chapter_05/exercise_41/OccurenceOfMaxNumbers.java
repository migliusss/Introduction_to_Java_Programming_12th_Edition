package chapt5;

import java.util.Scanner;

/*
 * Write a program that reads integers, finds the largest
 * of them, and counts its occurrences. Assume the input ends with number 0.
 * Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest number is 5 and 
 * the occurrence count for 5 is 4. If no input is entered, display "No numbers are
 * entered except 0".
 * 
 * (Hint: Maintain two variables, max and count. max stores the current max
 * number and count stores its occurrences. Initially, assign the first number to
 * max and 1 to count. Compare each subsequent number with max. If the number
 * is greater than max, assign it to max and reset count to 1. If the number is 
 * equal to max, increment count by 1).
 */

public class OccurenceOfMaxNumbers {
	public static void main(String[] args) {
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter numbers: ");
		int userNumber = input.nextInt();
		
		int max = 0; 
		int count = 0; 
		
		// A loop that allows the user to enter numbers until user enters 0. 
		while (userNumber != 0) {
			// If the user enters no number. 
			if (userNumber == 0) {
				System.out.println("No numbers are entered except 0");
			}
			// If the number is higher than max number assign to max and reset count to 1. 
			else if (userNumber > max) {
				max = input.nextInt();
				count = 1;
			}
			// If number is equal to max, increment count by 1. 
			else if (userNumber == max) {
				count++;
			}
			
			// Get the new input. 
			userNumber = input.nextInt();
		}
		
		// Print results. 
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}
}
