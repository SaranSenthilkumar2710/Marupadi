/* 2) Write a program to print a letters from the user input character to 'Z' without using
strings. */

package marupadi;

import java.util.Scanner;

public class prog2_AlphabetsPrint {

	public static void main(String[] args) {
		System.out.println("Enter the Alphabet");
		Scanner in = new Scanner(System.in);
		// Getting input char from the user
		char myChar = in.next().charAt(0);
		char endChar = 'Z';
		char ch;
		// checking whether given char is lower case if so print the series in lowercase
		if ((int) myChar >= 97) {
			endChar = 'z';
		}
		for (ch = myChar; ch <= endChar; ch++) {
			System.out.print(ch);
		}

	}

}
