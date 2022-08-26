/* 30) Program to Find the Largest Number Among Three Numbers */

package marupadi;

import java.util.Scanner;

public class prog30_LargestNumber {

	public static void main(String[] args) {
		// Getting input - first number
		System.out.println("Enter First Number:");
		Scanner in1 = new Scanner(System.in);
		int firstNum = in1.nextInt();

		// Getting input - second number
		System.out.println("Enter Second Number:");
		int secondNum = in1.nextInt();

		// Getting input - third number
		System.out.println("Enter Third Number:");
		int thirdNum = in1.nextInt();

		// checking if the numbers are equal
		if ((firstNum == secondNum) && (firstNum == thirdNum) && (secondNum == thirdNum)) {
			System.out.println("All given number are equal!");
		}
		// else using if-else if cheking for the largest among the given number and
		// print the result
		else {
			if ((firstNum > secondNum) && (firstNum > thirdNum)) {
				System.out.println(firstNum + " is the greatest among three Numbers.");
			} else if ((secondNum > firstNum) && (secondNum > thirdNum)) {
				System.out.println(secondNum + " is the greatest among three Numbers.");

			} else {
				System.out.println(thirdNum + " is the greatest among three Numbers.");

			}
		}
	}
}
