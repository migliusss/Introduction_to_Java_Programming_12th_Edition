package chapter_07;

import java.util.Scanner;

/*
 * (Math: permutations) Write a program that prompts the user to enter four integers 
 * and then displays all possible ways of arranging the four integers. 
 */

public class Exercise_07_28 {
	public static void main(String[] args) {
		// Array for storing numbers.
		int[] numbers = new int[4];
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter four integers: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		// Display results. 
		System.out.println("All possible permutations:");
        permute(numbers, 0, numbers.length - 1);
	}
	
    /** Method to generate permutations, **/
    public static void permute(int[] numbers, int left, int right) {
        if (left == right) {
            // Base case: When only one element remains, print the permutation.
            printArray(numbers);
        } 
        else {
            for (int i = left; i <= right; i++) {
                // Swap the current element with the element at index 'left'.
                swap(numbers, left, i);
                
                // Recursively permute the remaining elements.
                permute(numbers, left + 1, right);
                
                // Backtrack by swapping the elements back to their original positions.
                swap(numbers, left, i);
            }
        }
    }

    /** Method to print an array. **/
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /** Method to swap two elements in an array. **/
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
