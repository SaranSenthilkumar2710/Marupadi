/* 53) Write a program to give the following output for the given input */
package marupadi;

public class prog53_AlphabetNoOutput {
	public static void main(String[] args) {
		String input = "a3b5";
		// Print the given input
		System.out.println("Given Input :" + input);
		// Split and put the char into array
		String[] arr = input.split("");
		System.out.print("Result : ");
		// Logic:for each character, if it is alphabet print it once, if it is number
		// print the number same number of times
		for (String character : arr) {
			char ch = character.charAt(0);
			// System.out.println(character + " ");
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				System.out.print(ch);
			} else {
				int no = ch - 48;
				for (int i = 1; i <= no; i++) {
					System.out.print(no);
				}
			}
		}
	}
}
