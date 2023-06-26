package chapt5;

import java.util.Scanner;

/*
 * Assume the letters A, E, I, O, and U are vowels. 
 * Write a program that prompts the user to enter a string, and displays the 
 * number of vowels and consonants in the string. 
 */

public class CountVowelsConsonants {
	public static void main(String[] args) {
		int vowels = 0;
		int consonants = 0;
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		
		// Get input.
		String userString = input.nextLine();
		
		// Convert string to uppercase. 
		userString.toUpperCase();
		
		// Check if a character is a consonant. 
		for (int i = 0; i < userString.length(); i++) {
			if (Character.isLetter(userString.charAt(i))) {
				if (Character.toUpperCase(userString.charAt(i)) == 'A' ||
						Character.toUpperCase(userString.charAt(i)) == 'E' ||
						Character.toUpperCase(userString.charAt(i)) == 'I' ||
						Character.toUpperCase(userString.charAt(i)) == 'O' ||
						Character.toUpperCase(userString.charAt(i)) == 'U') {
					vowels++;
				}
				else if(userString.charAt(i) != ' ') {
						consonants++;
				}
			}
		}
		
		// Print results. 
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
		
	}
}
