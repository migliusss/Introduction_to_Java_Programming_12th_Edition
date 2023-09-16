package chapter_07;

import java.util.Scanner;

/*
 * (Pattern recognition: consecutive four equal numbers) Write the following method 
 * that tests whether the array has four consecutive numbers with the same value:
 * 
 * public static boolean isConsecutiveFour(int[] values)
 * 
 *  Write a test program that prompts the user to enter a series of integers and 
 *  displays it if the series contains four consecutive numbers with the same value. Your 
 *  program should first prompts the user to enter the input size-i.e., the number of 
 *  values in the series.
 */

public class Exercise_07_30 {	
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the number of values:");
		int size = input.nextInt();
		
		int[] values = new int[size];
		
		System.out.print("Enter the values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		
		// Display results. 
		if (isConsecutiveFour(values)) {
			System.out.println("The list has consecutive numbers.");
		}
		else {
			System.out.println("The list has no consecutive numbers.");
		}
	}
	
	/** Method that tests whether the array has four consecutive numbers with the same value. */
	public static boolean isConsecutiveFour(int[] values) {
		for (int i = 0; i < values.length - 3; i++) {
			boolean isEqual = true;
			// A loop that checks if the next value is equal. 
			for (int j = i; j < i + 3; j++) {
				// If the value is not equal break out of the loop. 
				if (values[j] != values[j + 1]) {
					isEqual = false;
					break;
				}
			}
			if (isEqual) {
				return true;
			}
		}
		return false;
	}
}
