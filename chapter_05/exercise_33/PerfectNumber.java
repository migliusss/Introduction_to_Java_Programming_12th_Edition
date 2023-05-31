package chapt5;

/*
 * A positive integer is called a perfect number if it is equal to the sum 
 * of all its positive divisors, excluding itself. For example, 6 is the first perfect 
 * number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are 
 * four perfect numbers < 10,000. Write a program to find all these four numbers. 
 */

public class PerfectNumber {
	public static void main(String[] args) {
		// Print header. 
		System.out.println("Four perfect numbers under 10,000: ");
		
		// A loop that checks all the numbers under 10000. If the number is not perfect find a new number. 
		for (int number = 1; number < 10000; number++) {
			int sum = 0; // A variable that is used to sum the numbers and check if its the perfect number. 
			
			for (int j = 1; j < number; j++) {
				
				if (number % j == 0) {
					sum += j;
				}
			}
			// Checks if the number is perfect. 
			if (number == sum) {
				System.out.println(number);
			}
		}	
	}
}
