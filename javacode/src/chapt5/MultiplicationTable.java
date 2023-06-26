package chapt5;

/*
 * Write a program that uses for, while, and do-while 
 * loop statements to display the multiplication table. 
 */

public class MultiplicationTable {
	public static void main(String[] args) {
		// A multiplication table using a for loop. 
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%-1d * %-1d = %-4d", j, i, (j * i));
			}
			
			System.out.println();
		}
		
		// A multiplication table using a while loop.
		System.out.println();
		
		int i = 1;
		
		while (i <= 9) {
			int j = 1;
			
			while (j <= 9) {
				System.out.printf("%-1d * %-1d = %-4d", j, i, (j * i));
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		// A multiplication table using a do-while loop. 
		System.out.println();
		
		i = 1;
		
		do {
			int j = 1;
			
			do {
				System.out.printf("%-1d * %-1d = %-4d", j, i, (j * i));
				j++;
			} while(j <= 9);
			
			System.out.println();
			i++;
			
		} while (i <= 9);
	}
}
