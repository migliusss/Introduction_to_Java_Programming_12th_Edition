package chapt5;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter a string and displays the characters at 
 * even positions.
 */

public class ProcessString {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		
		// Get input. 
		String userString = input.nextLine();
		
		// Print the characters using a loop. 
		for (int i = 1; i < userString.length(); i+=2) {
			System.out.print(userString.charAt(i));
		}
	}
}
