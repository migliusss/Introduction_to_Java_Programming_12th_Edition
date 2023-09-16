package chapter_07;

import java.util.Scanner;

/*
 * (Merge two sorted lists) Write the following method that merges two sorted    
 * lists into a new sorted list.                                                
 *                                                                                
 * public static int[] merge(int[] list1, int[] list2)                            
 *                                                                                
 * Implement the method in a way that takes at most list1.length + list2.         
 * length comparisons. Write a test program that prompts the user to enter two    
 * sorted lists and displays the merged list. Note that the 
 * first number in the input indicates the number of the elements in the list.    
 * This number is not part of the list. 
 */

public class Exercise_07_31 {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user and create and initialize arrays. 
		System.out.print("Enter list1 size and contents: ");
		int[] list1 = new int[input.nextInt()];
		
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2 size and contents: ");
		int[] list2 = new int[input.nextInt()];
		
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		
		// Display the merged list. 
		int[] mergedArray = merge(list1, list2);
		
		System.out.print("The merged list is ");
		
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}
	
	/** Method that merges two sorted lists into a new sorted list. **/
	public static int[] merge(int[] list1, int[] list2) {
		int[] merged = new int[list1.length + list2.length];
		
		int i = 0; // Index for list1.
		int j = 0; // Index for list2.
	    int k = 0; // Index for merged.
		
		// Compare elements from both lists and merge them into the merged array.
	    while (i < list1.length && j < list2.length) {
	        if (list1[i] < list2[j]) {
	            merged[k++] = list1[i++];
	        } else {
	            merged[k++] = list2[j++];
	        }
	    }

	    // Copy any remaining elements from list1.
	    while (i < list1.length) {
	        merged[k++] = list1[i++];
	    }

	    // Copy any remaining elements from list2.
	    while (j < list2.length) {
	        merged[k++] = list2[j++];
	    }
		
		return merged;
	}
}
