package chapt5;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter a string and 
 * displays the string in reverse order. 
 */

public class ReverseString {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		String userString = input.next();
		
		System.out.print("The reversed string is ");
		
		// Reverse a string using a loop. 
		for (int i = userString.length() - 1; i >= 0; i--) {
			System.out.print(userString.charAt(i)); // Print each character in reverse order. 
		}
	}
}
