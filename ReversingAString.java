package week4Saturday;

public class ReversingAString {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		reverseString("Silicone Labs");

	}

	public static void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
