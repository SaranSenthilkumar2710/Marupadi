/*45) Java Program to left rotate the elements of an array*/

package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog45_Sum_Of_Array {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// Getting Input length of the array
		System.out.println("Enter the length of the array:");
		int length = s.nextInt();
		// Initialize the array with the given length
		int[] myArray = new int[length];

		// Get the elements one by one and put it in array
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < length; i++) {
			myArray[i] = s.nextInt();
		}

		System.out.println("Given Array : " + Arrays.toString(myArray));
		// find the largest element using sum method of Arrays class
		System.out.println("Sum of Array : " + Arrays.stream(myArray).sum());
	}
}