/* 20) Evaluate the following expression on paper and on program and understand the
difference x = x++ * 2 + 3 * –x; */
package marupadi;

import java.util.Scanner;

public class prog20_EvaluateExpression {
	public static void main(String[] args) {
		// Getting input number from the user
		System.out.println("Enter the value of x : ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		x = x++ * 2 + 3 * -x;
		System.out.println("Result of Expression (x = x++ * 2 + 3 * -x;)");
		System.out.println(x);
	}
}
