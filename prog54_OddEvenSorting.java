/* 54) Write a program to sort the elements in odd positions in descending order and
elements in ascending order.*/
package marupadi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class prog54_OddEvenSorting {

	public static void main(String[] args) {
		int n;
		// Getting Input length of the array
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the lenght of the Array ");
		n = in.nextInt();

		// Initialize the array with the given length
		int[] array = new int[n];
		
		
		List<Integer> oddList= new ArrayList<Integer>();
		List<Integer> evenList= new ArrayList<Integer>();
		
		// Get the elements one by one and put it in array
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}

		System.out.println("After Sorting : ");
		
		//Adding odd position element into an arrayList and sort it using Collections.reverseOrder() method
		for (int j = 0; j < n; j = j + 2) {
			oddList.add(array[j]);
		}
		Collections.sort(oddList,Collections.reverseOrder());
		System.out.println(oddList);
		
		//Adding even position element into an arrayList and sort it using Collections.sort method
		for (int i = 1; i < n; i = i + 2) {
			evenList.add(array[i]);
		}
		Collections.sort(evenList);
		System.out.println(evenList);
	}
}
