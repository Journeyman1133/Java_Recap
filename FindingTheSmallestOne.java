package week4Tuesday;

import java.util.Scanner;

public class FindingTheSmallestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		double x = in.nextDouble();
		System.out.print("Input the second number: ");
		double y = in.nextDouble();
		System.out.print("Input the third number: ");
		double z = in.nextDouble();
		System.out.print("Smallest number is ");
		smallest(x, y, z);
	}

	public static void smallest(double x, double y, double z) {
		System.out.println(Math.min(Math.min(x, y), z));

	}
}
