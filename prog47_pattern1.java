/* 47) Java Program to print series*/
package marupadi;

public class prog47_pattern1 {
	public static void main(String args[]) {
	
		String rsltStr="";
		int spc = 8;
		for (int i = 0; i <=9; i++) {
			 // prefixing space 
			for (int j=1;j<=spc;j++) {
				System.out.print(" ");
			}
			//print up to the limit
			for ( int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			//print from limit to 1
			for ( int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("\n");
			spc--;
		}

	}
}