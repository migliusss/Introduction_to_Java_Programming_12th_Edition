package chapter_07;

/*
 * (Execution time) Write a program that creates an array of numbers from 1 to 
 * 100,000,000 in ascending order. Display the execution time of invoking the 
 * linear Search method and the binary Search method in Listing 7.6 and 
 * 7.7 respectively. Display the execution time of invoking both searches for the 
 * following number: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. You
 * can use the following code template to obtain the execution time:
 * 
 * long startTime = System.nanoTime();
 * perform the task;
 * long endTime = System.nanoTime();
 * long executionTime = endTime - startTime;
 */

public class Exercise_07_16 {
	/** Main method. */
	public static void main(String[] args) {
		int[] numbers = new int[100000000];
		
		// Initializing arrays from 1 to 100,000,000. 
		for (int i = 0; i < 100000000; i++) {
			numbers[i] = i;
		}
		
		// Start the execution time of linear search. 
		long startTime = System.nanoTime();
		
		linearSearch(numbers, 1);
		linearSearch(numbers, 25000000);
		linearSearch(numbers, 50000000);
		linearSearch(numbers, 75000000);
		linearSearch(numbers, 100000000);
		
		// Stop the execution time. 
		long endTime = System.nanoTime();
		
		// Calculate the time. 
		long executionTime = endTime - startTime;
		
		// Display results of linear search
		System.out.println("Execution time of linear search: " + executionTime);
		
		// Start the execution time of binary search. 
		startTime = System.nanoTime();
		
		binarySearch(numbers, 1);
		binarySearch(numbers, 25000000);
		binarySearch(numbers, 50000000);
		binarySearch(numbers, 75000000);
		binarySearch(numbers, 100000000);
		
		// Stop the execution time. 
		endTime = System.nanoTime();
		
		// Calculate the time. 
		executionTime = endTime - startTime;
		
		// Display results of binary search
		System.out.println("Execution time of binary search: " + executionTime);

	}
	/** The method for finding a key in the list. */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return 1;
			}
		}
		return -1;
	}
	
	/** Use binary search to find the key in the list. */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else 
				low = mid + 1;
		}
		
		return -low - 1;
	}
}
