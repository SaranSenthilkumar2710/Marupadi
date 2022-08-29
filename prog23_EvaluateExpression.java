/* 23) What is the value of x1 if x=5 ? x1=++x – x++ + –x  */
package marupadi;

import java.util.Scanner;

public class prog23_EvaluateExpression {
	public static void main(String[] args) {
		// Getting input number from the user
		System.out.println("Enter the value of x : ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int x1 = (++x - x++ + -x);

		System.out.println("Result of Expression [x1=(++x - x++ + -x)]");
		System.out.println(x1);
	}
}
