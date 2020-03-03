package week4Saturday;

public class DuplicateElementIntArray {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int myArray[] = { 1, 3, 5, 5, 6, 6, 6, 7 };
		findDuplicate(myArray);
	}

	public static void findDuplicate(int myArr[]) {
		for (int i = 0; i < myArr.length; i++) {
			for (int j = i + 1; j < myArr.length; j++) {
				if (myArr[i] == myArr[j]) {
					System.out.println(myArr[j]);

				}
			}
		}
	}
}
