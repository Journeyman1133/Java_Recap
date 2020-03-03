package week5MondayRecap;

public class Continue_Break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {
			if (i == 1 || i == 4) {
				continue; // Runs the i without printing
			}
			System.out.println("Value of i = " + i);
		}
	}

}
