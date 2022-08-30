package marupadi;

import java.util.Scanner;

public class prog31_QuadraticEquation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		double root1, root2, imaginary, discriminant;
		System.out.print("Please Enter the Values of a, b, c of Quadratic Equation : ");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		discriminant = (b * b) - (4 * a * c);

		if (discriminant > 0) {
			root1 = (-b + Math.sqrt(discriminant) / (2 * a));
			root2 = (-b - Math.sqrt(discriminant) / (2 * a));
			System.out.println("\nTwo Distinct Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
		} else if (discriminant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println("\nTwo Equal and Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
		} else if (discriminant < 0) {
			root1 = root2 = -b / (2 * a);
			imaginary = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("\nTwo Distinct Complex Roots Exists: \nRoot1 = " + root1 + " + " + imaginary
					+ " \nRoot2 = " + root2 + " - " + imaginary);
		}
	}
}
