package chapt9;

import java.util.GregorianCalendar;

/*
 * Java API has the GregorianCalendar
 * class in the java.util packagem which you can uset to obtain the year, month and 
 * day of a date. The no-arg constructor constructs an instance for the current date, 
 * and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), 
 * and get(GregorianCalendar.DAY_OF_MONTH) return the year, 
 * month and day. Write a program to perform two tasks: 
 * 
 * 1. Display the current year, month, and day. 
 * 2. The GregorianCalendar class has the setTimeInMillis(long), which
 * 	  can be used to set a specified elapsed time since January 1, 1970. Set the value
 * 	  to 1234567898765L and display the year, month, and day. 
 */

public class TestGregorianCalender {
	public static void main(String[] args) {
		// Create GregorianCalendar object. 
		GregorianCalendar date = new GregorianCalendar();
		
		// Display current year, month, and day, d/m/y.
		System.out.println("Current date: ");
		System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH) + "/" 
				+ date.get(GregorianCalendar.MONTH) + "/"
				+ date.get(GregorianCalendar.YEAR));
		
		System.out.println();
		
		// Set the elapsed time value to 1234567898765L.
		date.setTimeInMillis(1234567898765L);
		
		// Display results, d/m/y.
		System.out.println("Time elapsed since January 1, 1970: ");
		System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH) + "/" 
				+ date.get(GregorianCalendar.MONTH) + "/"
				+ date.get(GregorianCalendar.YEAR));
	}
}
