package chapt5;

/*
 * Write a program that displays all the leap years, ten per line
 * from 2014 to 2114, separated by exactly one space. 
 * Also display the number of leap years in this period. 
 */

public class DisplayLeapYears {
	public static void main(String[] args) {
		
		int NUMBER_OF_LEAP_YEARS = 10; // 10 leap years per line. 
		int count = 0; // Variable to count the amount of leap years in one lie. 
		boolean isLeapYear = false;
		
		// A for loop to check if a year is a leap year. 
		for (int i = 2014; i <= 2114; i++) {
			isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0); 
		
			if (isLeapYear) {
				count++;
				
				// An if statement that checks if there are 10 years in one line. If true print leap year on a new line. 
				if (count % NUMBER_OF_LEAP_YEARS == 0) {
					System.out.println(i);
				}
				else {
					System.out.print(i + " ");
				}
			}
		}

	}
}
