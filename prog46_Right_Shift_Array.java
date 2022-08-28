/*46) Java Program to rotate the elements of an array in the right direction
 */
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog46_Right_Shift_Array {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// Getting Input length of the array
		System.out.println("Enter the length of the array:");
		int length = s.nextInt();
		// Initialize the array with given length
		int[] myArray = new int[length];
		int[] rightShiftedArray = new int[length];
		System.out.println("Enter the elements of the array:");
		// Get the elements one by one and put it in array
		for (int i = 0; i < length; i++) {
			myArray[i] = s.nextInt();
		}

		// Left rotate the elements by changing the index of the array and put it in
		// resultant array

		for (int i = 0; i < myArray.length; i++) {
			if (i == 0) {
				rightShiftedArray[i] = myArray[myArray.length - 1];
			} else
				rightShiftedArray[i] = myArray[i - 1];

		}
		//Print the result
		System.out.println(" Given Array : " + Arrays.toString(myArray));
		System.out.println("Right shifted Array : " + Arrays.toString(rightShiftedArray));
	}
}