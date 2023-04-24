package chapt7;

import java.util.Scanner;

/*
 * Programming Exercise 5.45 computes the standard deviation of numbers. This exercise uses a different
 * but equivalent formula to compute the standard deviation of n numbers. 
 * 
 * To compute the standard deviation with formula, you have to store the individual 
 * numbers using an array, so they can be used after the mean is obtained. 
 * 
 * Your program should contain the following methods: 
 * 
 * public static double deviation(double[] x)
 *
 * public static double mean(double[] x)
 *
 * Write a test program that prompts the user to enter 10 numbers and displays the
 * mean and standard deviation. 
 */

public class ComputeDeviation {
	public static void main(String[] args) {
		double[] numbers = new double[10]; // Create an array of 10 length. 
		
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 numbers. 
		System.out.print("Enter 10 numbers: ");
		
		// Assign value to the array with a for loop. 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		// Display the mean by calling the mean method. 
		System.out.println("The mean is " + mean(numbers));
		
		// Display the deviation by calling the deviation method. 
		System.out.print("The standard deviation is " + deviation(numbers));
	}
	
	/** Compute the deviation of double values */
	public static double deviation(double[] x) {
		double deviation = 0; // Variable for storing deviation. 
		double mean = mean(x); // Variable for storing the mean. 
		
		for (int i = 0; i < x.length; i++) { 
			deviation += Math.pow(x[i] - mean, 2);
		}
		
		return Math.sqrt(deviation / x.length - 1);
	}
	
	/** Compute the mean of an array of double values */
	public static double mean(double[] x) {
		double mean = 0; // Variable for storing the mean. 
		
		for (int i = 0; i < x.length; i++) { // Adding numbers to the mean. 
			mean += x[i];
		}

		return mean / x.length;
	}
}
