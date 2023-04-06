/*
 * Tuition for university is $10,000 this year and increase 6% every year. 
 * Write a program that computes the tuition in ten years 
 * and the total cost of four years' worth of tuition after the 10th year. 
 */

package chapt5;

public class FutureTuition {
	public static void main(String[] args) {
		
		double increase = 1.06; // 6% increase. 
		double tuition = 10000; // Tuition. 
		
		for (int i = 1; i <= 10; i++) {
			// Calculate future tuition. 
			tuition = tuition * increase;
			
			System.out.printf("In %2d years tuition will be $%.2f\n", i, tuition);
		}
	}
}
