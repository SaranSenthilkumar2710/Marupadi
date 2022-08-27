/* 4) Write a program to define the functionality of a Bitwise operators.*/
package marupadi;

import java.util.Scanner;

public class prog4_BitwiseOperator {
	public static void main(String[] args) {
		// Getting Input x and y
		System.out.println("Enter two numbers to perform the Bitwise operators functions:");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		// Print the numbers x and y
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("Bitwise Operators");
		// Perform the Bitwise operator functionalities
		// bitwise AND(&)
		System.out.println("1. AND (x & y) = " + (x & y));
		// bitwise XOR(^)
		System.out.println("2. OR (x ^ y) = " + (x ^ y));
		// bitwise inclusive OR(|)
		System.out.println("3. XOR (x | y) = " + (x | y));
		// bitwise compliment (~)
		System.out.println("4. Compliment (~x) = " + (~x));
		// bitwise signed right shift operator (>>)
		System.out.println("5. Signed right shift (x>>2) = " + (x >> 2));
		// bitwise signed left shift operator (<<)
		System.out.println("6. Signed left shift (x<<1) = " + (x << 1));
		// bitwise unsigned right shift operator (>>>)
		System.out.println("7. Unsigned right shift (x>>>2) = " + (x >>> 2));
	}
}
