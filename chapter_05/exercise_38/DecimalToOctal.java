import java.util.Scanner;

/*
 * Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don't use Java's Ineteger.toOctalString(int)
 * in this program. 
 */

public class DecimalToOctal {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		
		System.out.print("Octal: ");
		while (decimal != 0) {
			
			int remainder = decimal % 8; // Find the remainder. 
			decimal /= 8; // Keep dividing decimal by 2 until it is 0. 

			// Print the binary number. 
			System.out.print(remainder);
		}
	}
}
