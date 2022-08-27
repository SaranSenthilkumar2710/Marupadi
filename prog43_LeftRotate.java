/* 43) Java Program to left rotate the elements of an array */
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog43_LeftRotate {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		// Getting Input length of the array
		System.out.println("Enter the length of the array:");
		int length = in.nextInt();
		// Initialize the arrays with given length
		int[] myArray = new int[length];
		int[] leftShiftedArray = new int[length];

		System.out.println("Enter the elements of the array:");
		// Get the elements one by one and put it in array
		for (int i = 0; i < length; i++) {
			myArray[i] = in.nextInt();
		}

		// Left rotate the elements by changing the index of the array and put it in
		// resultant array

		for (int i = 0; i < myArray.length; i++) {
			if (i == myArray.length - 1) {
				leftShiftedArray[myArray.length - 1] = myArray[0];
			} else
				leftShiftedArray[i] = myArray[i + 1];

		}

		System.out.println("Given Array : " + Arrays.toString(myArray));
		System.out.println("Left shifted Array :" + Arrays.toString(leftShiftedArray));
	}
}