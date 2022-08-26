/* 34) Program to Calculate the Sum of Natural Numbers and find the largest digit of the
sum. */
package marupadi;

import java.util.Scanner;

public class prog34_SumOfNaturalNumbers {

	public static void main(String[] args) {

		int lowerLimit, upperLimit, sum, highDigit = 0, reminder, sumNum;
		// Getting Inputs upper and lower limit numbers
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the lower limit ");
		lowerLimit = in.nextInt();
		System.out.print("Enter the upper limit ");
		upperLimit = in.nextInt();
		sum = 0;

		// sum of all numbers within the given range
		for (int i = lowerLimit; i <= upperLimit; ++i) {
			sum += i;
		}
		sumNum = sum;

		// finding the largest Digit
		while (sumNum > 0) {
			reminder = sumNum % 10;
			if (highDigit < reminder) {
				highDigit = reminder;
			}
			sumNum = sumNum / 10;
		}
		System.out.println("The sum of natural numbers from " + lowerLimit + " to " + upperLimit + " is " + sum
				+ "\n The highest digit is " + highDigit);

	}

}
