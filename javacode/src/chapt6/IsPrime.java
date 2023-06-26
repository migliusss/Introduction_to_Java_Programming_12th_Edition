package chapt6;

/*
 * Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for 
 * testing whether a number is prime. Use this method to find the number of prime numbers less than 1000.
 */

public class IsPrime {
	public static void main(String[] args) {
		System.out.println("Prime numbers less than 1000 are: \n");
		
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line. 
		int count = 0; // Count the number of prime numbers. 
		int number = 2; // A number to be tested for primeness. 
		
		// Repeatedly find prime numbers. 
		while (number < 1000) {
			if (isPrime(number)) {
				count++;
				
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line. 
					System.out.printf("%-5d\n", number);
				}
				else {
					System.out.printf("%-5d", number);
				}
			}
			
			// Check whether the next number is prime.
			number++;
		}
		
	}
	// Check whether number is prime. 
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime. 
				return false; // Number is not a prime. 
			}
		}
		
		return true; // Number is prime. 
	}
}
