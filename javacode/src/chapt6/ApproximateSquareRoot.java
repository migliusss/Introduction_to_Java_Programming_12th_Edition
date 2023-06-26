package chapt6;

import java.util.Scanner;

/*
 * There are several techniques for implementing 
 * the sqrt method in the Math class. One such technique is known as the 
 * Babylonion method. It approximates the square root of a number, n, by repeatedly 
 * performing the calculation using the following formula: 
 * 
 * nextGuess = (lastGuess + n / lastGuess) / 2
 * 
 * When nextGuess and lastGuess are almost identical, nextGuess is the 
 * approximated square root. The initial guess can be any positive value (e.g., 1). 
 * This value will be the starting value for lastGuess. If the difference between 
 * nextGuess and lastGuess is less than a very small number, such as 0.0001, 
 * you can claim that nextGuess is the approximated square root of n. If not, 
 * nextGuess becomes lastGuess and the approximation process continues. 
 * Implement the following method that returns the square root of n: 
 * 
 * public static double sqrt(double n)
 * 
 * Write a test program that prompts the user to enter a positive double value and
 * displays its square root. 
 */

public class ApproximateSquareRoot {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a positive double value: ");
		double number = input.nextDouble();
		
		// Display results. 
		System.out.println("Square root: " + sqrt(number));
	}
	
	/** A method that returns the square root of n. */ 
	public static double sqrt(double n) {
		double lastGuess = 1; // Initial guess. 
		
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		
        // Check if the difference is less than 0.0001
        while (Math.abs(nextGuess - lastGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        
        return nextGuess;
	}
}
