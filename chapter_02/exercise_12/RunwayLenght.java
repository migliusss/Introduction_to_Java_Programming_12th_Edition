package chapt2;

/*
 * Write a program that prompts the user to enter v in meters/seconds (m/s) and the acceleration a 
 * in meters/second squared (m/s^2), then, displays the minimum runway length. 
 */

import java.util.Scanner;

public class RunwayLenght {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		// Calculate the runway length. 
		double lenght = Math.pow(speed, 2) / (2 * acceleration);
		
		// Display results. 
		System.out.println("The minimum runway lenght for this airplane is " + lenght);
		
	}
}
