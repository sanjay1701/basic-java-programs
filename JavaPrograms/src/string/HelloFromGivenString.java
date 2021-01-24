package string;

public class HelloFromGivenString {
	public static void main(String[] args) {
		String str = "ahceclwlxo";
		String[] newStr = str.split("");
		for(int i=1; i<newStr.length;i=i+2) {
			System.out.print(newStr[i]);
		}
		System.out.println();
		for(int i=1; i<newStr.length;i=i+2) {
			System.out.print(newStr[i].toUpperCase());
		}
	}
}
