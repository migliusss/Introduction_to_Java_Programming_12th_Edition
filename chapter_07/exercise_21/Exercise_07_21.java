package chapter_07;

import java.util.Scanner;

/*
 * (Normalizing integers) Write a program that prompts the user to enter 10 integers,
 * and normalizes the integers to be in the range of 0 to 1 by dividing every integer
 * with the largest. Display the 10 normalized real-values numbers. 
 */

public class Exercise_07_21 {
	public static void main (String[] args) {
		// Create array variable. 
		int[] numbers = new int[10];
		// Variable for storing the largest number. 
		int largestNumber = 1;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter 10 numbers: ");
		
		// Assign values to the variable. 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		// Find the largest integers. 
		for (int i = 0; i < numbers.length; i++) {
			if (largestNumber < numbers[i]) {
				largestNumber = numbers[i];
			}
		}
		
		// Display the 10 normalized real-values numbers. 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println((double)numbers[i] / largestNumber);
		}
	}
}
