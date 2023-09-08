package chapter_07;

import java.util.Scanner;

/*
 * (Count the number of vowels in a string) Write a program that prompts the user to enter 
 * a string, and counts and displays the number of both lowercase and uppercase vowels
 * in the string. 
 */

public class Exercise_07_22 {
	public static void main(String[] args) {
		// Variables for storing the number of lowercase and uppercase vowels. 
		int numberOfLowercaseVowels = 0; 
		int numberOfUppercaseVowels = 0;
		
		// Arrays for storing the vowels. 
		char[] lowercaseVowels = {'a', 'e', 'i', 'o', 'u'};
		char[] uppercaseVowels = {'A', 'E', 'I', 'O', 'U'};
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a String: ");
		
		String userString = input.next();
		
		// 
		for (int i = 0; i < userString.length(); i++) {
			// A loop that compares each letter with vowels. 
			for (int j = 0; j < userString.length(); j++) {
				// If the letter equals the vowel increase the number of lowercase vowels. 
				if (userString.charAt(i) == lowercaseVowels[j]) {
					++numberOfLowercaseVowels;
				}
				// If the letter equals the vowel increase the number of uppercase vowels. 
				else if (userString.charAt(i) == uppercaseVowels[j]) {
					++numberOfUppercaseVowels;
				}
			}
		}
		
		// Display the number of vowels. 
		System.out.println("The number of uppercase vowels: " + numberOfUppercaseVowels);
		System.out.println("The number of lowercase vowels: " + numberOfLowercaseVowels);
	}
}
