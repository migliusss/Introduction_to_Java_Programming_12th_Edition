package chapt2;

import java.util.Scanner;

public class WindChillTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double wind = input.nextDouble();
		
		double windChillTemperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) + 
				0.4275 * temperature * Math.pow(wind, 0.16);
		
		System.out.println("The wind chill index is " + windChillTemperature);
	}
}
