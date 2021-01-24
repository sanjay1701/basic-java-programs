import java.util.Scanner;

public class Fibonacci {

	private static void findFibonacci(int num) {
		int a=0,b=0,c=1;
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a + " ");
		}

	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		findFibonacci(num);
	}
}
