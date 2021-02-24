package string;

public class SubstringExample {
	public static void main(String[] args) {
		String[] arr = new String[2];
		String str = "SanjayKumar";
		arr[0] = str.substring(0, 6);
		//System.out.println(firstgName);
		System.out.println(arr[0]);
		arr[1] = str.substring(6, 11);
		//System.out.println(lastName);
		System.out.println(arr[1]);
	}
}
