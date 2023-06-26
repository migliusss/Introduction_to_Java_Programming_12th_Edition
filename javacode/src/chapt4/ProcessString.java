package chapt4;

/*
 * Write a program that prompts the user to enter a string and 
 * displays its length and its last character. 
 */

import java.util.Scanner;

public class ProcessString {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		// Print string length and last character. 
		System.out.println("The lenght of " + str + " is " + str.length());
		System.out.print("The last character of " + str + " is " + str.charAt((str.length()-1)));
	}
}
