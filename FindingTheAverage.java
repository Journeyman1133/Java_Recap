package week4Tuesday;

import java.util.Scanner;

public class FindingTheAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		average();
	}

	public static void average() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		double x = in.nextDouble();
		System.out.print("Input the second number: ");
		double y = in.nextDouble();
		System.out.print("Input the third number: ");
		double z = in.nextDouble();
		System.out.print("The average value is " + "\n");
		System.out.println((x + y + z) / 3);
	}

}
