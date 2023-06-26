package chapt4;

/*
 * Write a program that generates three random points 
 * on a circle centered (0, 0) with radius 40 and displays three angles in a triangle 
 * formed by these three points, as shown in Figure 4.4.a. Display the angles in 
 * degrees. 
 */

public class RandomPointsInCircle {
	public static void main(String[] args) {
		
		final int RADIUS = 40; 
		
		// Get random angles. 
		double angle1 = (int)(Math.random() * (2 * Math.PI));
		double angle2 = (int)(Math.random() * (2 * Math.PI));
		double angle3 = (int)(Math.random() * (2 * Math.PI));
		
		// Get x and y. 
		double x1 = RADIUS * Math.cos(angle1);
		double y1 = RADIUS * Math.sin(angle1);
		double x2 = RADIUS * Math.cos(angle2);
		double y2 = RADIUS * Math.sin(angle2);
		double x3 = RADIUS * Math.cos(angle3);
		double y3 = RADIUS * Math.sin(angle3);
		
		// Compute three sides. 
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		// Compute three angles. 
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		// Display results. 
		System.out.println("The three angles are " 
				+ Math.round(A * 100) / 100.0 + " " 
				+ Math.round(B * 100) / 100.0 + " " 
				+ Math.round(C * 100) / 100.0);
	}
}
