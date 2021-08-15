import java.util.Scanner;

public class NumOfDigit {
	/**
	 * Function to find total digits in a number
	 * @param num
	 */
	public static void findDigitsInNum(int num) {
		int count=0;
		if(num<0) {
			num=num*-1;
		}
		else if(num==0) {
			num=1;
		}
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		findDigitsInNum(num);
	}
}
