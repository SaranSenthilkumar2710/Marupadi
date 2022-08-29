/* 8) Write a program to demonstrate the functionalities of static keyword.*/
package marupadi;

public class prog8_StaticKeyword {

	// static variable
	static int a = 10;
	static int b;

	// static block
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

	// static method
	static void statMethod() {
		System.out.println("from static method");
	}

	// Static class
	static class staticClass {
		static String str = "from static class";

		// non-static method
		public void disp() {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		System.out.println("From main method without creating object:");
		System.out.println("Value of Static variable a : " + a);
		System.out.println("Value of Static variable b : " + b);
		// calling statMethod without creating
		// any object of class Test
		System.out.println("Calling Static method, without object :");
		statMethod();
		System.out.println("Calling Static class :");
		prog8_StaticKeyword.staticClass obj = new prog8_StaticKeyword.staticClass();
		obj.disp();

	}

}
