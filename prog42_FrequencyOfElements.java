/* 42) Java Program to find the frequency of each element in the array */
package marupadi;

import java.util.Arrays;
import java.util.Scanner;

public class prog42_FrequencyOfElements {

	public static void main(String[] args) {

		int n;
		Scanner in = new Scanner(System.in);
		// Getting Input length of the array
		System.out.print("Enter the length of the Array ");
		n = in.nextInt();
		// Initialize the array with the given length
		int[] array1 = new int[n];
		System.out.println("Enter the elements of the array: ");
		// Get the elements one by one and put it in array
		for (int i = 0; i < n; i++) {
			array1[i] = in.nextInt();
		}
		
		// array to store the result
		String[] resArray = new String[n];

		// sort the given array
		Arrays.sort(array1);
		int aCount = 1;
		int rcount = 0;
		// Logic:Iterating array if the element is repeating,
		// Have a counter , increament that if element is repeating
		// Have an array to print the result
		for (int i = 0; i < array1.length; i = i + aCount) {
			aCount = 1;
			for (int j = i + 1; j < array1.length; j = j + 1 + aCount) {
				if (array1[i] == array1[j]) {
					aCount++;
				}
			}
			resArray[rcount] = array1[i] + "|" + aCount;
			rcount++;
		}
		System.out.println("Frequency of each element in Array is ");
		// Print the resultant array
		for (int j = 0; j < resArray.length; j++) {
			if (resArray[j] != null)
				System.out.println(resArray[j]);
		}

	}
}
