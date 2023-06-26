package chapt5;

/*
 * Rewrite Programming Exercise 5.39 as follows: 
 * 
 * Use a while loop instead of a do-while loop. 
 * Let the user enter COMISSION_SOUGHT instead of fixing it as a constant. 
 */

import java.util.Scanner;

public class SalesAmount2 {
	public static void main(String[] args) {
		double commission = 0; 
		double salesAmount = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter comission sought: ");
		int commissionSought = input.nextInt();
		
		// Create a loop that increases the sales amount until commission is 30000. 
		while (commission < commissionSought) {
			salesAmount += 100; // Increment sales by 100. 
			
			if (salesAmount <= 5000) {
                commission = salesAmount * 0.06;
			}
			else if (salesAmount <= 10000) {
				commission = (5000 * 0.06) + ((salesAmount - 5000) * 0.08);
			} 
			else {
				commission = (5000 * 0.06) + (5000 * 0.08) + ((salesAmount - 10000) * 0.10);
			}
		}
		
		// Print results. 
		System.out.println("The minimum amount of sales in order to make $" + commissionSought + ": $" + salesAmount); 
	}
}
