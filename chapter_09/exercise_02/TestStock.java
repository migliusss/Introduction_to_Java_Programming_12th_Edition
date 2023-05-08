package chapt9;

public class TestStock {
	public static void main(String[] args) {
		// Create a Stock object. 
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		
		// Set previousClosingPrice to 34.5$.
		stock.previousClosingPrice = 34.5; 
		
		// Set currentPrice to 34.35$.
		stock.currentPrice = 34.35;
		
		// Display the price-change percentage. 
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.println("Stock name: " + stock.name);
		System.out.printf("Price-change percentage: %.2f%%", stock.getChangePercent());
	}
}
