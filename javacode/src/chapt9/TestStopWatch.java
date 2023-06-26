package chapt9;

import java.util.Random;

public class TestStopWatch {
	public static void main(String[] args) {
		// Create an array of length 100,000 to store numbers. 
		int[] numbers = new int[100000]; 
		
		// Initialize the array with random numbers. 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100000);
		}
		
		// Create a StopWatch object. 
		StopWatch stopWatch = new StopWatch();
		
		// Start StopWatch by invoking the method. 
		stopWatch.start();
		
		// Sort the array. 
		selectionSort(numbers);
		
		// Stop the StopWatch by invoking the method. 
		stopWatch.stop();
		
		// Display the execution time. 
		System.out.println("Execution time of sorting 100,000 "
				+ "numbers in milliseconds: " + stopWatch.getElapsedTime());
		
	}
	
	/** A method for sorting an array using selection sort */
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = 1;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
