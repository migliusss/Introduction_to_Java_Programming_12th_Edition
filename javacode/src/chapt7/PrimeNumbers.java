package chapt7;

/*
 * Listing 5.15 determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, ..., n/2 is a divisor. 
 * If a divisor is found, n is not a prime. A more efficient approach is to check whether any of the 
 * prime numbers less than or equal to root of n can divide n evenly. If not, n is a prime. 
 * 
 * Rewrite Listing 5.15 to display the first 50 prime numbers using this approach. 
 * You need to use an array to store the prime numbers, and later use them to check 
 * whether they are possible divisor for n. 
 */

public class PrimeNumbers {
	public static void main(String[] args) {
		int count = 0; 
		int number = 2; 
		int[] primeNumbers = new int[50]; // Array for storing prime numbers. 
		
		// A while loop to check the first 50 prime numbers. 
		while (count < 50) {
			boolean isPrime = true; // Assume the number is prime. 
			
			// Check whether any of the prime numbers less than or equal to root of n can divide n evenly. 
			for (int divisor = 0; divisor < count && primeNumbers[divisor] <= Math.sqrt(number); divisor++) {
				if (number % primeNumbers[divisor] == 0) {
					isPrime = false;
					break;
				}
			}
			
			// If the number is prime, add n to the array of prime numbers. 
			if (isPrime) {
				primeNumbers[count] = number;
				count++;
				
				// Display numbers, 10 per line. 
				if (count % 10 == 0) {
					System.out.println(number);
				}
				else {
					System.out.print(number + " ");
				}
				
			}
			// Check if the next number is prime. 
			number++;
		}
		
	}
	 
}
