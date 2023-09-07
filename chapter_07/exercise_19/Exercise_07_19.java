package chapter_07;

import java.util.Scanner;

/*
 * (Sorted?) Write the following method that returns true if the list is already sorted
 * in decreasing order:
 * 
 * public static boolean isSorted(int[] list)
 * 
 * Write test program that prompts the user to enter a list and displays whether the 
 * list is sorted or not. Note that the first number in the input 
 * indicates the number of the elements in the list. The number is not part of the list. 
 */

public class Exercise_07_19 {
	public static void main (String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter list: ");
		
		int listLength = input.nextInt();
		
		// Create an array variable. 
		int[] list = new int[listLength];
		
		// Assign values to the array. 
		for (int i = 0; i < listLength; i++) {
			list[i] = input.nextInt();
		}
		
		// Display results. 
		if (isSorted(list)) {
			System.out.println("The list is already sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
	}
	
	/** A method that returns true if the list is sorted. **/
	public static boolean isSorted(int[] list) {
		// Check if the neighbor number is greater. 
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] < list[i + 1]) {
				return false; // 
			}
		}
		return true;
	}
}
