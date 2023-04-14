package chapt6;

import java.util.Scanner;

/*
 * Write a test program that prompts the user to enter three numbers and invokes 
 * the method to display them in decreasing order. 
 */

public class SortThreeNumbers {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 3 numbers. 
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Display results by calling displaySortedNumbers method. 
		displaySortedNumbers(number1, number2, number3);
	}
	
	// Create a method that sorts numbers in decreasing order. For example numbers ABC. 
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if (num1 >= num2 && num2 >= num3) { // ABC
			System.out.print(num1 + " " + num2 + " " + num3);
		}
		else if (num1 >= num3 && num3 >= num2) { // ACB
			System.out.print(num1 + " " + num3 + " " + num2);
		}
		else if (num2 >= num1 && num1 > num3) { // BAC
			System.out.print(num2 + " " + num1 + " " + num3);
		}
		else if (num2 >= num3 && num3 > num1) { // BCA
			System.out.print(num2 + " " + num3 + " " + num1);
		}
		else if (num3 >= num1 && num1 >= num2) { // CAB
			System.out.print(num3 + " " + num1 + " " + num2);
		}
		else { // CBA
			System.out.print(num3 + " " + num2 + " " + num1);
		}
			
	}
}
