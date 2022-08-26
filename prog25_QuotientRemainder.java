/* 25) Program to Compute Quotient and Remainder */

package marupadi;

import java.util.Scanner;

public class prog25_QuotientRemainder {

	public static void main(String[] args) {
		// Getting Dividend and Divisor input
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter Dividend :");
		int dividend = in1.nextInt();

		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter Divisor :");
		int divisor = in2.nextInt();

		// Calculating Quotient and Remainder
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		// Print the result
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}
