package chapt5;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter two 
 * strings and displays the largest common prefix of the two strings. 
 */

public class LongestCommonPrefix {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user and store input in variables. 
		System.out.print("Enter the first string: ");
		String stringOne = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String stringTwo = input.nextLine();
		
		String prefix = ""; // Initialize prefix variable. 
		int index = 0; // Initialize index variable. 
		
		// Find the longest common prefix using a while loop that loops through each character. 
		while(stringOne.charAt(index) == stringTwo.charAt(index)) {
			prefix += stringOne.charAt(index);
			
			index++;
		}
		
		// Display results. 
		if (prefix.length() > 0) {
			System.out.println("The common prefix is " + prefix);
		}
		else {
			System.out.println(stringOne + " and " + stringTwo + " have no common prefix");
		}
	}
}
