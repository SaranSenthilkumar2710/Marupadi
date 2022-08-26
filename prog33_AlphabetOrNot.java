/* 33) Program to Check Whether a Character is an Alphabet or not */
package marupadi;

import java.util.Scanner;

public class prog33_AlphabetOrNot {
	public static void main(String[] args) {
		// Getting input character from the user
		System.out.println("Enter Character:");
		Scanner in = new Scanner(System.in);
		char myChar = in.next().charAt(0);

		// checking that given char is alphabet or not and print the result
		if ((myChar >= 'a' && myChar <= 'z') || (myChar >= 'A' && myChar <= 'Z')) {
			System.out.println("The given character " + myChar + " is an alphabet");
		} else {
			System.out.println("The given character " + myChar + " is not an alphabet");
		}

	}
}
