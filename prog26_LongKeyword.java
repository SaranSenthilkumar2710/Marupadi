/* 26) Program to Demonstrate the Working of Keyword long */
package marupadi;

public class prog26_LongKeyword {
	public long longMethod() {
		return 10L;
	}

	public static void main(String[] args) {
		prog26_LongKeyword obj = new prog26_LongKeyword();

		// double value cannot directly assign to long hence casting it with long
		long doubleVal = (long) 10.5;

		// float value cannot directly assign to long hence casting it with long
		long floatVal = (long) 10f;

		// char value typecast the character implicitly to long type and returns the
		// corresponding ASCII value.
		long charVal = 'a';

		System.out.println("Double to Long value : " + doubleVal);
		System.out.println("Float to Long value : " + floatVal);
		System.out.println("Char to Long value : " + charVal);

		// Call longMethod which returns long value
		System.out.println("Method Returns Long value :" + obj.longMethod());

		// Printing the maximum and minimum value allowed in long variable
		// Max value is equal to 2^63 - 1
		System.out.println("The Maximum value allowed in long variable is : " + Long.MAX_VALUE);

		// Min value is equal to -2^63
		System.out.println("The Minimum value allowed in long variable is : " + Long.MIN_VALUE);
	}
}
