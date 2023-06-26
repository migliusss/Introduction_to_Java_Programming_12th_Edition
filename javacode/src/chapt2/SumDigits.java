package chapt2;

import java.util.Scanner;

/*
 * Write a program that reads an integer between 0 and 1000
 * and adds all the digits in the integer. 
 */

public class SumDigits {
	public static void main(String[] args) {
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user.
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		// Extract digits. For example number = ABC.
		int number1 = number % 10; // ABC = C
		int number2 = (number / 10) % 10; // AB = B
		int number3 = (number / 100) % 10; // A = A
		
		// Sum the digits.
		int sum = number1 + number2 + number3;
		
		// Display results.
		System.out.println("The sum of the digits is " + sum);
	}
}
