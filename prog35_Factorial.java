/* 35) Program to Find Factorial of a Number and the factorial number's sum of digits.*/
package marupadi;

import java.util.Scanner;

public class prog35_Factorial {

	public static void main(String[] args) {

		int myFact = 1, myfactTmp, sTmp = 0, sum = 0;
		int i = 1;
		// Getting input number
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int myNum = in1.nextInt();

		// finding factorial of given no
		while (i <= myNum) {
			myFact = myFact * i;
			i++;
		}
		myfactTmp = myFact;
		// sum of the factorial of the given number
		while (myfactTmp > 0) {
			sTmp = myfactTmp % 10;
			sum = sum + sTmp;
			myfactTmp = myfactTmp / 10;
		}
		System.out.println("Factorial of " + myNum + " : " + myFact + "\nSum of digits is " + sum);
	}
}
