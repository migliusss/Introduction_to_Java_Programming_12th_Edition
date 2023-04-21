package chapt3;

/*
 * Write a program that randomly generates an integer between 1 and 7 and displays the name of a color, 
 * in the rainbow - violet, indigo, blue, green, yellow, orange, and red - for numbers 1, 2, 3, ..., 7 accordingly. 
 */

public class RandomColor {
	public static void main(String[] args) {
		// Generate a random integer between 1 and 7.
		int number = 1 + (int) (Math.random() * 7);
		
		// If else statement for printing the color based on the integer. 
		if (number == 1)
			System.out.println("violet");
		else if (number == 2) {
			System.out.println("indigo");
		}
		else if (number == 3) {
			System.out.println("blue");
		}
		else if (number == 4) {
			System.out.println("green");
		}
		else if (number == 5) {
			System.out.println("yellow");
		}
		else if (number == 6) {
			System.out.println("orange");
		}
		else {
			System.out.println("red");
		}
	}
}
