/* 36) Java Program to print the elements of an array present on even position */
package marupadi;

import java.util.Scanner;

public class prog36_EvenPosition {

	public static void main(String[] args) {
		int n;
		// Getting Input length of the array
		Scanner in1 = new Scanner(System.in);
		System.out.print("Enter the lenght of the Array ");
		n = in1.nextInt();

		// Initialize the array with the given length
		int[] array = new int[n];

		// Get the elements one by one and put it in array
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < n; i++) {

			array[i] = in1.nextInt();
		}

		System.out.println("Even position of the Array are ");
		// find the even position with index starts from 0 and by jumping of 2 and print the result
		for (int i = 1; i < n; i = i + 2) {
			System.out.println(array[i]);
		}
	}
}
