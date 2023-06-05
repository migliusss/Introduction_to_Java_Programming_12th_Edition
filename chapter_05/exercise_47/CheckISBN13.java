package chapt5;

import java.util.Scanner;

/*
 * ISBN - 13 is a new standard for identifying books it
 * uses 13 digits d1 d2 d3 d4 d5 d6 d7 d8 d9 d10 d11 d12 d13. The last digit 
 * d13 is a checksum, which is calculated from the other digits using the following formula: 
 * 
 * 10 - (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13) % 10
 * 
 * If the checksum is 10, replace it with 0. Your program should read the input as a 
 * string. Display "invalid input if the input is invalid. 
 */

public class CheckISBN13 {
	public static void main(String[] args) {
		int checksum = 0;
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbnNumber = input.next();
		
		// Check if the input contains 12 characters. 
		if (isbnNumber.length() != 12) {
			System.out.println(isbnNumber + " is an invalid input");
		}
		
		// A for loop that adds a number to check sum. 
		for (int i = 0; i < 12; i++){	
			if (i % 2 == 0) {
				checksum += Integer.parseInt(isbnNumber.charAt(i) + "") * 3;
			}
			else {
				checksum += Integer.parseInt(isbnNumber.charAt(i) + "");
			}
		}
		
		// Calculate checksum. 
		checksum = 10 - checksum % 10;
		
		// If else statement that checks if the checksum is 10, then print 0. Otherwise print checksum. 
		if (checksum == 10) {
			System.out.println("The ISBN-13 number is " + isbnNumber + 0);
		}
		else {
			System.out.println("The ISBN-13 number is " + isbnNumber + checksum);
		}
	}
}
