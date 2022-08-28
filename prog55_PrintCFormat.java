/* 55) Write a program to print the alphabet 'C' with the stars based on the given numbers */
package marupadi;

public class prog55_PrintCFormat {
public static void main(String[] args) {
	//initialize rows as 5
	int rows = 5;
	//Iterating till the rows
	//1. Print first row
	//2. Print star only in the first column and the last row
	for(int i=0;i<rows;i++) {
		System.out.print("*");
		for(int j=0;j<rows-1;j++) {
			 if (i == 0 || i == rows - 1)
	                System.out.print("*");
	            else
	                continue;
		}
		System.out.println();//to go next line
	}
}
}
