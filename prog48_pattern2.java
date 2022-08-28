/* 48) Java Program to print the series */
package marupadi;

public class prog48_pattern2 {
	public static void main(String args[]) {
	
		int spc = 9;
		for (int i = 9; i >0; i--) {
			 // prefixing space 
			for (int j=1;j<=spc;j++) {
				System.out.print(" ");
			}
			//print up to the limit
			for ( int j=i;j<=9;j++)
			{
				System.out.print(j);
			}
			//print from limit to 1
			int k=8;
			for ( int j=i+1;j<=9;j++)
			{
				System.out.print(k);
				k--;
			}
			
			spc--;
			System.out.println("\n");
		}

	}
}