/* 27) Program to Swap Two Numbers */
package marupadi;

import java.util.Scanner;

public class prog27_NumberSwap {

	public static void main(String[] args) {
		// Get 2 numbers as input
		System.out.println("Enter First Number::\n");
		Scanner in1 = new Scanner(System.in);
		int firstNum = in1.nextInt();

		System.out.println("Enter Second Number::\n");
		Scanner in2 = new Scanner(System.in);
		int secondNum = in2.nextInt();

		int tempNum;
		// Swap the two using temp variable
		tempNum = firstNum;
		firstNum = secondNum;
		secondNum = tempNum;

		// Print the result
		System.out.println("First Number :" + firstNum);
		System.out.println("Second Number :" + secondNum);

	}

}
