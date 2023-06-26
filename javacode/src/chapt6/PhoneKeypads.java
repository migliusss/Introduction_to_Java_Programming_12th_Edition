package chapt6;

import java.util.Scanner;

/*
 * The international standard letter/number mapping for 
 * telephones is given in Programming Exercise 4.15. Write a method that returns a 
 * number, given an uppercase letter, as follows: 
 * 
 * public static int getNumber(char uppercaseLetter)
 * 
 * Write a test program that prompts the user to enter a phone number as a string. 
 * The input number may contain letters. The program translates a letter (uppercase 
 * or lowercase) to a digit and leaves all other characters intact. 
 */

public class PhoneKeypads {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		
		String string = input.next();
				
		for (int i = 0; i < string.length(); i++) {
			// If a character is a letter use the method to get the number. 
			if (Character.isLetter(string.charAt(i))) {
				System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
			}
			// Else display the characters. 
			else {
				System.out.print(string.charAt(i));
			}
		}
	}
	
	/** A method that returns a number, given an uppercase letter. */
	public static int getNumber(char uppercaseLetter) {
		int number = 0;
		
		switch(uppercaseLetter) { 
		case 'A': 
		case 'B': 
		case 'C': number = 2; break;
		
		case 'D':
		case 'E': 
		case 'F': number = 3; break;
		
		case 'G': 
		case 'H': 
		case 'I': number = 4; break;
		
		case 'J': 
		case 'K': 
		case 'L': number = 5; break;
		
		case 'M': 
		case 'N': 
		case 'O': number = 6; break;
	
		case 'P': 
		case 'Q': 
		case 'R': 
		case 'S': number = 7; break;
		
		case 'T': 
		case 'U': 
		case 'V': number = 8; break;
		 
		case 'W': 
		case 'X': 
		case 'Y': 
		case 'Z': number = 9; break;
		}
		
		return number;
	}
}
