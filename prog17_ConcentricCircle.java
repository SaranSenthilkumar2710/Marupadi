/* 17) Given the radius of two concentric circle, find the area of the space 
between the circles.*/

package marupadi;

import java.util.Scanner;

public class prog17_ConcentricCircle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Getting Radius of the Outer circle
		System.out.println("Enter Radius of Outer Circle: ");
		int r1 = in.nextInt();
		
		//Getting Radius of the Inner circle
		System.out.println("Enter Radius of Inner Circle: ");
		int r2 = in.nextInt();
		
		//initialize the value of PI 
		double pi = 3.1415926536;

		// Calculate area of outer circle
		double areaOuter = pi * r1 * r1;

		// Calculate area of inner circle
		double areaInner = pi * r2 * r2;

		// Difference in areas
		double difference = areaOuter - areaInner;
		System.out.println("Area of space between two concentric circle :" + difference);
	}
}
