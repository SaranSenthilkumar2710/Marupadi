/*41) Java Program to copy all elements of one array into another array*/
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog41_CopyElements {
	public static void main(String[] args) {
		int n;
		// Getting Input length of the array
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the Array ");

		n = in.nextInt();
		// Initialize 2 arrays with the given length
		int[] array1 = new int[n];
		System.out.println("Enter the elements of the array: ");
		int[] array2 = new int[n];
		// Get the elements one by one and put it in array
		for (int i = 0; i < n; i++) {

			array1[i] = in.nextInt();
		}
		// Using clone() method copy the array1 elements to array2
		array2 = array1.clone();
		System.out.println("Elements of the second Array :");
		// Print the result
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
