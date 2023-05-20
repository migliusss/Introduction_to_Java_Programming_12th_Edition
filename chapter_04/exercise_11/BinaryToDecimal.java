package chapt4;

/*
 * Write a program that prompts the user to enter binary digits  
 * and displays its corresponding decimal value. 
 */

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter binary digits (0000 to 1111): ");
		String binary = input.nextLine();
		
		// Get decimal value. 
		int decimal = Integer.parseInt(binary, 2);
		
		// Display results. 
		System.out.println("The decimal value is " + decimal);
	}
}
