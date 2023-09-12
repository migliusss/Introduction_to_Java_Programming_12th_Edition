package chapter_07;

/*
 * (Game: dice) Suppose three dice are thrown at random. Write a program that
 * shows all possible permutations or configurations of the three dice that yield the 
 * sum of nine. 
 */

public class Exercise_07_29 {
	public static void main(String[] args) {
		int targetSum = 9; // The target sum

        // Nested loops to represent the rolls of three dice
        for (int die1 = 1; die1 <= 6; die1++) {
            for (int die2 = 1; die2 <= 6; die2++) {
                for (int die3 = 1; die3 <= 6; die3++) {
                    int sum = die1 + die2 + die3; // Calculate the sum of the three dice

                    // Check if the sum matches the target sum
                    if (sum == targetSum) {
                        System.out.println("Dice 1: " + die1 + ", Dice 2: " + die2 + ", Dice 3: " + die3);
                    }
                }
            }
        }
	}
}
