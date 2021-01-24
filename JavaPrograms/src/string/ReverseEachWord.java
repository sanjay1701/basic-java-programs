package string;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "Java  a is programming language";
		String[] newStr = str.split(" ");
		String reverseString = "";
		for(int i=0;i<newStr.length;i++) {
			String word = newStr[i];
			String revwords = "";
			for(int j=word.length()-1;j>=0;j--) {
				revwords = revwords+word.charAt(j);
			}
			reverseString = reverseString + revwords + " ";

			/*StringBuilder sb = new StringBuilder( newStr[i]);
			sb = sb.reverse();
			reverseString = reverseString + sb.toString() + " ";*/
		}
		System.out.println(reverseString);
	}
}
