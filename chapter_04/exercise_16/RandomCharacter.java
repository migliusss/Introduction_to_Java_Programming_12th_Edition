package chapt4;

/*
 * Write a program that displays a random lowercase letter 
 * using the Math.random() method. 
 */

public class RandomCharacter {
	public static void main(String[] args) {
		
		// Generate a random number from 97 to 127. 
		int number = 97 + (int)(Math.random() * (123 - 1 - 97));
		
		// Display the character by casting the integer to char. 
		System.out.println((char)(number));
	}
}
