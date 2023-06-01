package chapt5;

/*
 * Programming Exercise 3.17 gives a program that 
 * plays the scissor-rock-paper game. Revise the program to let the user continuously 
 * play until either the user or the computer wins three times more than their 
 * opponent. 
 */

import java.util.Scanner;

public class ScissorRockPaper2 {
	public static void main(String[] args) {
		int computerScore = 0;
		int userScore = 0;
		int winner = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// A loop that checks if either computer or the user wins by more than 3 times. 
		while(winner != 3 && winner != -3) {
			
			// Prompt the user. 
			System.out.print("scissor (0), rock (1), paper (2): ");
			int userNumber = input.nextInt();
			
			// Generate a random number 1, 2 or 3. 
			int computerNumber = (int) (Math.random() * 3);
			
			// Check who wins and displays a message accordingly. 
			if (userNumber == 0 && computerNumber == 0) {
				System.out.println("The computer is scissors. You are scissors too. It is a draw");
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 0 && computerNumber == 1) {
				System.out.println("The computer is rock. You are scissors. You lost");
				computerScore++;
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 0 && computerNumber == 2) {
				System.out.println("The computer is paper. You are scissors. You won");
				userScore++;
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 1 && computerNumber == 0) {
				System.out.println("The computer is scissors. You are rock. You won");
				userScore++;
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 1 && computerNumber == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw");
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 1 && computerNumber == 2) {
				System.out.println("The computer is paper. You are rock. You lost");
				computerScore++;
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 2 && computerNumber == 0) {
				System.out.println("The computer is scissors. You are paper. You lost");
				computerScore++;
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 2 && computerNumber == 1) {
				System.out.println("The computer is rock. You are paper. You won");
				userScore++;
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else if (userNumber == 2 && computerNumber == 2) {
				System.out.println("The computer is paper. You are paper too. It is a draw");
				System.out.println("Computer: " + computerScore + " You: " + userScore);
			}
			else {
				System.out.println("Error: invalid number");
			}
			
			// Check the results. 
			winner = computerScore - userScore;
		}
		
		// Print a winner. 
		if (winner >= 3) {
			System.out.println("Computer wins!");
		}
		else {
			System.out.println("You win!");
		}
	}
}
