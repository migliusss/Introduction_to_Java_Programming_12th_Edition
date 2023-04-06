/*
 * Write a program that prompts the user to enter two positive integers
 * and displays the gcd. 
 */

package chapt5;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		
		int gcd = 0; // Create a variable for greatest common divisor. 
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers.
		System.out.print("Enter the first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int number2 = input.nextInt();
	
		// The starting gcd is the lowest number. 
		if (number1 < number2) {
			gcd = number1;
		}
		else {
			gcd = number2;
		}
		
		// Create a while loop that runs until it find the gcd for both numbers. 
		while (number1 % gcd != 0 || number2 % gcd != 0) {
			gcd--;
		}
		
		// Display results. 
		System.out.println("The greatest common divisor for " + number1 + " " 
				+ number2 + " is " + gcd);
	}
}
