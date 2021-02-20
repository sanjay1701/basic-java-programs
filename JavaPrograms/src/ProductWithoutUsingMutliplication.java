
public class ProductWithoutUsingMutliplication {

	public static int multiply(int a,int b) {
		int sum = 0;
		for(int i=1;i<=a;i++)
			sum=sum+b;
		return sum;
	}
	public static void main(String[] args) {
		int a = 6, b = 3;
		int result = multiply(a,b);
		System.out.println("Product Result of " +a +" and " + b + " is: " +result);
	}
}
