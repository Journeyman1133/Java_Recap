package week4Saturday;

public class EvenOrNot {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		if (isEven(112)) {
			System.out.println("The Number is Even");
		} else {
			System.out.println("The Number is not Even");
		}
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
}
