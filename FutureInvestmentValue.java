package chapt2;

import java.util.Scanner;

public class FutureInvestmentValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual investment rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double futureInvestmentValue = investmentAmount * Math.pow((++monthlyInterestRate), (numberOfYears * 12));
		
		System.out.println("Future value is " + futureInvestmentValue);
	}
}
