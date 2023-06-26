package chapt3;

/*
 * Zeller's congruence is an algorithm developed by 
 * Christian Zeller to calculate the day of the week. 
 * 
 * Note all divisions in this exercise perform an integer division. Write a program 
 * that prompts the user to enter a year, month, and day of the month, and displays 
 * the name of the day of the week. 
 */

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter year: (e.g., 2012): ");
		int userYear = input.nextInt();
		
		System.out.print("Enter month: 1-12: ");
		int userMonth = input.nextInt();
		
		System.out.print("Enter the day of the month: 1-31: ");
		int userDayOfTheMonth = input.nextInt();
		
		// Variables. 
		int dayOfTheWeek;
		int yearOfTheCentury = userYear % 100;
		int j = userYear / 100;
		
		// An if else statement if the user input is January. 
		if (userMonth == 1) {
			userYear = userYear - 1;
			userMonth = 13;
			yearOfTheCentury = userYear % 100;
			j = userYear / 100;
			
			dayOfTheWeek = (userDayOfTheMonth + (26 * (userMonth + 1)) / 10 + yearOfTheCentury 
					+ yearOfTheCentury / 4 + j / 4 + 5 * j) % 7;
			
			System.out.print(userYear);
			
			if (dayOfTheWeek == 0) {
				System.out.println("Day of the week is Saturday");
			}
			else if (dayOfTheWeek == 1) {
				System.out.println("Day of the week is Sunday");
			}
			else if (dayOfTheWeek == 2) {
				System.out.println("Day of the week is Monday");
			}
			else if (dayOfTheWeek == 3) {
				System.out.println("Day of the week is Tuesday");
			}
			else if (dayOfTheWeek == 4) {
				System.out.println("Day of the week is Wednesday");
			}
			else if (dayOfTheWeek == 5) {
				System.out.println("Day of the week is Thursday");
			}
			else {
				System.out.println("Day of the week is Friday");
			}
		}
		// If the user input is February. 
		else if (userMonth == 2) {
			userYear = userYear - 1;
			userMonth = 14;
			yearOfTheCentury = userYear % 100;
			j = userYear / 100;
			
			dayOfTheWeek = (userDayOfTheMonth + (26 * (userMonth + 1)) / 10 + yearOfTheCentury 
					+ yearOfTheCentury / 4 + j / 4 + 5 * j) % 7;
			
			if (dayOfTheWeek == 0) {
				System.out.println("Day of the week is Saturday");
			}
			else if (dayOfTheWeek == 1) {
				System.out.println("Day of the week is Sunday");
			}
			else if (dayOfTheWeek == 2) {
				System.out.println("Day of the week is Monday");
			}
			else if (dayOfTheWeek == 3) {
				System.out.println("Day of the week is Tuesday");
			}
			else if (dayOfTheWeek == 4) {
				System.out.println("Day of the week is Wednesday");
			}
			else if (dayOfTheWeek == 5) {
				System.out.println("Day of the week is Thursday");
			}
			else {
				System.out.println("Day of the week is Friday");
			}
		}
		// All the other months. 
		else {
			dayOfTheWeek = (userDayOfTheMonth + (26 * (userMonth + 1)) / 10 + yearOfTheCentury 
					+ yearOfTheCentury / 4 + j / 4 + 5 * j) % 7;
			
			if (dayOfTheWeek == 0) {
				System.out.println("Day of the week is Saturday");
			}
			else if (dayOfTheWeek == 1) {
				System.out.println("Day of the week is Sunday");
			}
			else if (dayOfTheWeek == 2) {
				System.out.println("Day of the week is Monday");
			}
			else if (dayOfTheWeek == 3) {
				System.out.println("Day of the week is Tuesday");
			}
			else if (dayOfTheWeek == 4) {
				System.out.println("Day of the week is Wednesday");
			}
			else if (dayOfTheWeek == 5) {
				System.out.println("Day of the week is Thursday");
			}
			else {
				System.out.println("Day of the week is Friday");
			}
		}
			
	}
}
