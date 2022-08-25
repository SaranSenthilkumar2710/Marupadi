/* 10) Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum */
package marupadi;

import java.util.Arrays;

public class prog10_AlternateSorting {
	static void alternateSort(int array1[], int n) {
		// Sort the given input array
		Arrays.sort(array1);

		// Print alternatively first large no and second print the small no and so on
		int i = 0, j = n - 1;
		while (i < j) {
			System.out.print(array1[j--] + " ");
			System.out.print(array1[i++] + " ");
		}

		//  Print the last middle element if the total element in array is odd
		if (n % 2 != 0)
			System.out.print(array1[i]);
	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = array1.length;
		alternateSort(array1, n);
	}

}
