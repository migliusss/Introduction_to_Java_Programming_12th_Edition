package chapt6;

import java.util.Scanner;

/*
 * Use the reverse method to implemet isPalindrome. 
 * A number is a palindrome if its reversal is the same as itself. 
 * 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is
 * a palindrome. 
 */

public class PalindromeInteger {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Display results by calling a method. 
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		}
		else {
			System.out.println(number + " is not a palindrome.");
		}
	}
	// Return true if number is a palindrome. 
	public static boolean isPalindrome(int number) {
		// Check if the number is reversal. 
		if (reverse(number) == number) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// Return a reversal of an integer e.g., reverse(456) returns 654.
	public static int reverse(int number) {
		int reverse = 0;
		int remainder = 0;
		
		// A while loop that loops until the number becomes 0. 
		while (number != 0) { 
			remainder = number % 10; // Get the last digit. 
			reverse = reverse * 10 + remainder; // Stores the reverse number. 
			number = number / 10; // Remove the last digit from number until it becomes 0. 
		}
		
		return reverse;
	}

	
}
