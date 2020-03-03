package week4Thursday;

import java.util.ArrayList;

public class MoreMethodsPractices {

	public static String helloWorld() {
		return "Hello Class!";
	}

	int square(int number) {
		return number * number;
	}

	public static String helloSiliconeLabs() {
		return "Hello \"Silicone Labs\" Class!";
	}

	String printOut(String print) {
		return print + "!";
	}

	static ArrayList<String> arraylistMethod() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Ammar");
		return arrayList;
	}

	// Overloading Methods
	static int calculate1(int a, int b) {
		return a + b;
	}

	static int calculate1(int a, int b, int c) {
		return a + b + c;
	}

	static int calculate1(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// helloWorld(); // It should print
		System.out.println(helloWorld() + " How are you?");

		MoreMethodsPractices object = new MoreMethodsPractices();
		System.out.println(object.square(7)); // Need to make with object

		System.out.println(helloSiliconeLabs());

		System.out.println(object.printOut("Slack"));

		System.out.println(arraylistMethod() + " can do anything!!");

		// Overloading Methods
		System.out.println(calculate1(5, 6));
		System.out.println(calculate1(5, 6, 7));
		System.out.println(calculate1(4, 5, 6, 7));
	}

}
