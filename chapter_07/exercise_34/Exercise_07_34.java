package chapter_07;

import java.util.Scanner;

/*
 * (Sort characters in a string) Write a method that returns a sorted string using the 
 * following header:                                                    
 *                                                                                
 * public static String sort(String s)                                            
 *                                                                                
 * For example, sort("acb") returns abc.   
 *                                        
 * Write a test program that prompts the user to enter a string and displays the sorted 
 * string.  
 */

public class Exercise_07_34 {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a string: ");
		String s = input.next();
		
		// Display the sorted string. 
		System.out.println(sort(s));
	}
	
	/** Method that returns a sorted string. **/
	public static String sort(String s) {
		// Create an array for storing characters. 
		char[] characters = new char[s.length()];
		
		// Assign characters in the String to the new array. 
		for (int i = 0; i < characters.length; i++) {
			characters[i] = s.charAt(i);
		}
		
		// Sort the array. 
		for (int i = 0; i < characters.length; i++) {
			for (int j = i + 1; j < characters.length; j++) {
				if (characters[i] > characters[j]) {
					char tempCharacter = characters[i];
					characters[i] = characters[j];
					characters[j] = tempCharacter;
				}
			}
		}
		// Create a new String to store a sorted String. 
		String sortedString = "";
		
		// Assign characters to the new String. 
		for (int i = 0; i < characters.length; i++) {
			sortedString += characters[i];
		}
		
		return sortedString;
	}
}
