/* 28) Program to Check Whether a Number is Even or Odd */
package marupadi;

import java.util.Scanner;

public class prog28_OddEven {
	public static void main(String[] args) {
		// Getting Input number
		System.out.println("Enter Number:\n");
		Scanner in1 = new Scanner(System.in);
		int myNum = in1.nextInt();
		// initialise result variable as ODD
		String result = "Odd";

		// checking given number is even using % operator and if the result is 0 then
		// assign as Even
		if (myNum % 2 == 0) {
			result = "Even";
		}
		// Print the result
		System.out.println("The Given Number " + myNum + " is an " + result + " number");
	}

}
