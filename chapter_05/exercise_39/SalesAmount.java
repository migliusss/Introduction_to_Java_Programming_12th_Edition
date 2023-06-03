package chapt5;

/*
 * You have just started a sales job 
 * in a department store. Your pay consists of a base salary and a commission. The
 * base salary is $5,000. The scheme shown below is used to determine the commission
 * rate. 
 * 
 * Note that this is a graduated rate. The rate for the first $5,000 is at 6%, the next
 * $5000 is at 8%, and the rest is at 10%. If your sales amounts to $25,000, the 
 * commission is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200. 
 * Your goal is to earn $30,000 a year. Write a program to find the minimum sales 
 * you have to generate in order to make $30,000. 
 */

public class SalesAmount {
	public static void main(String[] args) {
		final double COMISSION_GOAL = 30000;
		double commission = 0; 
		double salesAmount = 0;
		
		// Create a loop that increases the sales amount until commission is 30000. 
		while (commission < COMISSION_GOAL) {
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
		System.out.println("The minimum amount of sales in order to make $30,000: $" + salesAmount); 
		
	}
}
