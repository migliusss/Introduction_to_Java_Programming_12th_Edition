package chapt2;

/*
 * Write a program that prompts the user to enter a temperature between -58F and 41F and a wind speed
 * greater than or equal to 2 then displays the wind-chill temperature. 
 * Use Math.pow(a, b) to compute v^0.16. 
 */

import java.util.Scanner;

public class WindChillTemperature {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double wind = input.nextDouble();
		
		// Calculate wind chill temperature by using formula in the book. 
		double windChillTemperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) + 
				0.4275 * temperature * Math.pow(wind, 0.16);
		
		// Display results. 
		System.out.println("The wind chill index is " + windChillTemperature);
	}
}
