/* 60) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms */
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog60_SumOfSeries {
	public static void main(String[] args) {
		// Getting Input range
		System.out.println("Enter the range for the Series :");
		Scanner in = new Scanner(System.in);
		int range = in.nextInt();
		System.out.println("Given Number :" + range);
		int[] serArr = new int[range];
		int j = 1;

		// Iterate till the range to generate the series
		for (int i = 0; i < range; i++) {

			serArr[i] = j;
			j = j * 10 + 1;

		}
		// Printing the series
		System.out.println("series is  :" + Arrays.toString(serArr));
		// Printing the sum of series
		System.out.println("Sum of the Series   :" + Arrays.stream(serArr).sum());
	}
}
