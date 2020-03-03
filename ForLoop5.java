package week5MondayRecap;

public class ForLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printing odd numbers
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}

		System.out.println();

		for (int j = 1; j <= 20; j++) {
			System.out.println(j);
			if (j % 5 == 0) {
				System.out.println("Hey Ammar!");
			}
		}
	}
}
