package chapt7;

import java.util.Scanner;

/*
 * Write a method that returns the index of the largest element in an array of integers. 
 * If there is more than one element, return the largest index. Use the following header: 
 * 
 * public static int indexOfLargestElement(double[] array)
 * 
 * Write a test program that prompts the user to enter 10 numbers, invokes the 
 * method to return the index of the largest element, and displays the index and the
 * element itself. 
 */

public class IndexOfLargestElement {
	// Main method. 
	public static void main(String[] args) {
		double[] numbers = new double[10]; // Create an array to store numbers. 
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 numbers. 
		System.out.print("Enter ten numbers: ");
		
		// Assign values to the array. 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		// Display index of the largest number and the number. 
		System.out.println("The largest number is " + numbers[indexOfLargestElement(numbers)] 
				+ ". Index of the largest number is: " + indexOfLargestElement(numbers));
		
	}
	
	// Method for returning index of the largest number in an array. 
	public static int indexOfLargestElement(double[] array) {
		double max = 0;
		int index = 0;
		
		// For loop for finding the max number and index. 
		for (int i = 0; i < array.length; i ++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
			// Statement for when there are 2 numbers with the same value, that returns the largest index. 
			else if (array[i] == max) {
				index = i;
			}
		}
		
		return index;
	}
}
