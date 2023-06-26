package chapt4;

/*
 * Write a program that prompts the user to enter a letter and 
 * check whether the letter is a vowel or constant. For a nonletter input, display 
 * invalid input. 
 */

import java.util.Scanner;

public class VowelOrConstant {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		
		if (Character.isLetter(letter)) // Check if input is a letter. 
		{
			switch(Character.toUpperCase(letter)) // Convert to uppercase. 
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(letter + " is a vowel"); break;
				default : System.out.println(letter + " is a consonant"); 
			}
		}
		else
			System.out.println(letter + " is an invalid input");
	}
}
