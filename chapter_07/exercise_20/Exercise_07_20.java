package chapter_07;

import java.util.Scanner;

/*
 * Descending Bubble Sort) Modify the bubble sort method of Programming
 * Exercise 7.18, and sort the elements in the array in descending order instead of ascnding 
 * order. Write a test program that reads 10 double numbers, invokes the method,
 * and displays the sorted numbers in descending order. 
 */

public class Exercise_07_20 {
	public static void main(String[] args) {
		// Create an array variable of length 10. 
				double[] numbers = new double[10];
				
				// Create a Scanner. 
				Scanner input = new Scanner(System.in);
				
				// Prompt the user. 
				System.out.print("Enter 10 numbers: ");
				
				// Get the user numbers. 
				for (int i = 0; i < numbers.length; i++) {
					numbers[i] = input.nextDouble();
				}
				
				// Invoke the bubble sort method. 
				bubbleSort(numbers);
				
				// Display the sorted numbers. 
				for (int i = 0; i < numbers.length; i++) {
					System.out.println(numbers[i]);
				}
			}
			
			/** Bubble sort method. **/ 
			public static void bubbleSort(double[] numbers) {
				for (int i = 0; i < numbers.length; i++) {
					for (int j = i + 1; j < numbers.length; j++) {
						if (numbers[i] < numbers[j]) {
							double tempNumber = numbers[i];
							numbers[i] = numbers[j];
							numbers[j] = tempNumber;
						}
					}
				}
	}
}
