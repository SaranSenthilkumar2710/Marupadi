/*Java Program to left rotate the elements of a multidimensional array.*/
package marupadi;

import java.util.Scanner;

public class prog11_LeftRotation {
	public static void main(String[] args) {

		// Initialize array
		int[] array1 = new int[] { 1, 2, 3, 4, 5 };

		// Print the original array
		System.out.println("Original array: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("\n\nEnter number of times array has to rotate: ");
		Scanner in = new Scanner(System.in);
		// Get input no from the user
		int n = in.nextInt();

		// Rotate the given array by n times toward left
		for (int i = 0; i < n; i++) {
			int j, firstTemp;
			// Stores the first element of the array to temp
			firstTemp = array1[0];

			// Shift element of array by one 
			for (j = 0; j < array1.length - 1; j++) {
				array1[j] = array1[j + 1];
			}
			
			// First element of array will be added to the end
			array1[j] = firstTemp;
		}

		// Print the array after rotation
		System.out.println("\nResult array after left rotation: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
