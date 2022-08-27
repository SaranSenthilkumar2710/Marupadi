/* 44) Java Program to print the duplicate elements of an array */
package marupadi;

import java.util.Scanner;

public class prog44_DuplicateElements {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		// Getting Input length of the array
		System.out.println("Enter the lenght of the Array ");
		n = in.nextInt();

		// Initialize the array with the given length
		int[] array1 = new int[n];

		System.out.println("Enter the elements of the array: ");

		// Get the elements one by one and put it in array
		for (int i = 0; i < n; i++) {
			array1[i] = in.nextInt();
		}
		// array to store the result
		String resStr = "";
		int aCount = 1;

		// Logic : Compare the elements of the array, if number are repeating then have
		// a count and put the duplicate elements in resultant array
		for (int i = 0; i < array1.length; i++) {
			aCount = 1;

			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					aCount++;
				}
			}

			if (aCount > 1) {
				resStr = resStr + array1[i] + " ";
			}
		}
		if (resStr.length() > 0) {
			System.out.println("Duplicate Elements : " + resStr);
		} else {
			System.out.println(" There are no duplicates ");
		}
	}
}
