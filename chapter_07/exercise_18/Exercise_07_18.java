package chapter_07;

import java.util.Scanner;

/*
 * (Bubble sort) Write a sort method that uses bubble-sort algorithm. The
 * bubble-sort algorithm makes several passes through the array. On each pass, 
 * successive neighboring pairs are compared. If a pair is not in order, its values are
 * swapped; otherwise, the values remain unchanged. The technique is called a 
 * bubble sort or sinking sort because the smaller values gradually "bubble" their way to
 * the top, and the larger values "sink" to the bottom. Write a test program that reads 
 * in 10 double numbers, invokes the method, and displays the sorted numbers. 
 */

public class Exercise_07_18 {
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
				if (numbers[i] > numbers[j]) {
					double tempNumber = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tempNumber;
				}
			}
		}
	}
}
