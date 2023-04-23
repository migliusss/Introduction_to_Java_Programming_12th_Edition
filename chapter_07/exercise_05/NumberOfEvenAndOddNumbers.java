package chapt7;

import java.util.Scanner;

/*
 * Write a program that reads ten integers, and then displays the number of even
 * numbers and odd numbers. Assume that the input ends with 0. 
 */

public class NumberOfEvenAndOddNumbers {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int count = 0;
		int evenNumbers = 0;
		int oddNumbers = 0;
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 integers. 
		System.out.println("Enter numbers: ");
		int number = input.nextInt();
		
		// A while statement for assigning values to the numbers array until the user enters 0. 
		while (number != 0) {
			numbers[count] = number; // Initialize an array with the number entered. 
			count++; // Add 1 to the count. 
			
			number = input.nextInt(); // Get a new value the user entered and assign it to the number variable. 
		}
		// A for loop with a nested if else statement to check if the number is even or odd. 
		for (int i = 0; i < count; i++) {
			if (numbers[i] % 2 == 0) {
				evenNumbers ++;
			}
			else {
				oddNumbers ++;
			}
		}
		// Display results. 
		System.out.println("The number of odd numbers is: " + oddNumbers);
		System.out.println("The number of even numbers is: " + evenNumbers);
	}
}
