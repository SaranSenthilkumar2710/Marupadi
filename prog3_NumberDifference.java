/* 3) Write a program to find the difference between the given number and it's reverse
number.*/
package marupadi;

import java.util.Scanner;

public class prog3_NumberDifference {

	public static void main(String[] args) {
		System.out.println("Enter a Number :");

		Scanner in = new Scanner(System.in);
		int myNum;
		int revNum;
		int numDiff;
		// Getting Input number from the user
		String myStr = in.nextLine();
		// Reverse the given no using StringBuffer reverse method
		String strReverse = new StringBuffer(myStr).reverse().toString();
		System.out.println("Reverse Number : ");
		System.out.println(strReverse);
		// Converting both input and its reverse into integer
		myNum = Integer.parseInt(myStr);
		revNum = Integer.parseInt(strReverse);
		// Find the difference and print it
		numDiff = myNum - revNum;
		System.out.println("Difference between given number and its Reverse :");
		System.out.println(numDiff);

	}

}
