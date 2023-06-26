package chapt4;

/*
 * Write a program that receives a character and
 * displays its Unicode. 
 */

import java.util.Scanner;

public class CharacterUnicode {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a character: ");
		
		// Store character in a variable.
		char ch = input.nextLine().charAt(0);
		
		// Display the results by casting character to an integer. 
		System.out.println("The Unicode for the character " + ch + " is " + ((int)ch));
	}
}
