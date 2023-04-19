package chapt2;

/*
 * Write a program that prompts the user to enter the distance to drive, 
 * the fuel efficiency of the car in miles per gallon, and the price per gallon
 * then displays the cost of the trip. 
 */

import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		// Calculate cost of driving. 
		double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
		
		// Display results. 
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}
