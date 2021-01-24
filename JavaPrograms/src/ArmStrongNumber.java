import java.util.Scanner;

public class ArmStrongNumber {

	private static void checkArmStrong(int n) {
		int num = 0,rem=0, temp=n;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			num=num+(rem*rem*rem);  //rem is multiplied based of no of digits
		}
		if(temp==num) {
			System.out.println("ArmStrong number");
		}
		else{
			System.out.println("Not ArmStrong number");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		checkArmStrong(n);
	}
}
