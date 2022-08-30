package marupadi;

/* 57) Write a program to print the following output for the given input. You can assume
the string is of odd length */
import java.util.Scanner;

public class prog57_NumberXFormat {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		// Getting the Input number from the user
		int size = in.nextInt();
		int cnt = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || i + j == size - 1) {
					System.out.print(j+1);
				} else {
					System.out.print(" ");
				}
			}
			cnt = cnt + 1;
			System.out.println();
		}
	}
}
