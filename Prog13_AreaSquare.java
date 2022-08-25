/* 13) Write a program to find the area of the square */
package marupadi;

import java.util.Scanner;

public class Prog13_AreaSquare {
	public static void main(String args[]) {
		double area, side;
		
		//Getting Input side of the square
		System.out.println("Enter the side of the Square:");
		Scanner in = new Scanner(System.in);
		side = in.nextDouble();
		
		// Calculate the area of the square  [Area = length * width]
		area = side * side;
		
		//Print the Result
		System.out.println("Area of the Square : " + area);
	}
}
