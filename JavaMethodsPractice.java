package week4Tuesday;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3 };
		printArray(arr);

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double x = in.nextDouble();
		System.out.println("Enter the second number:");
		double y = in.nextDouble();
		System.out.println("Enter the third number:");
		double z = in.nextDouble();
		System.out.println("The average value is ");
		average(x, y, z);

		System.out.println();
		printOutLove("I love Java"); // We need to use arguments

		helloWorld(); // Calling the method
		helloWorld(); // You may call it multiple times
		System.out.println("Adding the Numbers");
		addnumbers(4, 7, 9);
		System.out.println("Area of the Triangle");
		areaOfTriangle(6, 5);
		
		String[] names = { "Ahmet", "Mehmet", "Ali" };
		printArray(names);

	}

	public static void printArray(int[] source) { // Not overloading
		System.out.println(Arrays.toString(source)); // Print the values
	}

	public static void printArray(String[] source) {
		System.out.println(Arrays.toString(source)); // Overloading
	}

	public static void printOutLove(String print) { // Using a parameter
		System.out.println(print + " so much!" + "\n");
	}

	public static void average(double x, double y, double z) {
		System.out.println((x + y + z) / 3);
	}

	public static void helloWorld() {
		System.out.println("Hello World!");
	}

	public static void addnumbers(int a, int b, int c) {
		int addition = a + b + c;
		System.out.println(addition);

	}

	public static void areaOfTriangle(int base, int height) {
		System.out.println((base * height) / 2);
	}

}