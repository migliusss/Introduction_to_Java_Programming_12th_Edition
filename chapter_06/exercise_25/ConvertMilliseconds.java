package chapt6;

import java.util.Scanner;

/*
 * Write a method that converts milliseconds to hours, minutes, and seconds
 * using the following header: 
 * 
 * public static String convertMillis(long millis)
 * 
 * The method returns a string as hours:minutes:seconds. For example,
 * convertMillis(5500) returns a string 0:0:5, convertMillis(100000)
 * returns a string 0:1:40, and convertMillis(555550000) returns a string
 * 154:19:10. Write a test program that prompts the user to enter a long integer
 * for milliseconds and displays a string in the format of hour:minutes:seconds. 
 */

public class ConvertMilliseconds {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter milliseconds: ");
		
		// Display results. 
		System.out.println(convertMillis(input.nextLong())); 
	}
	
	/** A method that converts milliseconds to hours, minutes, and seconds. */
	public static String convertMillis(long millis) {
		// Obtain the total seconds. 
		long totalSeconds = millis / 1000;
		
		// Compute the current second in the minute in the hour. 
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes. 
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour. 
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours. 
		long totalhours = totalMinutes / 60;
		
		return totalhours + ":" + currentMinute + ":" + currentSecond;
	}
}
