package chapt6;

import java.util.Scanner;

/*
 * Write a method that counts the number of letters in 
 * a string using the following method header: 
 * 
 * public static int countLetters(String s) 
 * 
 * Write a test program that prompts the user to enter a string and displays the 
 * number of letters in the string. 
 */

public class CountLettersInString {
	/** Main method.  */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		
		String s = input.next();
		
		// Display number of letters. 
		System.out.println("Number of letters: " + countLetters(s));
		
	}
	
	/** A method that counts the number of letters in a string. */
	public static int countLetters(String s)  {
		int numberOfLetters = 0;
		
		for (int i = 0; i < s.length(); i++) {
			// Check if a character is a letter. 
			if (Character.isLetter(s.charAt(i))) {
				numberOfLetters++; // If a letter increase the number of letters. 
			}
		}
		
		return numberOfLetters;
	}
}
