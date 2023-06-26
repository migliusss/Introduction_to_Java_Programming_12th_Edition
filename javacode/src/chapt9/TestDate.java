package chapt9;

/*
 * Write a program that creates a Date object, sets its elapsed 
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, 100000000000, and displays the date and time using the 
 * toString() method, respectively. 
 */

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		// Create a Date object. 
		Date date = new Date();
		
		// Create a for loop to print the date. 
		for (long i = 10000; i <= 100000000000L; i*=10) {
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}
