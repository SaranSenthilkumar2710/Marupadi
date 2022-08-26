/* 24) Program to Find ASCII Value of a Character */

package marupadi;

import java.util.Scanner;

public class prog24_ASCIIValue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Character :");
		// Getting input character
		char myChar = in.next().charAt(0);
		
		// Getting ASCII value of the given character
		int charAscii = myChar;

		System.out.println("ASCII value of " + myChar + " = " + charAscii);

	}

}
