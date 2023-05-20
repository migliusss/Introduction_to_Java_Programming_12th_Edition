package chapt4;

/*
 * The international standard letter/number mapping found on the 
 * telephone is shown below. 
 * 
 * Write a program that prompts the user to enter a lowercase or uppsercase letter 
 * and displays its corresponding number. For a nonletter input, display invalid
 * input. 
 */

import java.util.Scanner;

public class PhoneKeyPads {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input. 
		System.out.print("Enter a letter: ");
		char ch = input.nextLine().charAt(0);
		
		// Check if the input is a letter and in uppercase. 
		if (Character.isLetter(ch) && (Character.isUpperCase(ch))) {
			switch(ch) { 
			case 'A': 
			case 'B': 
			case 'C': System.out.println("The corresponding number is 2"); break;
			
			case 'D':
			case 'E': 
			case 'F': System.out.println("The corresponding number is 3"); break;
			
			case 'G': 
			case 'H': 
			case 'I': System.out.println("The corresponding number is 4"); break;
			
			case 'J': 
			case 'K': 
			case 'L': System.out.println("The corresponding number is 5"); break;
			
			case 'M': 
			case 'N': 
			case 'O': System.out.println("The corresponding number is 6"); break;
		
			case 'P': 
			case 'Q': 
			case 'R': 
			case 'S': System.out.println("The corresponding number is 7"); break;
			
			case 'T': 
			case 'U': 
			case 'V': System.out.println("The corresponding number is 8"); break;
			 
			case 'W': 
			case 'X': 
			case 'Y': 
			case 'Z': System.out.println("The corresponding number is 9"); break;
			}
		}
		// Check if the input is a letter and in lowercase.
		else if (Character.isLetter(ch) && (Character.isLowerCase(ch))) {
			switch(ch) {
			case 'a': 
			case 'b': 
			case 'c': System.out.println("The corresponding number is 2"); break;
			
			case 'd': 
			case 'e': 
			case 'f': System.out.println("The corresponding number is 3"); break;
			 
			case 'g': 
			case 'h': 
			case 'i': System.out.println("The corresponding number is 4"); break;
			
			case 'j': 
			case 'k': 
			case 'l': System.out.println("The corresponding number is 5"); break;
			
			case 'm': 
			case 'n': 
			case 'o': System.out.println("The corresponding number is 6"); break;
		
			case 'p': 
			case 'q': 
			case 'r': 
			case 's': System.out.println("The corresponding number is 7"); break;
			
			case 't': 
			case 'u': 
			case 'v': System.out.println("The corresponding number is 8"); break;
			
			case 'w': 
			case 'x': 
			case 'y': 
			case 'z': System.out.println("The corresponding number is 9"); break;
			}
		}
		else {
			System.out.println(ch + " is an invalid input");
		}
		
	}
}
