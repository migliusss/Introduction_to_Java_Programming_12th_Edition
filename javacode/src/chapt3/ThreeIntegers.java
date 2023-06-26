package chapt3;

/*
 * Write a program that prompts the user to enter three integers 
 * and display the integers in non-decreasing order. 
 */

import java.util.Scanner;

public class ThreeIntegers {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// If else statements to sort the numbers. 
		if (number1 <= number2 && number2 <= number3) {
			System.out.println(number1 + " " + number2 + " " + number3);
		}
		else if (number1 <= number3 && number3 <= number2) {
			System.out.println(number1 + " " + number3 + " " + number2);
		}
		else if (number2 <= number1 && number1 <= number3) {
			System.out.println(number2 + " " + number1 + " " + number3);
		}
		else if (number2 <= number3 && number3 <= number1) {
			System.out.println(number2 + " " + number3 + " " + number1);
		}
		else if (number3 <= number1 && number1 <= number2) {
			System.out.print(number3 + " " + number1 + " " + number2);
		}
		else 
			System.out.print(number3 + " " + number2 + " " + number1);
	}
}
