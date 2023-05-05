package chapt3;

/*
 * Write a program that prompts the user to enter the first 9 digits and 
 * displays the 10-digit ISBN (including leading zeros). Your program should read 
 * the input
 */

import java.util.Scanner;

public class CheckISBN10 {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int digits = input.nextInt();
		
		// Extract the last digit to calculate the 10th digit. 
		int digit9 = digits % 10;
		int remainder = digits / 10; 
		
		int digit8 = remainder % 10;
		remainder = digits / 100;
		
		int digit7 = remainder % 10;
		remainder = digits / 1000;
		
		int digit6 = remainder % 10;
		remainder = digits / 10000;
		
		int digit5 = remainder % 10;
		remainder = digits / 100000;
		
		int digit4 = remainder % 10;
		remainder = digits / 1000000;
		
		int digit3 = remainder % 10;
		remainder = digits / 10000000;
		
		int digit2 = remainder % 10;
		remainder = digits / 100000000;
		
		int digit1 = remainder % 10;
		
		// Find the 10th digit using a formula in the book. 
		int tenDigit = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 
				+ digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
		
		// Print ISBN with the 10th digit. 
		if (tenDigit <= 9) { 
			System.out.println("The ISBN-10 number is " + digits + tenDigit);
		}
		// If 10th digit is higher than 10 then print X as the last number. 
		else {
			System.out.println("The ISBN-10 number is " + digits + "X");
		}
	}
}
