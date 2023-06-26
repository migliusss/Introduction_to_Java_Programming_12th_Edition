package chapt4;

/*
 * Write a program that receives a character and 
 * displays its ASCII code (and integer between 0 and 127). 
 */

import java.util.Scanner;

public class CharacterASCII {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a character: ");
		
		// Store character in a variable. 
		char ch = input.nextLine().charAt(0);
		
		// Display the results by casting character to an integer. 
		System.out.println("The ASCII code for character " + ch + " is " + ((int)ch));
	}
}
