/* 38) Java Program to print the largest element in an array */
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog38_LargestElement {
	public static void main(String[] args) {
		int n;
		Scanner in1 = new Scanner(System.in);
		// Getting Input length of the array
		System.out.print("Enter the length of the Array :");

		n = in1.nextInt();
		// Initialize the array with the given length
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		// Get the elements one by one and put it in array
		for (int i = 0; i < n; i++) {
			array[i] = in1.nextInt();
		}

		// find the largest element using max method of Arrays class
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println("Largest element of the array :  " + max);

	}
}
