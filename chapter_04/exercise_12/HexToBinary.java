package chapt4;

/*
 * Write a program that prompts the user to enter a hex digital and 
 * displays its corresponding binary number in four digits. For example, hex digit 7 
 * is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For 
 * an incorrect input, display invalid input. 
 */

import java.util.Scanner;

public class HexToBinary {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a hex digit: ");
		char hex = input.nextLine().charAt(0);
		
		// Create an empty string. 
		String result = "";
		
		// Switch to find the binary value. 
		switch (hex) {
		case '0': result = "0"; break;
		case '1': result = "1"; break;
		case '2': result = "10"; break;
		case '3': result = "111"; break;
		case '4': result = "100"; break;
		case '5': result = "101"; break;
		case '6': result = "110"; break;
		case '7': result = "111"; break;
		case '8': result = "1000"; break;
		case '9': result = "1001"; break;
		case 'A': result = "1010"; break;
		case 'B': result = "1011"; break;
		case 'C': result = "1100"; break;
		case 'D': result = "1101"; break;
		case 'E': result = "1110"; break;
		case 'F': result = "1111"; 
		default: System.out.print(hex + " is invalid input"); System.exit(1);
		}
		// Display results. 
		System.out.println("The binary value is " + result);
	}
}
