package string;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		CharSequence c = "d";
		int count = str.length() - str.replace(c, "").length();
		System.out.println(count);
	}
}
