package chapt6;

import java.util.Scanner;

/*
 * Write a method that finds the number of 
 * occurrences of a specified character in a string using the following header:
 * 
 * public static int count(String str, char a)
 * 
 * For example, count("Welcome", 'e') returns 2. Write a test program that
 * prompts the user to enter a string followed by a character then display the 
 * number of occurrences of the character in the string. 
 */

public class OccurrencesOfCharacter {
	/** Main method. */ 
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		String str = input.next();
		
		System.out.print("Enter a character: ");
		char chr = input.next().charAt(0);
		
		// Display the number of occurrences. 
		System.out.println(count(str, chr));
	}
	
	/** A method to count a occurrences of a specified characters. */
	public static int count(String str, char a) {
		int numberOfCharacters = 0; // Variable for storing number of occurrences. 
		
		// A loop that iterates through the string and checks if a character is equal to the specified character. 
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				numberOfCharacters++;
			}
		}
		
		return numberOfCharacters;
	}
}
