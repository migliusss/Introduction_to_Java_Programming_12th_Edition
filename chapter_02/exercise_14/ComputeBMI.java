package chapt2;

/*
 * Write a program that prompts the user to enter a weight in pounds and height in inches 
 * and displays the BMI. 
 */

import java.util.Scanner;

public class ComputeBMI {
	public static void main(String[] args) {
		
		// Create constants. 
		final double KILOGRAM = 0.45359237; // 1 pound is 0.45359237 kilograms. 
		final double METER = 0.0254; // 1 inch is 0.0254 meters. 
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight and height. 
		System.out.print("Enter weight in pounds: ");
		double weightPounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();
		
		// Calculate BMI. 
		double weightKilograms = weightPounds * KILOGRAM;
		double heightMeters = heightInches * METER;
		
		double bmi = weightKilograms / (heightMeters * heightMeters);
		
		// Display results. 
		System.out.println("BMI is " + bmi);
	}
}
