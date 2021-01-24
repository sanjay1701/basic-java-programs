package string;

public class CountWords {
	public static void main(String[] args) {

		String str = "This this is is done by Saket Saket";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i) == ' ') &&  (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of words in string : " +count);
	}
}

