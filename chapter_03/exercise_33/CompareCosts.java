package chapt3;

/*
 * Suppose you shop for rice in two different packages. 
 * You would like to write a program to compare the cost. The program prompts the 
 * user to enter the weight and price of each package and displays the one with the 
 * better price. 
 */

import java.util.Scanner;

public class CompareCosts {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter weight and price for package 1: ");
		double package1Weight = input.nextDouble();
		double package1Price = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double package2Weight = input.nextDouble();
		double package2Price = input.nextDouble();
		
		// Find out the package with a better price and display results. 
		if (package1Price / package1Weight > package2Price / package2Weight) {
			System.out.println("Package 2 has a better price.");
		}
		else if (package1Price / package1Weight < package2Price / package2Weight) {
			System.out.println("Package 1 has a better price.");
		}
		else {
			System.out.println("Two packages has the same price.");
		}
	}
}
