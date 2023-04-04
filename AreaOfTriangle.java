package chapt2;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of three points separated by spaces like "
				+ "x1 y1 x2 y2 y3: ");
		
		double aX = input.nextDouble();
		double aY = input.nextDouble();
		double bX = input.nextDouble();
		double bY = input.nextDouble();
		double cX = input.nextDouble();
		double cY = input.nextDouble();
		
		double areaTriangle = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
		
		System.out.println("The area of the triangle is " + areaTriangle);
	}
}
