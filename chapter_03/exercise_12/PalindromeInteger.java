package chapt3;

/*
 * Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome 
 * if it reads the same from right to left and from left to right. A negative integer is 
 * treated the same as a positive integer. 
 */

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a three-digit integer: ");
		int threeDigits = input.nextInt();
		
		// Extract the first digit.
		int digit1 = threeDigits / 100;
		
		// Extract the last digit.
		int digit3 = threeDigits % 10;
		
		// Print results. 
		if (digit1 == digit3) {
			System.out.println(threeDigits + " is a palindrome");
		}
		else {
			System.out.println(threeDigits + " is not a palindrome");
		}
		
	}
}
