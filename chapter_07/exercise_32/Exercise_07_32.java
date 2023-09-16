package chapter_07;

import java.util.Scanner;

/*
 * (Portion of a list) Write the following method that partitions the list using the 
 * first element, called a pivot:
 * 
 * public static int pivot(int[] list)
 * 
 * After the partition, the elements in the list are rearranged so all the elements before 
 * the pivot are less than or equal to the pivot, and the elements after the pivot are 
 * greater than the pivot. The methods returns the index where the pivot is located in 
 * the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 * the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
 * most list.lenght comparisons. Write a test program that prompts the user to enter the size 
 * of the list and the contents of the list and displays the list after the partition. 
 * 
 */

public class Exercise_07_32 {
	public static void main(String[] args) {
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter list size: ");
		int size = input.nextInt();
		int[] list = new int[size];
		
		System.out.print("Enter list contents: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
	}
	
	/** Method that partitions the list using the first element. **/
	public static int pivot(int[] list) {
		 int pivot = list[0]; // Choose the first element as the pivot.
		 int low = 1; // Index for the low end of the list.
	     int high = list.length - 1; // Index for the high end of the list.

 	     while (high > low) {
 	    	 // Find the rightmost element smaller than the pivot.
 	    	 while (high > low && list[high] > pivot) {
 	    		 high--;
 	    	 }

 	    	 // Find the leftmost element greater than or equal to the pivot.
 	    	 while (low <= high && list[low] <= pivot) {
 	    		 low++;
 	    	 }

		 	 // Swap two elements in the list.
		 	 if (high > low) {
		 		 int temp = list[high];
		 		 list[high] = list[low];
		 		 list[low] = temp;
		 	 }
		 }

		 // Move the pivot to its correct position.
 	     while (high > 0 && list[high] >= pivot) {
 	    	 high--;
		 }

		 // Swap the pivot with the element at the high index.
		 if (pivot > list[high]) {
			 list[0] = list[high];
		     list[high] = pivot;
		     return high;
		 } 
		 else {
			 return 0; // The pivot is already in its correct position.
		 }
	}
}
