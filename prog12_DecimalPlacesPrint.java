/* 12) Write a program to print the number 7.50 without using String. */

package marupadi;

public class prog12_DecimalPlacesPrint {
	public static void main(String[] args) {
		float f = 7.5232312f;
		System.out.println("Input Float Number : "+f);
		// Print float upto 2 decimal places using printf and '%.2f'
		System.out.printf("Float upto 2 decimal places: %.2f", f);
	}
}
