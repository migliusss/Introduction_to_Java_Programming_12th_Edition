package chapt7;

import java.util.Scanner;

/*
 * Write a method that returns a new array by eliminating the 
 * duplicate value in the array using the following method header:
 * 
 * public static int[] eliminateDuplicate(int[] list)
 * 
 * Write a test program that reads 10 integers, invokes the method, and displays 
 * the distinct numbers separated by exactly one space. 
 */

public class EliminateDuplicates {
	
	/** Main method. */
	public static void main(String[] args) {
		int[] numbers = new int[10]; // Create an array of 10 length. 
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 integers. 
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		// Display results by invoking the method. 
		
		int[] eliminatedNumbers = eliminateDuplicate(numbers);
		
		System.out.print("The distinct numbers are: ");
		
		for (int i = 0; i < eliminatedNumbers.length; i++) {
			if (eliminatedNumbers[i] > 0) {
				System.out.print(eliminatedNumbers[i] + " ");
			}
		}
		
	}
	
	/** Method for removing duplicate values in an array. */
	public static int[] eliminateDuplicate(int[] list) {
		int[] newList = new int[list.length]; // Create an array that stores distinct values. 
		
		for (int i = 0, j = 0; i < list.length; i++, j++) {
			if (linearSearch(newList, list[i]) == -1) { // Searching the newList. If false (-1) add to the new array list. 
				newList[j] = list[i];
			}
		}
		
		return newList;
	}
	
	/** Method for linear search in an array. */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	
}
