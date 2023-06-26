package chapt6;

import java.time.LocalDate;

/*
 * Listing 2.7, ShowCurrentTime.java, displays the 
 * current time. Revise this example to display the current date and time. The
 * calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas on
 * how to find the year, month, and day. 
 */

public class CurrentDateAndTime {
	/** Main method. */
	public static void main(String[] args) {
		showCurrentTime(); showCurrentDate();
	}
	
	/** A method to show current time. */
	public static void showCurrentTime() {
		long totalMilliSeconds = System.currentTimeMillis();
		
		// Obtain the total seconds. 
		long totalSeconds = totalMilliSeconds / 1000;
		
		// Compute the current second in the minute in the hour. 
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes. 
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour. 
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours. 
		long totalhours = totalMinutes / 60;
		
		// Compute the current hour. 
		long currentHour = totalhours % 24;
		
		// Display results. 
		System.out.println("Current time: " + currentHour + ":" 
				+ currentMinute + ":" + currentSecond + " GMT");
	}
	
	/** A method to show current date. */ 
    public static void showCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        // Display the time. 
        System.out.println("Current Date: " + currentDate);
    }
}
