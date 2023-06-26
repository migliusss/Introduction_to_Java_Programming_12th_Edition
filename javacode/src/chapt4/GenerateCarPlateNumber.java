package chapt4;

/*
 * Assume that a vehicle plate number consists 
 * of three uppercase letters followed by four digits. Write a program to generate a 
 * plate number. 
 */

public class GenerateCarPlateNumber {
	public static void main(String[] args) {
		// Generate random numbers and cast them to letters. 
		char uppercaseLetterOne = (char) (65 + (int)(Math.random() * (90 + 1 - 65)));
		char uppercaseLetterTwo = (char) (65 + (int)(Math.random() * (90 + 1 - 65)));
		char uppercaseLetterThree = (char) (65 + (int)(Math.random() * (90 + 1 - 65)));
		
		// Generate a random digit. 
		int digitOne = (int)(Math.random() * 10);
		int digitTwo = (int)(Math.random() * 10);
		int digitThree = (int)(Math.random() * 10);
		
		// Display a vehicle plate number. 
		System.out.print("Plate number " + uppercaseLetterOne + uppercaseLetterTwo + uppercaseLetterThree +
				digitOne + digitTwo + digitThree);
	}
}
