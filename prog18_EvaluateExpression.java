/* 18) Evaluate the following expression on paper and on program and understand the
difference
i)++a-b– ii)a%b++   iii)a*=b+5  iv)x=69>>>2 */

package marupadi;

import java.util.Scanner;

public class prog18_EvaluateExpression {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = in.nextInt();
		System.out.println("Enter value of b:");
		int b = in.nextInt();
		int x;
		// i) x=++a-b-; Invalid expression because at the end it has single - sign which
		// is not valid
		// ii) a%b++;
		x = a % b++;
		System.out.println(x);

		// iii)a*=b+5
		a *= b + 5;
		System.out.println(a);

		// iv)x=69>>>2
		x = 69 >>> 2;
		System.out.println(x);
	}
}
