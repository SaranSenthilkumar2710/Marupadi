/* 19) Evaluate the following expression on paper and on program and understand the
difference a+=a++ + ++a + –a + a–; when a=28 */

package marupadi;

import java.util.Scanner;

public class prog19_EvaluateExpression {
	public static void main(String[] args) {
		// Getting input number from the user
		System.out.println("Enter the value of a : ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		// (a+=a++ + ++a + -a + a-) is showing error
		a += a++ + ++a + -a + a--;
		System.out.println("Result of Expression (a += a++ + ++a + -a + a--)");
		System.out.println(a);
	}
}
