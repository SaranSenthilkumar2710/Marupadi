package marupadi;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;

public class prog52_ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("Given String :" + str);
		System.out.print("Reversed String :");
		recReverse(str);
	}

	public static void recReverse(String input) {
		// Checking if the input string is null or empty
		if (input == null || !input.contains(" ")) {
			System.out.print(input);
			return;
		}
		// Split the input string using split method with space and put it in temp array
		String[] temp = input.split("\\s+");
		// Print the last element of temp array and a space
		System.out.print(temp[temp.length - 1] + " ");

		// Call the method recursively by passing a string
		// (using join method framing the string without the last word)
		recReverse(String.join(" ", Arrays.asList(temp).subList(0, temp.length - 1)));
	}
}
