package chapt3;

/*
 * Revise Programming Exercise 2.8 to display the hour using a 
 * 12-hour clock. 
 */

import java.util.Scanner;

public class CurrentTime {
	public static void main(String[] args) {
		// Create a Scanner. 
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
		int currentHour = (int) (totalHours % 24);
		
		// Compute current hour with offset to GMT. 
		currentHour = currentHour + offset;
		
		// Display results. 
		System.out.println("Current time is " + ((currentHour > 12) ? currentHour - 12 : currentHour) 
				+ ":" + currentMinute + ":" + currentSecond + ((currentHour > 12) ? " PM" : " AM"));
	}
}
