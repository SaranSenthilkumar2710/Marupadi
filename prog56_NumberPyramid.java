/* 56) Write a program to make such a pattern like a pyramid with numbers increased by 1.*/
package marupadi;

public class prog56_NumberPyramid {
	public static void main(String[] args) {
		// Getting the range
		int rows = 4, number = 1;
		for (int i = 1; i <= rows; i++) {
			for (int k = rows; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				++number;
			}
			System.out.println();
		}
	}

}
