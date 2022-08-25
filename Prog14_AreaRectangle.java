/* 14) Write a program to find the area of the rectangle */
package marupadi;

import java.util.Scanner;

public class Prog14_AreaRectangle {
	public static void main(String[] args) {
		double length,width,area;
		// Getting input length and width
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length of the rectangle : ");
		length = in.nextDouble();
		System.out.print("Enter width of the rectangle : ");
		width = in.nextDouble();

		// Calculate area of the Rectangle [Area = length * width]
		area = length * width;

		// Print the Result
		System.out.println("Area of Rectangle : " + area);

	}
}
