package chapt3;

/*
 * Programming exercise 2.17 gives formula to 
 * compute the wind-chill temperature. The formula is valid for temperatures in the 
 * range between -58F and 41F and wind speed greater than or equal 2. Write 
 * a program that prompts the user to enter a temperature and a wind speed. The 
 * program displays the wind-chill temperature if the input is valid; otherwise, it displays 
 * a message indicating whether the temperature and/or wind speed is invalid. 
 */

import java.util.Scanner;

public class WindChillTemperature2 {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double wind = input.nextDouble();
		
		double windChillTemperature = 0;
		
		// Check if the input is valid, calculate wind-chill temperature and display a message. 
		if ((temperature > 41 || temperature < -58) && wind < 2) {
			System.out.println("Error: temperature and wind speed is invalid");
		}
		else if (temperature > 41 || temperature < -58 || wind < 2) {
			System.out.println("Error: temperature or wind speed is invalid");
		}
		else {
			windChillTemperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) + 
					0.4275 * temperature * Math.pow(wind, 0.16);
			System.out.println("The wind chill index is " + windChillTemperature);
		}
	}
}
