package chapt9;

/*
 * Following the example of the Circle class in Section 9.2, 
 * design a class names Stock.
 * 
 * Draw the UML diagram for the class then implement the class. Write a test program
 * that creates a Stock object with the stock symbol ORCL, the name Oracle
 * Corporation, and the previous closing price of 34.5. Set a new current price to
 * 34.35 and display the price change percentage. 
 */

public class Stock {
	/** The symbol and name of the Stock. */
	String symbol;
	String name; 
	double previousClosingPrice;
	double currentPrice;
	
	/** Constructor that creates a Stock object with a specified name and symbol. */
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	/** A method that returns the percentage changed from previousClosingPrice to currentPrice. */
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
	}
}
