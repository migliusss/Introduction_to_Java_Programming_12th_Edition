package chapter_06;

import java.util.Date;

/*
 * Invoking System.currentTimeMillis() returns the elapsed time 
 * in milliseconds since midnight of January 1, 1970. Write a program 
 * that displays the date and time. 
 */

public class Exercise_06_33 {
	/** Main method. */
	public static void main(String[] args) {
		// Get the current time in milliseconds. 
		long currentMilliseconds = System.currentTimeMillis();
		
		// Create a Date object to get the time. 
		Date date = new Date(currentMilliseconds);
		
		// Display results. 
		System.out.println("Current date and time is " + date);
	}

}
