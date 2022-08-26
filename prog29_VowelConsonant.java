/* 29) Program to Check Whether a Character is a Vowel or Consonant */
package marupadi;

import java.util.Scanner;

public class prog29_VowelConsonant {

	public static void main(String[] args) {
		// Getting the input character
		System.out.println("Enter a Charecter:\n");
		Scanner in1 = new Scanner(System.in);
		char myChar = in1.next().charAt(0);
		// Assigning String values as follows
		String result = "Consonent";
		String vowels = "AEIOU";
		// using indexOf() method in string returns the index of given char value, so if
		// it is greater or equal to 0 then the given char is available in the string
		// VOWEL , so assigning the result as VOWEL
		if (vowels.indexOf(Character.toUpperCase(myChar)) >= 0) {
			result = "Vowel";
		}
		//Print the Result.
		System.out.println("The Given Character '" + myChar + "' is a " + result);

	}

}
