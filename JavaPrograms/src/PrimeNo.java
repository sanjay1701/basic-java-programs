
public class PrimeNo {
	/**
	 * Function to find prime number
	 * @param n - user input
	 */
	public static void isPrime(int n) {
		int flag=0;
		if(n==0||n==1) {
			System.out.println(n+ " is not prime");
		}
		else {
			for(int i = 2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println(n+ " is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(n+ " is prime");
		}
	}

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			isPrime(i);
		}
	}
}
