package chapt10;

public class TestMyDate {
	// Main method. 
	public static void main(String[] args) {
		// Create the first MyDate object with no parameters. 
		MyDate dateOne = new MyDate();
		
		// Create the second MyDate object with a parameter. 
		MyDate dateTwo = new MyDate(34355555133101L);
		
		// Display year, month and date for both objects. 
		System.out.println("Current date: ");
		System.out.println("Year: " + dateOne.getYear());
		System.out.println("Month: " + dateOne.getMonth());
		System.out.println("Day: " + dateOne.getDay());
		
		System.out.println("Elapsed time since midnight, January 1, 1970: ");
		System.out.println("Year: " + dateTwo.getYear());
		System.out.println("Month: " + dateTwo.getMonth());
		System.out.println("Day: " + dateTwo.getDay());
	}
}
