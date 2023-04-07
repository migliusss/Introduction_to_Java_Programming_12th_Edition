package chapt2;

import java.util.Scanner;

/*
 * Listing 2.7 ShowCurrentTime.java, gives a program that displays the current time in GMT.
 * Revise the program so its prompts the user to enter the time zone offset in GMT
 * and displays the time in the specified time zone. 
 */

public class ShowCurrentTime2 {
	public static void main(String[] args) {
		// Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the time zone offset to GMT.
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970.
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970.
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour.
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes.
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour.
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours.
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour.
		long currentHour = totalHours % 24;
		
		// Compute current hour with offset to GMT.
		long localtime = currentHour + offset;
		
		// Display results.
		System.out.println("Current time is " + localtime + ":" + currentMinute + ":"
				+ currentSecond);
		
	}
}
