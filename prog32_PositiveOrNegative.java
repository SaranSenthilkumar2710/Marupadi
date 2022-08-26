/* 32) Program to Check Whether a Number is Positive or Negative */
package marupadi;

import java.util.Scanner;

public class prog32_PositiveOrNegative {
	public static void main(String[] args) {
		// Getting the input number from the user
		System.out.println("Enter Number:");
		Scanner in1 = new Scanner(System.in);
		int myNum = in1.nextInt();

		// if the number is greater than 0, then that is Positive no/else negative
		if (myNum < 0) {
			System.out.println("The given NUmber " + myNum + " is a Negative Number");
		} else {
			System.out.println("The given NUmber " + myNum + " is a Positive Number");
		}
	}
}
