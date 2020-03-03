package week5MondayRecap;

public class DecreasedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int outer = 30; outer >= 1; outer--) {
			for (int inner = 1; inner <= outer; inner++) {
				System.out.print(inner + " ");
			}
			System.out.println();
		}
	}

}
