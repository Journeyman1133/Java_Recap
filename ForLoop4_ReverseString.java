package week5MondayRecap;

import java.util.Scanner;

public class ForLoop4_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word = in.next();
		System.out.println("Reverse String: ");
		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed = reversed + word.charAt(i);
		}
		System.out.print(reversed);
	}

}
