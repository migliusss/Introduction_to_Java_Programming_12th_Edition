package chapt6;

import java.util.Scanner;

/*
 * Write a method that displays an n-by-n matrix
 * using the following header:
 * 
 * public static void printMatrix(int n)
 * 
 * that prompts the user to enter n and displays an n-by-n matrix.
 * 
 * Each element is 0 or 1, which is generated randomly. Write a test progrmám that
 * prompts the user to enter n and displays an n-by-n matrix.
 */

public class DisplayMatrix {
	/* Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter n: ");
		
		printMatrix(input.nextInt());
	}
	
	/* A method for printing a matrix. */
	public static void printMatrix(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// Print numbers from 0 - 2. 
				System.out.print((int) (Math.random() * 2) + " ");
			}
			// Print a new line. 
			System.out.println();
		}
	}
}
