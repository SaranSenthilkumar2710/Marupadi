/* 59) Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1. */
package marupadi;

import java.util.Scanner;

public class prog59_SubString {
	public static void main(String[] args) {
		//Getting Input String
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("Enter SubString : ");
		//Getting Substring
		String subString = input.nextLine();
		int index;
		//calculate index using indexOf method, 
		//it returns the index of the sub string starting position
		//it returns -1 if substring not available
		index = str.indexOf(subString);
		if (index > 0)
			System.out.println("Given substring is available with start index : " + index);
		else
			System.out.println("Given substring is not available and hence returns : " + index);
	}

}
