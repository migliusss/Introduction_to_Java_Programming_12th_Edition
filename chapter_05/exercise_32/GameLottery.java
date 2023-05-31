package chapt5;

import java.util.Scanner;

/*
 * Revise Listing 3.8, Lottery.java, to generate a lottery of a two digit number.
 * the two digit in the number are distinct. (Hint: Generate the first 
 * digit. Use a loop to continuously generate the second digit until it is different 
 * from the first digit. 
 */

public class GameLottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		// Generate digits. 
		int lotteryDigit1 = (int) (1 * Math.random() * 10);
		int lotteryDigit2 = (int) (Math.random() * 10);
		
		// Generate a new lottery digit until the digits are different. 
		while (lotteryDigit1 == lotteryDigit2) {
				lotteryDigit2 = (int) (Math.random() * 10);
		}
		
		// Get digits from guess. 
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery digit is " + lotteryDigit1 + lotteryDigit2);
		
		// Check the guess. 
		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
			System.out.println("Exact match: you win $10,000");
		}
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
			System.out.println("Match all digits: you win $3,000");
		}
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: you win $1,000");
		}
		else {
			System.out.println("Sorry, no match");
		}
			
	}
}
