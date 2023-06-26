package chapt3;

/*
 * Write a program that lets the user guess whatever the 
 * flip of a coin results in heads or tails. The program randomly generates an integer 
 * 0 or 1, which represents head or tail. The program prompts the user to enter a 
 * guess, and reports whether the guess is correct or incorrect. 
 * 
 */

import java.util.Scanner;

public class HeadsOrTails {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a guess, heads (0) or tails (1): ");
		int guess = input.nextInt();
		
		// Get a random number between 0 and 1. 
		int number = (int) (Math.random() * 2);
		
		// Check if the answer is correct. 
		if (guess == number)
			System.out.println("Correct!");
		else 
			System.out.println("Incorrect!");
		
	}
}
