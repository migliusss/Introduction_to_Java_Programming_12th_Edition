package chapt6;

import java.util.Scanner;

/*
 * Some websites impose certain rules for passwords. Write a 
 * method that checks whether a string is a valid password. Suppose the password 
 * rules are as follows: 
 * 
 * A password must have at least ten characters. 
 * A password consists of only letters and digits. 
 * A password must contain at least three digits. 
 * 
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise. 
 */

public class CheckPassword {
	/* Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.println("Enter a password: ");
		String password = input.nextLine();
		
		// Check the password. 
		checkPassword(password);
	}
	
	/* A method for checking if a password is valid. */ 
	public static void checkPassword(String password) {
		int digits = 0; // A variable to hold the number of digits in the password. 
		
		// 1. Check if the password has at least 10 characters. 
		if (password.length() >= 10) {
			// 2. If true check if each character is a digit or a letter using a for loop that iterates through each character. 
			for (int i = 0; i < password.length(); i++) {
				if (Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))) {
					// 3. If the character is a digit add increment the number of digits in the password. 
					if (Character.isDigit(password.charAt(i))) {
						digits++;
					}
				}
				// 4. If the character is not a digit or a letter break the loop and display a message. 
				else {
					System.out.println("Invalid Password");
					break;
				}
			}
			// 5. Check whether the password contains more than 3 characters. 
			if (digits >= 3) {
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Invalid Password");
			}
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}
