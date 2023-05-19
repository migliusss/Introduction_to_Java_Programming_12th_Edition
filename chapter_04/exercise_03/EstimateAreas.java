package chapt4;

/*
 * Use the GPS locations for Atlanta, Georgia; 
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the 
 * figure in Section 4.1 to compute the estimated area enclosed by these four cities. 
 */

public class EstimateAreas {
	public static void main(String[] args) {
		final double AVERAGE_EART_RADIUS = 6371.01;
		
		// Initialize the variables with x and y. 
		double atlantaX = Math.toRadians(33.7489954);
		double atlantaY = Math.toRadians(-84.3879824);
		
		double charlotteX = Math.toRadians(35.2270869);
		double charlotteY = Math.toRadians(-80.8431267);
		
		double savannahX = Math.toRadians(32.0835407);
		double savannahY = Math.toRadians(-81.0998342);
		
		double orlandoX = Math.toRadians(28.5383355);
		double orlandoY = Math.toRadians(-81.3792365);
		
		// Using the formula in Programming Exercise 4.2 to compute the distance between two cities. 
		double atlantaCharlotte = AVERAGE_EART_RADIUS * Math.acos(Math.sin(atlantaX) * Math.sin(charlotteX) + 
				Math.cos(atlantaX) * Math.cos(charlotteX) * Math.cos((atlantaY - charlotteY)));
		
		double charlotteSavannah = AVERAGE_EART_RADIUS * Math.acos(Math.sin(charlotteX) * Math.sin(savannahX) + 
				Math.cos(charlotteX) * Math.cos(savannahX) * Math.cos((charlotteY - savannahY)));
		
		double savannahAtlanta = AVERAGE_EART_RADIUS * Math.acos(Math.sin(savannahX) * Math.sin(atlantaX) + 
				Math.cos(savannahX) * Math.cos(atlantaX) * Math.cos((savannahY-atlantaY)));
		
		double savannahOrlando = AVERAGE_EART_RADIUS * Math.acos(Math.sin(savannahX) * Math.sin(orlandoX) + 
				Math.cos(savannahX) * Math.cos(orlandoX) * Math.cos((savannahY-orlandoY)));
		
		double orlandoAtlanta = AVERAGE_EART_RADIUS * Math.acos(Math.sin(orlandoX) * Math.sin(atlantaX) + 
				Math.cos(orlandoX) * Math.cos(atlantaX) * Math.cos((orlandoY-atlantaY)));
		
		double triangleSide1 = (atlantaCharlotte + charlotteSavannah + savannahAtlanta) / 2;
		double triangleArea1 = Math.sqrt(triangleSide1 * (triangleSide1 - atlantaCharlotte) * 
				(triangleSide1 - charlotteSavannah) * (triangleSide1 - savannahAtlanta));
		
		double triangleSide2 = (savannahAtlanta + orlandoAtlanta + savannahOrlando) / 2;
		double triangleArea2 = Math.sqrt(triangleSide2 * (triangleSide1 - savannahAtlanta) * 
				(triangleSide2 - orlandoAtlanta) * (triangleSide2 - savannahOrlando));
		
		// Display results. 
		System.out.println("The area of triangle 1 is: " + triangleArea1);
		System.out.println("The area of triangle 2 is: " + triangleArea2);
		
	}
}
