/* 5) Write a program to print the following pattern based on the alphabet. */
package marupadi;

import java.util.Scanner;

public class prog5_AlphabetPattern {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter the Alphabet");
		Scanner in = new Scanner(System.in);
		// Getting the Input char from the user
		char myStr = in.next().charAt(0);
		
		// Convert char to int
		int chrNum = (int) myStr;
		
		// Iterating the loop in decreasing order to print the format given
		for (i = chrNum; i > 64; i--) {
			for (j = 64; j < i; j++) {
				System.out.print((char) (i));
			}
			System.out.println("");
		}

	}

}
