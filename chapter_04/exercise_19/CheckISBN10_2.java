package chapt4;

/*
 * Rewrite Programming Exercise 3.9 by entering the 
 * ISBN number as a string. 
 */

import java.util.Scanner;

public class CheckISBN10_2 {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String isbn = input.nextLine();
		
		// Extract digits. 
		int digit1 = Integer.parseInt(isbn.substring(0,1));
		int digit2 = Integer.parseInt(isbn.substring(1,2));
		int digit3 = Integer.parseInt(isbn.substring(2,3));
		int digit4 = Integer.parseInt(isbn.substring(3,4));
		int digit5 = Integer.parseInt(isbn.substring(4,5));
		int digit6 = Integer.parseInt(isbn.substring(5,6));
		int digit7 = Integer.parseInt(isbn.substring(6,7));
		int digit8 = Integer.parseInt(isbn.substring(7,8));
		int digit9 = Integer.parseInt(isbn.substring(8));

		// Find the 10th digit. 
		int digit10 = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 
				+ digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
		
		// If else statement to print the 10th digit. 
		if (digit10 <= 9) { 
			System.out.println("The ISBN-10 number is " + isbn + digit10);
		}
		
		else {
			System.out.println("The ISBN-10 number is " + isbn + "X");
		}
		
	}
}
