package week4Saturday;

import java.util.Arrays;

public class PrintingAnArray {

	public static void arrayPrinter(int[] arrayParameter) {

		for (int i = 0; i < arrayParameter.length; i++) {

			System.out.println(arrayParameter[i]);

		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] arrayArgument = { 9, 8, 7, 6, 5, 4, 3 };

		arrayPrinter(arrayArgument);

	}
}
