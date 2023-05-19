package chapt3;

/*
 * Write a program that prompts the user to 
 * enter an integer and determines whether it is divisible by 4 and 5, whether it is
 * divisible by 4 or 5, and whether it is divisible by 4 or 5 but not both. 
 */

import java.util.Scanner;

public class DivisibleByFiveOrFour {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		// Prompt the user. 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Check if true or false and display results. 
		System.out.println("Is " + number + " divisible by 4 and 5? " + (number % 4 == 0 && number % 5 == 0));
		System.out.println("Is " + number + " divisible by 4 and 5? " + (number % 4 == 0 || number % 5 == 0));
		System.out.println("Is " + number + " divisible by 4 and 5 but not both? " + (number % 4 == 0 ^ number % 5 == 0));
	}
}
