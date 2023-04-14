package chapt6;

import java.util.Scanner;

/* Write a method that computes the sum of the digits in an integer. 
 * For example, sumDigits(234) returns 9 (= 2 + 3 + 4). 
 * Write a test program that prompts the user to enter an integer then displays the sum of all its digits. 
 */

public class SumDigits {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user.
		System.out.print("Enter an integer: ");
		long number = input.nextLong();
		
		// Display results and call a method.
		System.out.print("Sum of " + number + " is: " + sumDigits(number));
	}
	
	// Create a method. 
	public static int sumDigits(long n) {
		int sum = 0;
		long extractedNumber = 0;
		
		// Create a for loop to extract numbers. 
		for (int i = 1; i <= n; i *= 10) {
			// Extract digits. For example number = ABC.
			extractedNumber = (n / i) % 10; // ABC = C; AB = B; A;
			// Sum the digits. 
			sum += extractedNumber;
		}
		
		return sum;
	}
	
}
