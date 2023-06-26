package chapt7;

import java.util.Scanner;

/*
 * Write two overloaded methods that return the average of an array with the following headers: 
 * 
 * public static double average(int[] array)
 * public static double average(double[] array)
 * 
 * Write a test program that prompts the user to enter 10 integers, invokes the first, 
 * method, then displays the average value; prompts the user to enter 10 double values, 
 * invokes the second method, then displays the average value. 
 */

public class AverageAnArray {
	// Main method. 
	public static void main(String[] args) {
		int[] tenIntegers = new int[10];
		double[] tenDoubles = new double[10];
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 integers. 
		System.out.print("Enter 10 integer: ");
		for (int i = 0; i < tenIntegers.length; i++) {
			tenIntegers[i] = input.nextInt();
		}
		
		// Display average value. 
		System.out.println("Average value of 10 integers: " + average(tenIntegers));
		
		// Prompt the user to enter 10 doubles. 
		System.out.print("Enter 10 double: ");
		for (int i = 0; i < tenDoubles.length; i++) {
			tenDoubles[i] = input.nextDouble();
		}
		
		// Display average value. 
		System.out.print("Average value of 10 doubles: " + average(tenDoubles));
	}
	
	// A method that takes integer array as an argument and returns average. 
	public static double average(int[] array) {
		double average = 0;
		int sum = 0; 
		
		// Add value to the sum variable. 
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		average = (double) sum / array.length; // Calculate average.
		return average; 
	}
	
	// A method that takes double array as an argument and returns average. 
	public static double average(double[] array) {
		double average = 0;
		double sum = 0; 
		
		// Add value to the sum variable. 
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		average = (double) sum / array.length; // Calculate average. 
		return average; 
	}
}
