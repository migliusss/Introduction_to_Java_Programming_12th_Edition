package chapt2;

/*
 * Write a program that calculates the energy needed to heat water from 
 * an initial temperature to a final temperature. 
 */

import java.util.Scanner;

public class CalculatingEnergy {
	public static void main(String[] args) {
		// Create a scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the amount of water in kilograms
		System.out.print("Enter the amount of water in kilograms: ");
		double waterInKilograms = input.nextDouble();
		
		// Prompt the user to enter initial temperature 
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		// Prompt the user to enter the final temperature
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		// Calculate the energy needed
		double energy = waterInKilograms * (finalTemperature - initialTemperature) * 4184;
		
		// Display results
		System.out.println("The energy needed is " + energy);
	}
}
