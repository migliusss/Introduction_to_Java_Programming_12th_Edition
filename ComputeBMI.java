package chapt2;

import java.util.Scanner;

public class ComputeBMI {
	public static void main(String[] args) {
		
		final double KILOGRAM = 0.45359237;
		final double METER = 0.0254;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weightPounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();
		
		double weightKilograms = weightPounds * KILOGRAM;
		double heightMeters = heightInches * METER;
		
		double bmi = weightKilograms / (heightMeters * heightMeters);
		
		System.out.println("BMI is " + bmi);
	}
}
