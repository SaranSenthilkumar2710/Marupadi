/* 15) Write a program to find the area of the cylinder */
package marupadi;

import java.util.Scanner;

public class Prog15_AreaCylinder {
	public static void main(String[] args) {
		double radius, height, area;
		Scanner s = new Scanner(System.in);

		// Getting input radius and height of cylinder
		System.out.println("Enter the Radius of Cylinder :");
		radius = s.nextDouble();

		System.out.println("Enter the Height of Cylinder :");
		height = s.nextDouble();

		// Calculate area of the Cylinder [Area = (2*PI*r*r)+ (2*PI*r*h)]
		area = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);

		// Print the Result
		System.out.println("Area of Cylinder : " + area);

	}

}
