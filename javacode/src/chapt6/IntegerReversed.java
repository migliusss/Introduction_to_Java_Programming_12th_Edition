package chapt6;

import java.util.Scanner;

/*
 * Write a test program that prompts the user to enter an integer then displays its reversal. 
 * For example, reverse(2456) displays 6543.
 */

public class IntegerReversed {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an integer. 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Display results and call a method. 
		reverse(number);
	}

	// Create a method that returns a reversal of a number. 
	public static void reverse (int number) {
		int remainder = 0; 
		int reverse = 0;
		
		// A while loop that loops until the number becomes 0. 
		while (number != 0) {
			remainder = number % 10; // Get the last digit. 
			reverse = reverse * 10 + remainder; // Stores the reverse number. 
			number = number / 10; // Remove the last digit from number until it becomes 0.
		}
		// Print the reversed number. 
		System.out.println(reverse);
	}
}
