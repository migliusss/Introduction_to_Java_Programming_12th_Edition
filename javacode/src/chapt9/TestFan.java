package chapt9;

public class TestFan {
	// Main method. 
	public static void main(String[] args) {
		// Create the first Fan object.
		Fan fanOne = new Fan();
		
		// Assign speed, radius, color and turn it on. 
		fanOne.setSpeed(3);
		fanOne.setRadius(10);
		fanOne.setColor("yellow");
		fanOne.setOn(true);
		
		// Create the second Fan object.
		Fan fanTwo = new Fan();
		
		// Assign speed, radius, color and turn it on.  
		fanTwo.setSpeed(2);
		fanTwo.setRadius(5);
		fanTwo.setColor("blue");
		fanTwo.setOn(true);
		
		// Display the description of each Fan object.
		System.out.println(fanOne.toString());
		System.out.println();
		System.out.println(fanTwo.toString());
	}
}
