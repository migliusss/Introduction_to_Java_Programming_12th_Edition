package chapt3;

/**
 * Revise Listing 3.8, Lottery.java, to generate a lottery of a three-
 * digit number. The program prompts the user to enter a three digit number and 
 * determines whether the user wins according to the following rules: 
 * 
 * 1. If the user input matches the lottery number in the exact order, the award is $12,000. 
 * 2. If all the digits in the user input match all in the lottery number, the award is $5,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $2,000.
 */

import java.util.Scanner;

public class Lottery2 {
	public static void main(String[] args) {
		// Generates lottery number. 
		int lottery = (int) (Math.random() * 1000);
		
		// Prompt the user to enter a guess.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter lottert pick (three digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery. 
		int lotteryDigit3 = lottery % 10;
		int lotteryRemainder = lottery / 10;
		
		int lotteryDigit2 = lotteryRemainder % 10;
		
		int lotteryDigit1 = lottery / 100;
		
		// Get digits from guess. 
		int guessDigit3 = guess % 10;
		int guessRemainder = guess / 10;
		
		int guessDigit2 = guessRemainder % 10;
		
		int guessDigit1 = guess / 100;
		
		System.out.println("The lottery number is: " + lottery);
		
		// Check the guess. 
		if (guess == lottery)
			System.out.println("Exact match: you win $12,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit1
				&& guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit2 && guessDigit2 == lotteryDigit3)
			System.out.println("Match all digits: you win $5,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
			System.out.println("Math one digit: you win $2,000");
		else 
			System.out.println("Sorry, no match");
	}
}
