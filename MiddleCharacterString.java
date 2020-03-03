package week4Tuesday;

public class MiddleCharacterString {

	public static void main(String[] args) {
		String str = "Eminem";
		findingMiddle(str);
	}

	public static void findingMiddle(String str) {

		int position;
		int length;

		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		System.out.println(str.substring(position, position + length));
	}
}
