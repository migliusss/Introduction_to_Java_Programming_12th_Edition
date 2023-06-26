package chapt6;

/*
 * Write a method that returns the number of days in a 
 * year using the following header: 
 * 
 * public static int numberOfDaysInAYear(int year)
 * 
 * Write a test program that displays the number of days in the years between 2014
 * and 2034. 
 */

public class NumberOfDaysInYear {
	/* Main method. */
	public static void main(String[] args) {
		for (int i = 2014; i <= 2034; i++) {
			System.out.println("Number of days in " + i + ": " + numberOfDaysInAYear(i));
		}
	}
	
	/* A method that returns the number of days. */
	public static int numberOfDaysInAYear(int year) {
		// Check is the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		if (isLeapYear) {
			return 366;
		}
		else {
			return 365;
		}
	}
}
