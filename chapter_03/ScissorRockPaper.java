package chapt3;

/*
 * Write a program that plays the popular scissor-
 * rock-paper game. (A scissor can cut a paper, a rock can knock a scissor, and 
 * a paper can wrap a rock.) The program randomly generates a number 0, 1, or
 * 2 representing scissor, rock, and paper. The program prompts the user to enter
 * a number 0, 1, or 2 and displays a message indicating whether the user or the 
 * computer wins, loses or draws. 
 */

import java.util.Scanner;

public class ScissorRockPaper {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userNumber = input.nextInt();
		
		// Generate a random number 1, 2 or 3. 
		int computerNumber = (int) (Math.random() * 3);
		
		// Check who wins and displays a message accordingly. 
		if (userNumber == 0 && computerNumber == 0) {
			System.out.println("The computer is scissors. You are scissors too. It is a draw");
		}
		else if (userNumber == 0 && computerNumber == 1) {
			System.out.println("The computer is rock. You are scissors. You lost");
		}
		else if (userNumber == 0 && computerNumber == 2) {
			System.out.println("The computer is paper. You are scissors. You won");
		}
		else if (userNumber == 1 && computerNumber == 0) {
			System.out.println("The computer is scissors. You are rock. You won");
		}
		else if (userNumber == 1 && computerNumber == 1) {
			System.out.println("The computer is rock. You are rock too. It is a draw");
		}
		else if (userNumber == 1 && computerNumber == 2) {
			System.out.println("The computer is paper. You are rock. You lost");
		}
		else if (userNumber == 2 && computerNumber == 0) {
			System.out.println("The computer is scissors. You are paper. You lost");
		}
		else if (userNumber == 2 && computerNumber == 1) {
			System.out.println("The computer is rock. You are paper. You won");
		}
		else if (userNumber == 2 && computerNumber == 2) {
			System.out.println("The computer is paper. You are paper too. It is a draw");
		}
		else {
			System.out.println("Error: invalid number");
		}
		
	}
}
