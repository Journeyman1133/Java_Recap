package week4Tuesday;

import java.util.Scanner;

public class RepeatingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check = true;
		while (check) {

			Scanner in = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = in.nextLine();
			// System.out.println(name);
			if (name.equalsIgnoreCase("Ammar")) {
				check = false;
				System.out.println("Yes, the name is Ammar!");
			}
		}
	}
}