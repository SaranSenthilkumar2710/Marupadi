
/* 1) Write a single program to generate a multiplication and subtraction table for a given
number.*/
package marupadi;

import java.util.*;

public class prog1_MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter the Number :");
		Scanner in = new Scanner(System.in);
		//Get input no from the user
		int mynum = in.nextInt();
		System.out.println("Enter the Range :");
		//Get range input from the user
		int range1 = in.nextInt();
		System.out.println("-----------------------");
		System.out.println("Multiplication Table");
		//Iterate loop till range and do multiplication logic and display in multiplication table format
		for (int i = 1; i <= range1; ++i) {
			System.out.printf("%d * %d = %d \n", mynum, i, mynum * i);
		}
		System.out.println("-----------------------");
		System.out.println("Subraction Table");
		//Iterate loop till range and do subtraction logic and display in subtraction table format
		for (int i = 1; i <= range1; ++i) {
			System.out.printf("%d - %d = %d \n", mynum, i, mynum - i);
		}
		System.out.println("-----------------------");
	}
}
