package week4Saturday;

public class SumOfTheDigits {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		addDigits2(213);
		System.out.println(addDigits1(456));
	}

	public static int addDigits1(int n) {

		// this can be any number

		int result = 0;
		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}

	public static void addDigits2(int n) {
		// this can be any number
		int result = 0;
		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		System.out.println(result);
	}
}
