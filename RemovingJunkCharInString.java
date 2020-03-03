package week5MondayRecap;

public class RemovingJunkCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(610)-653-3747";

		// In that case we need use regular expression
		// Regular expression [^a-zA-Z0-9]

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
