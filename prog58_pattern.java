/*  58) Write a program to print the following pattern for the given input number */
package marupadi;

import java.util.Scanner;

public class prog58_pattern {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for (int j = i; j < input; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("--");
			}
			for (int l = i; l < input; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 0; a < input - 1; a++) {
			for (int b = 0; b <= a + 1; b++) {
				System.out.print("*");
			}
			for (int c = a; c < input - 2; c++) {
				System.out.print("--");
			}
			for (int d = 0; d <= a + 1; d++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}