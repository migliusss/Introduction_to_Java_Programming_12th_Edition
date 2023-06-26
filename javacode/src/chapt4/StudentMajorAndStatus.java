package chapt4;

/*
 * Write a program that prompts the user to enter two 
 * characters and displays the major and status represented in the characters. The
 * first character indicates the major and the second is number character 1, 2, 3, 4, 
 * which indicates whether a student is a freshman, sophomore, junior or senior. 
 * Suppose the following characters are used to denote the majors: 
 * 
 * I: Information Management
 * C: Computer Science
 * A: Accounting 
 * 
 */

import java.util.Scanner;

public class StudentMajorAndStatus {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter two characters: ");
		String twoCharacters = input.nextLine();
		
		char letter = Character.toUpperCase(twoCharacters.charAt(0)); // Get the first character. 
		char digit = twoCharacters.charAt(1); // Get the second character. 
		
		// If else statements to print major and status. 
		if (letter == 'I') {
			System.out.print("Information Management ");
			
			switch(digit) {
			case '1': System.out.print("Freshman"); break;
			case '2': System.out.print("Sophmore"); break;
			case '3': System.out.print("Junior"); break;
			case '4': System.out.print("Senior"); break;
			}
		}
		else if (letter == 'C') {
			System.out.print("Computer Science ");
			
			switch(digit) {
			case '1': System.out.print("Freshman"); break;
			case '2': System.out.print("Sophmore"); break;
			case '3': System.out.print("Junior"); break;
			case '4': System.out.print("Senior"); break;
			}
		}
		else if (letter == 'A') {
			System.out.print("Accounting ");
			
			switch(digit) {
			case '1': System.out.print("Freshman"); break;
			case '2': System.out.print("Sophmore"); break;
			case '3': System.out.print("Junior"); break;
			case '4': System.out.print("Senior"); break;
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
