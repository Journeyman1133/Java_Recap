package week5MondayRecap;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10; // 5
			num = num / 10; // 1234
		}
		System.out.println("Reversed number is: " + rev);

		// Second solution
		int num1 = 12345;
		System.out.println("Second Solution reversed: " + new StringBuffer(String.valueOf(num1)).reverse());

	}

}
