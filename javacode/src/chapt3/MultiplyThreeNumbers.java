package chapt3;

/*
 * The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to enter 
 * the product of these two integers. Revise the program to generate three single-digit integers and prompts the user 
 * to enter the multiplication of these three 
 */

import java.util.Scanner;

public class MultiplyThreeNumbers {
	public static void main(String[] args) {
		// Generate 3 random numbers. 
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 100 % 10);
		int number3 = (int) (System.currentTimeMillis() / 10 % 10);
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + "?");
		int answer = input.nextInt();
		
		// Calculate and display results. 
		System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " 
				+ (number1 * number2 * number3 == answer));
	}
}
