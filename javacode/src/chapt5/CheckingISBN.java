package chapt5;

import java.util.Scanner;

/*
 * Use loops to simplify Programming Exercise 3.9.
 */

public class CheckingISBN {
	public static void main(String[] args) {
		int tenDigit = 0;
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		String digits = input.next();
		
		for (int i = 0; i < 9; i++){	
			// Find the 10th digit using a formula in the book, by extracting the last digit. 
			tenDigit += Integer.parseInt(digits.charAt(i) + "") * (i + 1);
		}
		
		// Print ISBN with the 10th digit. 
		if ((tenDigit % 11) <= 9) { 
			System.out.println("The ISBN-10 number is " + digits + (tenDigit % 11));
		}
		// If 10th digit is higher than 10 then print X as the last number. 
		else {
			System.out.println("The ISBN-10 number is " + digits + "X");
		}
	}
}
