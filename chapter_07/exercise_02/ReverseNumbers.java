package chapt7;

import java.util.Scanner;

/*
 * Write a program that reads 10 integers then displays them in the reverse
 * of the order in which they were created. 
 */

public class ReverseNumbers {
	public static void main(String[] args) {
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 integers. 
		System.out.print("Enter 10 integers: ");
		int[] numbers = new int[10]; // Create an array.
		for (int i = 0; i < numbers.length; i++) { // Assign values to the array. 
			numbers[i] = input.nextInt(); 
		}
		
		
		// Display numbers in reversed order. 
		for (int i = numbers.length - 1; i >= 0; i--) { // Print array values starting from the last index. 
			System.out.print(numbers[i] + " ");
		}
	}

}
