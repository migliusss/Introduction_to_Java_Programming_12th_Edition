package chapt2;

import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
		
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}
