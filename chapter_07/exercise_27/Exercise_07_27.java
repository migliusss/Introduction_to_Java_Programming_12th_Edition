package chapter_07;

import java.util.Scanner;

/*
 * (Check whether the array is sorted with constant interval) An array list is sorted 
 * with constant interval if its elements are arranged in an ascending order and there 
 * is a constant difference between adjacent elements. Write a method that returns
 * true if list is sorted with a constant interval, using the following header:
 * 
 * public static boolean isSortedConstantInterval(int[] list)
 * 
 * Write a test program that prompts the user to enter a list of integers. Note the first 
 * number in the input indicates the number of elements in the list. This number is
 * not part of the list. 
 */

public class Exercise_07_27 {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter list: ");
		int listLength = input.nextInt();
		int[] list = new int[listLength];
		
		// Assign values.
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		
		// Display results. 
		if (isSortedConstantInterval(list)) {
			System.out.println("The list is sorted with a constant interval");
		}
		else {
			System.out.println("The list is not sorted with a constant interval");
		}
		
	}
	
	/** A method that returns true if the list is sorted with constant interval. **/
	public static boolean isSortedConstantInterval(int[] list) {
		// Calculate the interval between the first two elements.
		int interval = list[1] - list[0];
		
		// Check if the interval is the same for all adjacent elements.
        for (int i = 1; i < list.length - 1; i++) {
            if (list[i + 1] - list[i] != interval) {
                return false;
            }
        }
        return true;
	}
}
