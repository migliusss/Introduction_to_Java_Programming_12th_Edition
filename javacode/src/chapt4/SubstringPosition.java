package chapt4;

/*
 * Write a program that prompts the user to enter two 
 * strings, and reports whether the second string begins the first string. 
 */

import java.util.Scanner;

public class SubstringPosition {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter string s1: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter string s2: ");
		String s2 = input.nextLine();
		
		// Check if both strings start the same. 
		if (s1.startsWith(s2)) {
			System.out.println(s2 + " is a prefix of " + s1);
		}
		else {
			System.out.println(s2 + " is not a prefix of " + s1);
		}
	}
}
