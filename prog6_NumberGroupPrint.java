/* 6) Write a program for the following. Let consider 20 students in a class with the roll no
101-120. We are going to split them into four groups. 
Based on their roll number we are going to split them with the following logics.*/

package marupadi;

public class prog6_NumberGroupPrint {

	public static void main(String[] args) {
		// Initializing starting no 101
		int startNum = 101;
		int i;
		int j;
		int cnt = 1;
		// Iterating the loop to split into groups using counter 
		for (i = startNum; i <= 104; i++) {
			cnt = cnt + 1;
			System.out.println("Group :" + cnt);
			// Iterating the loop to print no's in each group with jump of 4
			for (j = i; j <= 120; j = j + 4) {
				System.out.println(j);
			}

		}

	}

}
