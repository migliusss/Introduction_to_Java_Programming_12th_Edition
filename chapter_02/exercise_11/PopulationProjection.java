package chapt2;

/*
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years 
 * and display population after a chosen number of years. 
 */

import java.util.Scanner;

public class PopulationProjection {
	public static void main(String[] args) {
		
		final int CURRENT_POPULATION = 312032486;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the number of years.  
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		// Calculate population from birth. 
		double birthMinute = 60 / 7.0;
		double birthHour = 60 * birthMinute;
		double birthDay = 24 * birthHour;
		double birthYear = 365 * birthDay;
		
		// Calculate death per year. 
		double deathMinute = 60 / 13.0;
		double deathHour = 60 * deathMinute;
		double deathDay = 24 * deathHour;
		double deathYear = 365 * deathDay;
		
		// Calculate immigrants per year. 
		double immigrantMinute = 60 / 45.0;
		double immigrantHour = 60 * immigrantMinute;
		double immigrantDay = 24 * immigrantHour;
		double immigrantYear = 365 * immigrantDay;
		
		// Calculate population growth. 
		int populationGrowth = (int) ((birthYear - deathYear + immigrantYear) * years);
		
		// Display results. 
		System.out.println("The population in " + years + " years is " + (populationGrowth + CURRENT_POPULATION));
		
	}
}
