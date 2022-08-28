/* 51) Write a program to display the number in reverse order without use of String
functions.*/
package marupadi;

import java.util.Scanner;

public class prog51_ReverseNumber {
public static void main(String[] args) {
	// Getting Input number
	System.out.println("Enter Number :");
	Scanner in = new Scanner(System.in);
	int input = in.nextInt();
	int remainder,reverse=0;
	System.out.println("Given Number :"+input);
	/* Logic:calcualte the remainder of given number gives the last digit
	then frame the reverse number by multiplying it with 10 and adding the cuming remainder to it.
	trim the input number by div it wit 10, cuts off of the last digit. process continues till number becomes 0 */
	while(input>0) {
		remainder = input%10;
		reverse = reverse*10 + remainder;
		input=input/10;
	}
	//Print the result
	System.out.println("Reverse of given number :" +reverse);
}
}
