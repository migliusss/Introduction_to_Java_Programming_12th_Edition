package chapt7;

import java.util.Scanner;

/*
 * The reverse method in Section 7.7 reverses an array to by
 * copying it to a new array. Rewrite the method that reverses the array passed in
 * the argument and returns this array. Write a test program that prompts the user to
 * enter 10 numbers, invokes the method to reverse the numbers, and displays the numbers. 
 */

public class ReverseAnArray {
	public static void main(String[] args) {
		double[] numbers = new double[10]; // Create an array with a length of 10 elements. 
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 numbers. 
		System.out.print("Enter 10 numbers: ");
		
		// Assign values to numbers array. 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		// Invoke the method for reversing numbers.
		reverseArray(numbers);
		
		// Display the numbers in reversed order. 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
	}
	
	/** Create a method for reversing an array */
	public static void reverseArray(double[] array) {
			double[] temp = new double[array.length]; // Create an array of array length to store values of an array temporary.
			
			// A for loop for assigning array values to a temporary array. 
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			
			// Using temp array to assign values in reversed order. 
			for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
				array[j] = temp[i];
			}
	}
}
