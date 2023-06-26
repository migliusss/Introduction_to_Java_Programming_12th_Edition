package chapt9;

import java.util.Date;

/*
 * Design a class named Account. 
 * 
 * Draw the UML diagram for the class then implement the class. 
 * 
 * Write a test program that creates an Account object with an account ID of 1122, 
 * a balance of $20,000 and an annual interest rate of 4.5%. Use the withdraw 
 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print 
 * the balance, the monthly interest, and the date when this account was created.  
 */

public class Account {
	/** Private data fields to store id, balance, annual interest rate and date created. */
	private int id;
	private double balance;
	private double annaulInterestRate;
	private Date dateCreated;
	
	/** No-arg constructor to create a default account. */
	public Account() {
		id = 0;
		balance = 0;
		annaulInterestRate = 0;
		dateCreated = new Date();
	}
	
	/** A constructor that creates an account with the specified id and initial balance */
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance; 
		dateCreated = new Date();
	}
	
	/** The accessor and mutator methods for id, balance, and annualInterestRate. */
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnaulInterestRate() {
		return annaulInterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annaulInterestRate) {
		this.annaulInterestRate = annaulInterestRate;
	}
	
	/** Get method for dateCreated */
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	/** A method that return monthly interest rate. */ 
	public double getMonthlyInterestRate() {
		return annaulInterestRate / 12;
	}
	
	/** A method that returns monthly interest. */
	public double getMonthlyInterest() {
		return this.balance * (getMonthlyInterestRate() / 100);
	}
	
	/** A method that withdraws a specified amount from the account. */
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	/** A method that deposits a specified amount to the account */
	public void deposit(double amount) {
		this.balance += amount;
	}
}
