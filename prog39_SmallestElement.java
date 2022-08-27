/* 39) Java Program to print the smallest element in an array */
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog39_SmallestElement {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		// Getting Input length of the array
		System.out.print("Enter the length of the Array : ");

		n = in.nextInt();
		// Initialize the array with the given length
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		// Get the elements one by one and put it in array
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		// find the largest element using min method of Arrays class
		int min = Arrays.stream(array).min().getAsInt();
		System.out.println("Smallest element of the array :  " + min);

	}
}
