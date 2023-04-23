package chapt7;

import java.util.Scanner;

/*
 * Write a method that finds the largest element in an array 
 * of double values using the following header: 
 * 
 * public static double max(double[] array)
 * 
 * Write a test program that prompts the user to enter ten numbers, invokes this 
 * method to return the maximum value, and displays the maximum value. 
 */

public class FindLargestElement {
	// Main method. 
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 numbers. 
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10]; // Create an array for storing numbers. 
		
		// Assign values to the array. 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		// Display the max number. 
		System.out.println("The maximum value is: " + max(numbers));
	}
	
	// Method for finding the maximum value in an array. 
	public static double max(double[] array) {
		double max = 0;
		
		for (int i = 0; i < array.length; i ++) {
			if (array[i] > max) { // If the number is higher than the max assign max a new value. 
				max = array[i];
			}
		}
		return max;
	}
}
