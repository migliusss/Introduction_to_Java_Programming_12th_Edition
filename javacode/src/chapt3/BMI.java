package chapt3;

/*
 * Revise Listing 3.4, ComputeAndInterpret BMI.java, to let the user enter weight, feet, and inches. 
 */

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		// Declare and initialize constant variables. 
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double INCHES_PER_FEET = 12;
		final double METERS_PER_INCH = 0.0254;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight, feet and inches. 
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();
		
		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heghtInMeters = (feet * INCHES_PER_FEET + inches) * METERS_PER_INCH;
		double bmi = weightInKilograms / (heghtInMeters * heghtInMeters);
		
		// Display results 
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
