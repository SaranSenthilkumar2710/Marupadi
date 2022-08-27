/* 40) Java Program to print the number of elements present in an array*/
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog40_NoOfElements {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		// Getting Input length of the array
		System.out.print("Enter the lenght of the Array ");
		n = in.nextInt();
		// Initialize the array with the given length
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		// Get the elements one by one and put it in array
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		// find the largest element using count method of Arrays class
		long count = Arrays.stream(array).count();
		System.out.println("Length of the array : " + count);
	}
}
