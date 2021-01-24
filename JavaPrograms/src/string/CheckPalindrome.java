package string;

public class CheckPalindrome {
	public static void main(String[] args) {
		String original = "abba";

		//Approach-1
		String reverse = "";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+ original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

		//Approach -2
		/*StringBuilder sb = new StringBuilder(original);
		sb = sb.reverse();
		if(original.equals(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");*/
	}
}
