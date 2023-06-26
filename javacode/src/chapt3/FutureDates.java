package chapt3;

/*
 * Write a program that prompts the user to enter an integer for today's day of the week (Sunday 0, Monday is 1, ...,
 * and Saturday is 6). Also prompt the user to enter the number of days after today for a future day
 * and display the future day of the week. 
 */

import java.util.Scanner;

public class FutureDates {
	public static void main(String[] args) {
		// Declare and initilize variable. 
		int futureDay = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter today's day and then the number of days after today. 
		System.out.print("Enter today's day: ");
		int weekOfTheDay = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int numberOfDaysAfterToday = input.nextInt();
		
		if (weekOfTheDay == 0) { // If statement based on the date entered. 
			futureDay = (weekOfTheDay + numberOfDaysAfterToday) % 7; // Find future date. 
			
			switch(futureDay) { // Based on the number of future day print the name of the future day. 
			case(0): System.out.println("Today is Sunday and the future day is Sunday");
			break;
			case(1): System.out.println("Today is Sunday and the future day is Monday");
			break;
			case(2): System.out.println("Today is Sunday and the future day is Tuesday");
			break;
			case(3): System.out.println("Today is Sunday and the future day is Wednesday");
			break;
			case(4): System.out.println("Today is Sunday and the future day is Thursday");
			break;
			case(5): System.out.println("Today is Sunday and the future day is Friday");
			break;
			case(6): System.out.println("Today is Sunday and the future day is Saturday");
			break;
			}
			
		}
		else if(weekOfTheDay == 1) {
			futureDay = (weekOfTheDay + numberOfDaysAfterToday) % 7;
			
			switch(futureDay) { // Based on the number of future day print the name of the future day. 
			case(0): System.out.println("Today is Monday and the future day is Sunday");
			break;
			case(1): System.out.println("Today is Monday and the future day is Monday");
			break;
			case(2): System.out.println("Today is Monday and the future day is Tuesday");
			break;
			case(3): System.out.println("Today is Monday and the future day is Wednesday");
			break;
			case(4): System.out.println("Today is Monday and the future day is Thursday");
			break;
			case(5): System.out.println("Today is Monday and the future day is Friday");
			break;
			case(6): System.out.println("Today is Monday and the future day is Saturday");
			break;
			}
		} 
		else if(weekOfTheDay == 2) {
			futureDay = (weekOfTheDay + numberOfDaysAfterToday) % 7;
			
			switch(futureDay) { // Based on the number of future day print the name of the future day. 
			case(0): System.out.println("Today is Tuesday and the future day is Sunday");
			break;
			case(1): System.out.println("Today is Tuesday and the future day is Monday");
			break;
			case(2): System.out.println("Today is Tuesday and the future day is Tuesday");
			break;
			case(3): System.out.println("Today is Tuesday and the future day is Wednesday");
			break;
			case(4): System.out.println("Today is Tuesday and the future day is Thursday");
			break;
			case(5): System.out.println("Today is Tuesday and the future day is Friday");
			break;
			case(6): System.out.println("Today is Tuesday and the future day is Saturday");
			break;
			}
		} 
		else if(weekOfTheDay == 3) {
			futureDay = (weekOfTheDay + numberOfDaysAfterToday) % 7;
			
			switch(futureDay) { // Based on the number of future day print the name of the future day. 
			case(0): System.out.println("Today is Wednesday and the future day is Sunday");
			break;
			case(1): System.out.println("Today is Wednesday and the future day is Monday");
			break;
			case(2): System.out.println("Today is Wednesday and the future day is Tuesday");
			break;
			case(3): System.out.println("Today is Wednesday and the future day is Wednesday");
			break;
			case(4): System.out.println("Today is Wednesday and the future day is Thursday");
			break;
			case(5): System.out.println("Today is Wednesday and the future day is Friday");
			break;
			case(6): System.out.println("Today is Wednesday and the future day is Saturday");
			break;
			}
		} 
		else if(weekOfTheDay == 4) {
			futureDay = (weekOfTheDay + numberOfDaysAfterToday) % 7;
			
			switch(futureDay) { // Based on the number of future day print the name of the future day. 
			case(0): System.out.println("Today is Thursday and the future day is Sunday");
			break;
			case(1): System.out.println("Today is Thursday and the future day is Monday");
			break;
			case(2): System.out.println("Today is Thursday and the future day is Tuesday");
			break;
			case(3): System.out.println("Today is Thursday and the future day is Wednesday");
			break;
			case(4): System.out.println("Today is Thursday and the future day is Thursday");
			break;
			case(5): System.out.println("Today is Thursday and the future day is Friday");
			break;
			case(6): System.out.println("Today is Thursday and the future day is Saturday");
			break;
			}
		} 
		else if(weekOfTheDay == 5) {
			futureDay = (weekOfTheDay + numberOfDaysAfterToday) % 7;
			
			switch(futureDay) { // Based on the number of future day print the name of the future day. 
			case(0): System.out.println("Today is Friday and the future day is Sunday");
			break;
			case(1): System.out.println("Today is Friday and the future day is Monday");
			break;
			case(2): System.out.println("Today is Friday and the future day is Tuesday");
			break;
			case(3): System.out.println("Today is Friday and the future day is Wednesday");
			break;
			case(4): System.out.println("Today is Friday and the future day is Thursday");
			break;
			case(5): System.out.println("Today is Friday and the future day is Friday");
			break;
			case(6): System.out.println("Today is Friday and the future day is Saturday");
			break;
			}
		} 
		else if(weekOfTheDay == 6) {
			futureDay = (weekOfTheDay + numberOfDaysAfterToday) % 7;
			
			switch(futureDay) { // Based on the number of future day print the name of the future day. 
			case(0): System.out.println("Today is Saturday and the future day is Sunday");
			break;
			case(1): System.out.println("Today is Saturday and the future day is Monday");
			break;
			case(2): System.out.println("Today is Saturday and the future day is Tuesday");
			break;
			case(3): System.out.println("Today is Saturday and the future day is Wednesday");
			break;
			case(4): System.out.println("Today is Saturday and the future day is Thursday");
			break;
			case(5): System.out.println("Today is Saturday and the future day is Friday");
			break;
			case(6): System.out.println("Today is Saturday and the future day is Saturday");
			break;
			}
		} 
		else { // Statement for checking input. 
			System.out.println("Error: invalid number");
			System.exit(1);
		}
	}
}
